import java.util.Scanner;

public class Inc {
    private boolean flag = false;
    private int num2;
    private int num1;
    private int arabic1 = 0;
    private int arabic2 = 0;
    private String op = "";

    public void setOp(String op){
        this.op = op;
    }

    public String getOp(){
        return op;
    }

    public void setArabic2(int arabic2){
        this.arabic2 = arabic2;
    }
    public int getArabic2(){
        return arabic2;
    }

    public void setArabic1(int arabic1){
        this.arabic1 = arabic1;
    }

    public int getArabic1(){
        return arabic1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum2(){
        return num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum1() {
        return num1;
    }

    public boolean getFlag() {
        return flag;
    }
    public void setFlag(boolean flag) {
        this.flag = flag;
    }

}
