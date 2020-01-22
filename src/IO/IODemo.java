package IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class IODemo {
    public static void main(String[] args){
        //使用字符流向一个文件输入helloworld
        File file = new File("test.txt");
        Writer writer = null;
        try {
            //IO流需要关闭，这样在遇到错误时可以关闭资源
            writer = new FileWriter(file);
            //如果文件不存在，同时创建了文件；存在则直接覆盖文件原内容并写入
            writer.write("Hello world");
//            writer.flush();//如果下面没有关闭，则可以直接调用flush(),将内容写入
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //判断writer 是否空，防止空指针异常
            if(writer!=null){
                try {
                    //在关闭前会做flush(),清空缓存，把内容冲进目标文件
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
