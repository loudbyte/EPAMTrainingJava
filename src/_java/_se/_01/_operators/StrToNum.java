package _java._se._01._operators;

public class StrToNum {
    public static void main(String[] args) {
        String strInt = "123";
        String strDouble = "123.24";
        int x = Integer.parseInt(strInt);
        double y = Double.parseDouble(strDouble);
        System.out.println((double)x + y);
        strInt = String.valueOf(x + 1);
        System.out.println(strInt);
        String str = "num=345";
        System.out.println(str);
    }
}
