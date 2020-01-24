package IO;

import java.io.*;

public class BufferStreamCopy {
    public static void main(String[] args) {
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;

        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream("test.jpg"));
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("test_output.jpg"));
            byte[] bytes = new byte[1024];
            int len = -1;
            while ((len = bufferedInputStream.read())!=-1){
                bufferedOutputStream.write(bytes, 0, len);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(bufferedInputStream!=null){
                    bufferedInputStream.close();
                }
                if(bufferedOutputStream!=null){
                    bufferedOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
