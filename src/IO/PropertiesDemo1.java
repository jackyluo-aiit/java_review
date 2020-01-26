package IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo1 {
    public static void main(String[] args) {
        Properties p = new Properties();

        FileInputStream fileInputStream = null;

        try {
            fileInputStream  = new FileInputStream("PropertiesTest.txt");
            //用字节流加载文件中Properties 到Properties 中
            p.load(fileInputStream);
            System.out.println(p);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(fileInputStream!=null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
