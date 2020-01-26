package IO;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter("c.txt");
            pw.println("Hello World");
            pw.println(1.2f);
            pw.println(12);
            pw.println('c');
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(pw!=null){
                pw.close();
            }
        }

    }
}
