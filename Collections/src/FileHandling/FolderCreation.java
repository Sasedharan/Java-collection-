package FileHandling;

import java.io.File;

public class FolderCreation {
    public static void main(String[] args){
        File f = new File("C:\\Users\\Sasee Dharan\\Documents\\FirstFolder\\SubFolder");
        boolean check = f.exists();
        System.out.println(check);
        if(check==false){
            f.mkdir();
        }
        System.out.println("New Folder Created");
        f.mkdirs();
        System.out.println("Sub Folders Created - Check ur Path");



    }
}
