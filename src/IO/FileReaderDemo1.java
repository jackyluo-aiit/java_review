package IO;

import java.io.FileReader;
import java.io.Reader;

public class FileReaderDemo1 {
    public static void main(String[] args) {
        //创建FileReader 对象
        Reader reader = null;
        try {
            reader = new FileReader("HelloWorld.txt");
            //定义数组
            char[] chars = new char[5];
            //向数组中添加数据
            int len = -1;
            while((len = reader.read(chars))!=-1) {
                //把字符数组变成字符串
                String s = new String(chars,0,len);
                System.out.print(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (reader == null){
                try {
                    reader.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }

    }
}
