package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteReadDemo {
    public static void main(String[] arg)  {
        File f = new File("C:\\Users\\Sasee Dharan\\Documents\\FirstFolder\\Celebration.txt");
        try {
            f.createNewFile();
            FileWriter fWriter = new FileWriter(f);
            fWriter.write("Hello!, Celebration Begins;");
            fWriter.flush();
            fWriter.close();

            // yet to understand FIle Read....?

            FileReader fReader = new FileReader(f);
            System.out.println();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
