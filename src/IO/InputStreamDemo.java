package IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo {
    public static void main(String[] args) {
        //创建字节输入流对象，如果有中文，可能会出现乱码（
        // 接收的数组可能太小，刚好读到一个字的中间，因为中文字不是一个字节）
        InputStream in = null;

        try {
            in = new FileInputStream("/Users/luoxuqi/Documents/java_tutorial/test.txt");
            byte[] bytes = new byte[6];
            int read = -1;
            while((read = in.read(bytes))!=-1){
                System.out.print(new String(bytes,0,read));
            }
//            System.out.println("first read length: "+read+" content: "+ new String(bytes, 0, read));
//
//            read = in.read(bytes);
//            System.out.println("second read length: "+read+" content: "+ new String(bytes, 0, read));
//
//            read = in.read(bytes);
//            System.out.println("second read length: "+read);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(in != null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
