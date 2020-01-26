package IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Converter {
    public static void main(String[] args) {
        OutputStreamWriter outputStreamWriter = null;
        try {
            //可以指定存储的编码
            outputStreamWriter = new OutputStreamWriter(new FileOutputStream("test3.txt"),"GBK");
            outputStreamWriter.write("你好");
            outputStreamWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(outputStreamWriter != null){
                    outputStreamWriter.close();
                }
                if(outputStreamWriter != null){
                    outputStreamWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
