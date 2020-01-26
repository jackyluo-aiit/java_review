package IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo3 {
    public static void main(String[] args) {
        Properties p = new Properties();

        FileInputStream fileInputStream = null;

        try {
            //获得类路径在的资源文件作为流加载
            PropertiesDemo3.class.getClassLoader().getResourceAsStream("PropertiesTest.properties");
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
