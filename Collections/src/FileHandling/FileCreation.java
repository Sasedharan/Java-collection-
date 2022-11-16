package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileCreation {
    public static void main(String[] arg){
     // File f = new File("C:\\Users\\Sasee Dharan\\Documents\\FirstFolder\\.File1.txt");

        File f1 = new File("C:\\Users\\Sasee Dharan\\Documents\\FirstFolder\\.File1.txt");
        boolean check = f1.exists();
        System.out.println("Is the File is already existing :" +check);
        if(check == false)
        try {
            f1.createNewFile();
            System.out.println("New File Created");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("File already Created");
    }
}