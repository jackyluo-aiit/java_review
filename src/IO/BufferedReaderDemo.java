package IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        //创建
        BufferedReader bufferedReader = null;
        String s = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("FileReaderDemo.java"));
            while((s = bufferedReader.readLine())!=null){
                System.out.println(s);
            }
//            String s = bufferedReader.readLine();//读取一行，走到尽头就是null
//            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关闭外层的对象的时候，内存的资源会自动的被关闭
            if(bufferedReader != null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
