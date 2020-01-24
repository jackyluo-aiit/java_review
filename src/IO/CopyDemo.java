package IO;

import java.io.*;

public class CopyDemo {
    public static void main(String[] args) {
        //首先把文件读进来，需要创建文件对象
        File file = new File("/Users/luoxuqi/Documents/java_tutorial/src/IO/FileReaderDemo.java");
        //目标文件
        File file1 = new File("FileReaderDemo.java");
        Reader reader = null;
        Writer fileWriter = null;
        char[] chars = null;
        int len = -1;
        try {
            reader = new FileReader(file);
            fileWriter = new FileWriter(file1);
            chars = new char[2048];
            while ((len = reader.read(chars)) != -1) {
                String s = new String(chars, 0, len);
                fileWriter.write(s);
                //or: fileWriter.write(chars, 0, len);
                System.out.println(s + "total len: " + len);
            }
//            fileWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                //后开启先关闭
                if(fileWriter != null){
                    fileWriter.close();
                }
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

//        Writer fileWriter = null;
//        try {
//            fileWriter = new FileWriter(file1);
//            fileWriter.write(chars, 0, 702);
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if(fileWriter != null){
//                try {
//                    fileWriter.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//}
    }
}