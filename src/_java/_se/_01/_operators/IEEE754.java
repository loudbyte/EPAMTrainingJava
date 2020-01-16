package _java._se._01._operators;

public class IEEE754 {
    public IEEE754() {
    }

    public static void main(String[] args) {
        double i = 7.0D;
        System.out.println(i / 0.0D);
        System.out.println(-i / 0.0D);
        double k;
        System.out.println(k = Math.sqrt(-i));
        System.out.println(Double.isNaN(k));
    }
}
