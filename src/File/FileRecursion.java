package File;

import java.io.File;

public class FileRecursion {
    //定义文件目录层级
    public static int level;

    public static void main(String[] args) {
        File file = new File("/Users/luoxuqi/Documents/java_tutorial/src");
        parseFile(file);
    }

    public static void parseFile(File file){
        if(file == null || !file.exists()){
            return;
        }
        //给层级+1
        level++;

        //获得文件对象的子文件对象列表
        File[] files = file.listFiles();
        //遍历这些子文件
        for(File f : files){
            //打印层级缩进
            for (int i = 0; i < level; i++)
                System.out.print("\t");

            //打印文件名字
            System.out.println(f.getName());
            //判断文件是否目录
            if(f.isDirectory()){
                //递归的方式遍历
                parseFile(f);
            }
        }
        //本层级遍历完毕，把层级还原
        level--;
    }
}
