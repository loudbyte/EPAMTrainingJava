package _java._se._01._operators;

public class LogicOP {
    public LogicOP() {
    }

    public static void main(String[] args) {
        if (bFalse() && bTrue()) {
        }

        System.out.println();
        if (bFalse() & bTrue()) {
        }

        System.out.println();
    }

    private static boolean bTrue() {
        System.out.println("true ");
        return true;
    }

    private static boolean bFalse() {
        System.out.println("false ");
        return false;
    }
}
