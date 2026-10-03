import java.util.Scanner;

public class lab5 {
    public static void main(String[] args) throws Exception {
        Scanner scnr = new Scanner(System.in);

        // User inputs n
        System.out.println("What is the value of n?");
        int n = scnr.nextInt();

        // If n is less than 1, error will print
        if (n < 1) {
            System.out.println("Error: n must be positive.");
        
        } else {

            // Outer loop to count each number from n
            // Nested for loops learned from W3Schools(https://www.w3schools.com/java/java_for_loop_nested.asp)
            for (int num = 1; num <= n; num++) {
                System.out.print(num + ":");

                // Inner loop checks for factors of n
                for (int factor = 1; factor <= num; factor++) {

                    // Divides the number with no remainder
                    // Jackson Marques de Jackson taught modulus
                    if (num % factor == 0) {
                        System.out.print(" " + factor);
                    }
                }
                // Prints new line
                System.out.println();
            }
        }
    }
}
