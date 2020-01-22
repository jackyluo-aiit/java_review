package File;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class getFile {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/luoxuqi/Documents/java_tutorial/src/File/plato.txt");
        System.out.println("file absolute path: "+file.getAbsolutePath());
        //相对路径就是当前项目的根
        File file1 = new File("test.txt");
        System.out.println(file1.getAbsolutePath());
        //文件相对路径
        System.out.println(file1.getPath());
        //文件的大小:文件所占的字节
        System.out.println(file.length());
        //文件最后修改时间
        System.out.println(new Date(file.lastModified()));
    }
}
