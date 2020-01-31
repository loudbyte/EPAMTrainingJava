package _java._se._04._iostream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class IOJavaScheme {
    public static void main(String[] args) {
        try {
            // creating stream object (open stream)
            FileWriter out = null;
            out = new FileWriter("text.txt");
            // stream properties
            BufferedWriter br = new BufferedWriter(out);
            PrintWriter pw = new PrintWriter(br);
            pw.println("I am a sentence in a text-file. LOL");
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
