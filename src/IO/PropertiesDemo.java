package IO;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) {
        Properties p = new Properties();
        //放数据
        p.setProperty("001","Jacky");
        p.setProperty("002","Jessica");
        p.setProperty("003","Andrew");
        System.out.println(p);
        //取数据
        String property = p.getProperty("001");
        String property1 = p.getProperty("002");
        String property2 = p.getProperty("003");
        //输入到持久化储存
        PrintWriter pw = null;
        try {
            pw = new PrintWriter("PropertiesTest.txt");
            pw.println("---Properties List---");
            p.list(pw);//会自动加上标题：-- listing properties --
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(pw!=null){
                pw.close();
            }
        }
    }
}
