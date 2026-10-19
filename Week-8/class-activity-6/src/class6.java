import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class class6 {
    public static void main(String[] args) throws IOException {
        
        File file = new File("C:\\Users\\sbswe\\Desktop\\filename.txt");
        FileWriter fw = new FileWriter(file);

        fw.write("Hello World!");
        fw.close();

        System.out.println("File Written");

        Scanner scnr = new Scanner(file);

        while (scnr.hasNextLine()) {
            
        }
        scnr.close();
    }
}
