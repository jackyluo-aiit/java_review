package IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        BufferedWriter bufferedWriter = null;

        try {
            bufferedWriter = new BufferedWriter(new FileWriter("IOTest.java"));
            //写一行数据
            bufferedWriter.write("HelloWorld");
            //换行
            bufferedWriter.newLine();
            bufferedWriter.write("HelloWorld");
            //flush(): 将输入流冲进文件，才能生效
            bufferedWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //资源关闭
            if (bufferedWriter != null){
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
