package File;

import java.io.File;
import java.io.IOException;

public class FileCreation {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/luoxuqi/Documents/newFile.txt");
        //create file
        boolean newFile = file.createNewFile();
        System.out.println(newFile);
        //创建目录:上层路径必须存在且正确
        File file1 = new File("/Users/luoxuqi/Documents/newFolder");
        boolean mkdir = file1.mkdir();
        System.out.println(mkdir);
        //多级目录
        File file2 = new File("/Users/luoxuqi/Documents/newFolder/testFolder/test");
        boolean mkdirs = file2.mkdirs();
        System.out.println(mkdirs);
        //删除文件:删除后垃圾桶找不到
        boolean delete = file.delete();
        //删除目录：只删除最后一层，且只能删除空目录




    }
}
