import java.util.Scanner;

public class lab4 {
    public static void main(String[] args) throws Exception {
        Scanner scnr = new Scanner(System.in);

        // Asks user for a number of Fibonacci numbers to display
        System.out.println("What is the value of n?");
        int n = scnr.nextInt();

        // Checks if n is zero or negative
        if (n <= 0) {
            System.out.println("Error: n cannot be negative or zero.");
        } else {

            // First two Fibonacci numbers
            int first = 1;
            int second = 1;

            // Prints the numbers from the user input
            for (int i = 1; i <= n; i++) {
                
                // Nested if statements (https://www.w3schools.com/JAVA/java_conditions_nested.asp)
                if (i == 1) {
                    System.out.print(first);
                
                } else if (i == 2) {
                    System.out.print(", " + second);

                } else {

                    int next = first + second;
                    System.out.print(", " + next);

                    // Moves to the next pair of numbers
                    // Greg Rosen taught how the Fibonacci sequence works
                    first = second;
                    second = next;
                }
            }
        }
    }
}
