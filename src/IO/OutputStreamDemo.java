package IO;

import java.io.*;

public class OutputStreamDemo {
    public static void main(String[] args) {
        //创建一个字节输入流
        OutputStream out = null;

        try {
//            out = new FileOutputStream(new File("test.txt"));
            //不需要创建File对象
            out =  new FileOutputStream("test.txt");
            //字节流不需要flush()
            out.write(98);//int会被解码转换成字符
            //创建字节数组
            byte[] b = {97, 103,111,122};
            out.write(b);
            //从某个区间写入
            out.write(b, 1, 2);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(out != null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
