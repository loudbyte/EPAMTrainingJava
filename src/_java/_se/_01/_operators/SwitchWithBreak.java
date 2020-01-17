package _java._se._01._operators;

public class SwitchWithBreak {
    public static void main(String[] args) {
        String s = new String("one");
        byte var3 = -1;
        switch(s.hashCode()) {
            case 110182:
                if (s.equals("one")) {
                    var3 = 2;
                }
                break;
            case 115276:
                if (s.equals("two")) {
                    var3 = 0;
                }
                break;
            case 110339486:
                if (s.equals("three")) {
                    var3 = 1;
                }
        }

        switch(var3) {
            case 0:
                System.out.println("two");
                break;
            case 1:
                System.out.println("three");
                break;
            case 2:
                System.out.println("one");
                break;
            default:
                System.out.println("default");
        }

    }

}
