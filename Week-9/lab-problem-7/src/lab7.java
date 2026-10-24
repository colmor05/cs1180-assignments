import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class lab7 {

    /**
     * Creates a file and writes the string to it
     * 
     * @param filename Name of the file
     * @param s Text to write into the file
     * @return Created file
     * @throws IOException In case an error occurs while writing
     */
    public static File writeText(String filename, String s) throws IOException {

        File file = new File(filename);
        FileWriter fw = new FileWriter(file);

        // Writes the contents from s into the file and closes FileWriter
        // W3Schools on FileWriter (https://www.w3schools.com/Java/java_files_write.asp)
        fw.write(s);
        fw.close();

        return file;
    }


    /**
     * Counts the number of words in a file
     * 
     * @param f The file to read
     * @return The number of words in the file
     * @throws IOException In case an error occurs while reading
     */
    public static int countWords(File f) throws IOException {
        Scanner scnr = new Scanner(f);
        int count = 0;

        // Checks if there is a new word and adds the new word to the counter
        // Jackson Marques de Jackson taught how to scan files
        while (scnr.hasNext()) {
            scnr.next();
            count++;
        }

        scnr.close();
        return count;

    }

    public static void main(String[] args) throws Exception {
        Scanner scnr = new Scanner(System.in);

        try {
            System.out.println("What is the name of the file?");
            String name = scnr.nextLine()  + ".txt";

            System.out.println("What would you like to print to the file?");
            String write = scnr.nextLine();

            File file = writeText(name, write);
            int words = countWords(file);

            System.out.println(name + " contains " + words + " words");
        
        } catch (IOException e) {
            System.out.println("An error occured.");
        }

        scnr.close();
    }
}
