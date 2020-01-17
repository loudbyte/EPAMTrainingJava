package _java._se._01._operators;

public class PriorityOP {
    public static void main(String[] args) {
        int i = 3;
        i = i + 1;
        i = -i + i++ + -i;
        System.out.println(i);
    }

}
