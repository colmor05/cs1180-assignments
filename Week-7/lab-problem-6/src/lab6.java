import java.util.Scanner;

public class lab6 {


    /**
     * Prints a multiplication table from 1 to n.
     * Michael Raymer made a file on how to do JavaDoc
     * @param n the size of the multiplication table
     */
    public static void printTable(int n) {
        
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= n; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }

    /**
     * Checks if n is greater than 0 or less than 50.
     * return learned from W3Schools (https://www.w3schools.com/java/ref_keyword_return.asp)
     * @param n the number to check
     * @return true if n is valid, otherwise false
     */
    public static boolean verifyNum(int n) {
        return n > 0 && n < 50;
    }

    public static void main(String[] args) throws Exception {
        Scanner scnr = new Scanner(System.in);

        // Asks for user input for n
        System.out.println("What is the value of n?");
        int n = scnr.nextInt();

        // Calls verifyNum to check if n is between 0 and 50
        if (verifyNum(n)) {

            // Calls printTable if n is between 0 and 50
            printTable(n);
        } else {

            // Displays if n is not between 0 and 50
            System.out.println("Error: n must be between 0 and 50");
        }

    }
}