package FileHandling;

import java.io.File;

public class FileListDirectory {
    public static void main(String[] ar){
        File f = new File("C:\\Users\\Sasee Dharan\\Desktop");

        File[] lFile = f.listFiles();
        for(File l : lFile)
        System.out.println(l);

      String s = f.getName();

      System.out.println(s);

    }
}
