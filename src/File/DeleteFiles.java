package File;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class DeleteFiles {
    //delete all the files in one folder without the folder
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/luoxuqi/Documents/newFolder/testFolder/test");
        System.out.println("Reading from directory: "+file.getPath());
        deleteFiles(file);

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

    }
    


}
