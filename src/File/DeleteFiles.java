package File;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class DeleteFiles {
    //delete all the files in one folder without the folder
    public static void main(String[] args) throws IOException {
//        createFiles();
        File file = new File("/Users/luoxuqi/Documents/newFolder");
        System.out.println("Reading from directory: "+file.getPath());
        //deleteFiles(file);
        deleteFilesAndFolder(file);


    }

    public static void deleteFiles(File file){
        if(file == null || !file.exists()){
            return;
        }
        File[] files = file.listFiles();
        System.out.println("File list: "+ Arrays.toString(files));
        for(File f : files) {
            if (f.isFile()) {
                f.delete();
            }
            else {
                deleteFiles(f);
            }
        }
    }

    public static void deleteFilesAndFolder(File file){
        if(file == null || !file.exists()){
            return;
        }
        File[] files = file.listFiles();
        System.out.println("Files list: "+Arrays.toString(files));
        for(File f: files){
            if(f.isFile()){
                f.delete();
                System.out.println("Deleted file: "+f.getName());
            }
            else{
                deleteFilesAndFolder(f);
            }
        }
        System.out.println("Deleting folder: "+file.getName());
        file.delete();
    }

    public static void createFiles() throws IOException {
        File file = new File("/Users/luoxuqi/Documents/newFolder/testFolder/test/test1.txt");
        boolean newFile = file.createNewFile();
        File file1 = new File("/Users/luoxuqi/Documents/newFolder/testFolder/test/test2.txt");
        boolean newFile1 = file1.createNewFile();
        File file2 = new File("/Users/luoxuqi/Documents/newFolder/testFolder/test/test3.txt");
        boolean newFile2 = file2.createNewFile();
    }



}
