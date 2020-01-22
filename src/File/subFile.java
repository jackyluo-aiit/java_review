package File;

import java.io.File;
import java.util.Arrays;

public class subFile {
    public static void main(String[] args) {
        //获取系统根目录
        File[] files = File.listRoots();
        System.out.println(Arrays.toString(files));
        //获得一个目录下的子文件对象
        File file = new File("/Users/luoxuqi/Documents");
        File[] files1 = file.listFiles();
        for(File f: files1){
            System.out.println(f);
        }
        //获取子文件的名字
        String[] list = file.list();
        System.out.println(Arrays.toString(list));
    }
}
