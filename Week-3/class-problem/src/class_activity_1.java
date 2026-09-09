import java.util.Scanner;

public class class_activity_1 {
    public static void main(String[] args) throws Exception {

        // Initiates a new scanner for user input ('try' is there due to resource leak)
        try (Scanner scnr = new Scanner(System.in)) {
            ;

            // Initiates numbers with decimals
            double score1;
            double score2;
            double score3;

            // Asks for user input for the grade on the first assignment
            System.out.println("What is the grade of your 1st assignment?");
            score1 = scnr.nextInt();

            // Prints A, B, C, D, or F based on the number of score1
            if (score1 >= 90) {
                System.out.println("You got an A.");
            } else if (score1 >= 80) {
                System.out.println("You got a B.");
            } else if (score1 >= 70) {
                System.out.println("You got a C.");
            } else if (score1 >= 60) {
                System.out.println("You got a D.");
            } else {
                System.out.println("You got an F.");
            }

            // Asks for user input for the grade on the second assignment
            System.out.println("What is the grade of your 2nd assignment?");
            score2 = scnr.nextInt();

            // Prints A, B, C, D, or F based on the number of score2
            if (score2 >= 90) {
                System.out.println("You got an A.");
            } else if (score2 >= 80) {
                System.out.println("You got a B.");
            } else if (score2 >= 70) {
                System.out.println("You got a C.");
            } else if (score2 >= 60) {
                System.out.println("You got a D.");
            } else {
                System.out.println("You got an F.");
            }

            // Asks for user input for the grade on the third assignment
            System.out.println("What is the grade of your 3rd assignment?");
            score3 = scnr.nextInt();

            // Prints A, B, C, D, or F based on the number of score3
            if (score3 >= 90) {
                System.out.println("You got an A.");
            } else if (score3 >= 80) {
                System.out.println("You got a B.");
            } else if (score3 >= 70) {
                System.out.println("You got a C.");
            } else if (score3 >= 60) {
                System.out.println("You got a D.");
            } else {
                System.out.println("You got an F.");
            }

            // Calculates the average of score1, score2, and score3
            double calc = (score1 + score2 + score3) / 3;

            // Prints calc
            System.out.printf("Your Grade Average: %.2f%%", calc);
        }
    }
}
