package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileRename {
    public static void main(String[] ar){
        File f = new File("C:\\Users\\Sasee Dharan\\Documents\\FirstFolder\\Text.txt");
        try {
            f.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        File fRename = new File("C:\\Users\\Sasee Dharan\\Documents\\FirstFolder\\Maarii.txt");
     //  f.renameTo(fRename);
       System.out.println("File Renamed: "+ f.renameTo(fRename));

    }
}
