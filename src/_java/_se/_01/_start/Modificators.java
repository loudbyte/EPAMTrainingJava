package _java._se._01._start;

public class Modificators {
    public static void main(String[] args) {
        AboutJava obj = new AboutJava();
        String s1 = obj.getAboutJava();
        // KString s2 = obj.info(); // error
    }
}

class AboutJava {
    public String getAboutJava() {
        return info();
    }
    private String info() {
        return "About Java.";
    }
}
