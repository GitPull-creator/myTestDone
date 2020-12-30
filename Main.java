import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите выражение");
        Scanner sc = new Scanner(System.in);
        Inc s = new Inc();
        String input = sc.nextLine();
        String[] strings = input.split(" ");
        try {
            s.setOp(strings[1]);
            s.setFlag((Check.isDigit (strings[0]) || Check.isDigit (strings[2])));
            try {
                if (s.getFlag()) {
                    s.setNum1(Integer.parseInt(strings[0]));
                    s.setNum2(Integer.parseInt(strings[2]));
                    if ((s.getNum1() > 0 & s.getNum1() <= 10) && (s.getNum2() > 0 & s.getNum2() <= 10)) {
                        System.out.println(Solutions.get(s.getNum1(), s.getNum2(), s.getOp()));
                    } else {
                        System.out.println("Используйте числа числа от 1 до 10");
                    }
                }else {
                    RomanNumbers[] roman = RomanNumbers.values();
                    for (int i = 0; i < roman.length; i++) {
                        if (strings[0].equals(roman[i].name())) {
                            s.setArabic1(roman[i].getValue());
                        }
                    }
                    for (int j = 0; j < roman.length; j++) {
                        if (strings[2].equals(roman[j].name())) {
                            s.setArabic2(roman[j].getValue());
                        }
                    }
                    if ((s.getArabic1() > 0 & s.getArabic1() <= 10) && (s.getArabic2() > 0 & s.getArabic2() <= 10)) {
                       s.setNumber(Solutions.get(s.getArabic1(), s.getArabic2(), s.getOp()));
                    }else {
                        System.out.println("Введите числа от 1 до 10");
                    }
                    StringBuilder string = new StringBuilder();
                    for (int i = 14; i >= 0; i--) {
                        if (s.getNumber() >= roman[i].getValue()) {
                            s.setNumber(s.getNumber()-roman[i].getValue());  
                            string.append(roman[i].name()); }
                            }
                    System.out.println(string);
                }
            }catch (NumberFormatException e){
                System.out.println("Выражение должно быть написано целыми арабскими числами, либо римскими числами");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Неверный формат данных"); }
    }
}


















