public class Solutions {
    public static int get(int a, int b, String op) {
        switch (op) {
            case "/":
                return a / b;
            case "*":
                return a * b;
            case "+":
                return a + b;
            case "-":
                return a - b;
            default:
                System.out.println("Используйте знак + - * или /");
                return 0;
        }
    }
}
