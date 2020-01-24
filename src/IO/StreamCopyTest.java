package IO;

import java.io.*;

public class StreamCopyTest {
    public static void main(String[] args) {
        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            inputStream = new FileInputStream("/Users/luoxuqi/Documents/java_tutorial/Image.png");
            outputStream = new FileOutputStream("/Users/luoxuqi/Documents/java_tutorial/Image_test.png");
            byte[] bytes = new byte[1024];
            int len = -1;
            while((len = inputStream.read(bytes)) != -1){
                outputStream.write(bytes, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(inputStream != null){
                    inputStream.close();
                }
                if(outputStream != null){
                    outputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
