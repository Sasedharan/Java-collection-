package FileHandling;

import java.io.*;

public class BufferReaderWriter {
    public static void main(String[] arg) throws IOException {
        File f = new File("C:\\Users\\Sasee Dharan\\Documents\\FirstFolder\\Maarii.text");
        FileWriter fWriter = new FileWriter(f);
        BufferedWriter bWriter = new BufferedWriter(fWriter);
        try {
            bWriter.write("Welcome to the Great Girikaalan Competition");
            bWriter.newLine();
            bWriter.write("Lemon in the Spoon");
            bWriter.newLine();
            bWriter.write("Musical Chairs");
            bWriter.flush();
            bWriter.close();

            FileReader fReader = new FileReader(f);
            BufferedReader bReader = new BufferedReader(fReader);
            String rLine = bReader.readLine();
            while(rLine!=null)
            {
                System.out.println(rLine);
                rLine = bReader.readLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
