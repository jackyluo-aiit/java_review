package IO;

import java.io.*;

public class BufferCopyTest {
    public static void main(String[] args) {
        BufferedWriter bufferedWriter = null;
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader("/Users/luoxuqi/Documents/java_tutorial/src/IO/IODemo.java"));
            bufferedWriter = new BufferedWriter(new FileWriter("IOTest1.java"));
            String s = null;
            while ((s = bufferedReader.readLine()) != null){
                bufferedWriter.write(s);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedWriter!=null){
                    bufferedWriter.close();
                }
                if (bufferedReader !=null){
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
