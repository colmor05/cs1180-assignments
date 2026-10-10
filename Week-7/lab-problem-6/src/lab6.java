import java.util.Scanner;

public class lab6 {

    // public static int printTable(int num) {

    // }

    public static boolean verifyNum(int num) {

        // If num is less than 0 or greater than 50, num returns as false
        if (num < 0 || num > 50) {
            return false;
        } else {
            // If num is between 0 and 50, num returns true
            return true;
        }

    }

    public static void main(String[] args) throws Exception {
        Scanner scnr = new Scanner(System.in);

        int n;

        // Asks for n
        System.out.println("What is the value of n?");
        n = scnr.nextInt();

        if (verifyNum(n) == false) {
            System.out.println("Error: n must be between 0 and 50");
        }

    }
}