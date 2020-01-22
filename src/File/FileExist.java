package File;

import java.io.File;

public class FileExist {
    public static void main(String[] args) {
        File file = new File("/Users/luoxuqi/Documents/newFile.txt");
        System.out.println(file.exists());
        //是否文件
        System.out.println(file.isFile());
        //是否目录
        System.out.println(file.isDirectory());
        //是否可读
        System.out.println(file.canRead());
    }
}
