package FileHandling;

import java.io.File;

public class FileDeletion {
    public static void main(String[] ar){
        File f = new File("C:\\Users\\Sasee Dharan\\Documents\\FirstFolder\\.File1.txt");
        boolean check = f.exists();
        System.out.println("File Present : "+check);
        if(check==true) {
            f.delete();
            System.out.println("After deletion :" + f.exists());
        }
    }
}
