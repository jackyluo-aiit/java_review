package File;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("/Users/luoxuqi/Documents/java_tutorial/src/File/plato.txt");
        System.out.println(file.getName());

        //parent means the parent folder of the target file
        File file1 = new File("/Users/luoxuqi/Documents/java_tutorial/src/File","plato.txt");
        System.out.println(file1.getName());

        //java中file类的对象可以代表目录也可以代表文件
        File file2 = new File("/Users/luoxuqi/Documents/java_tutorial/src/File");
        System.out.println(file2.getName());

        //根据目录的文件对象创建一个文件对象
        File file3 = new File(file2, "newfile.txt");
        System.out.println(file3.exists());
        System.out.println(file3.getName());


    }
}
