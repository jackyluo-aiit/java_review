package IO;

import java.io.FileReader;
import java.io.Reader;

public class FileReaderDemo {
    public static void main(String[] args) {
        //创建FileReader 对象
        Reader reader = null;
        try {
            reader = new FileReader("HelloWorld.txt");
            int c = -1;
            while((c = reader.read())!=-1) {
                System.out.print((char) c);//强制转换
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
