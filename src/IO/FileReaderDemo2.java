package IO;

import java.io.FileReader;
import java.io.Reader;
import java.util.Arrays;

public class FileReaderDemo2 {
    public static void main(String[] args) {
        //创建FileReader 对象
        Reader reader = null;
        try {
            reader = new FileReader("HelloWorld.txt");
            //定义数组
            char[] chars = new char[5];
            //向数组中添加数据，从index2位置开始往后3个位置写入
            int len = reader.read(chars, 2, 3);
            System.out.println(Arrays.toString(chars));
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
