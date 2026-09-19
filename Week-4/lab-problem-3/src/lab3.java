import java.util.Scanner;

public class lab3 {
    public static void main(String[] args) throws Exception {
        
        // Creates a scanner for user input
        Scanner scnr = new Scanner(System.in);

        // Initiates doubles
        double zyBooks;
        double attendance;
        double lab;
        double quizzes;
        double midterm;
        
        // Initiates character
        char desiredGrade;

        // Asks for user input on their grade for zyBooks
        System.out.println("What is your grade for zyBooks?");
        
        // If user input does not contain a number, error will print
        // GeeksforGeeks citation (https://www.geeksforgeeks.org/java/scanner-hasnextdouble-method-in-java-with-examples/)
        if (!scnr.hasNextDouble()) {
            System.out.println("Error: Input must be a number.");
            return;
        }

        zyBooks = scnr.nextDouble();

        // If user input is out of range (ex. 125 or -45), error will print
        if (zyBooks < 0 || zyBooks > 100) {
            System.out.print("Error: Input must be a number between 0 to 100.");
            return;
        }

        // Prints the user input
        // ('%.2f' prints the user input and rounds to 2 decimal places '%%' needed to be used to display the % sign)
        System.out.printf("You have a %.2f%% grade for zyBooks, which is 10%% of your grade\n", zyBooks);

        // Asks for user input on their grade for attendance with decimal being an option
        System.out.println("What is your grade for attendance?");
        
        // If user input does not contain a number, error will print
        if (!scnr.hasNextDouble()) {
            System.out.println("Error: Input must be a number.");
            return;
        }

        attendance = scnr.nextDouble();

        // If user input is out of range, error will print
        if (attendance < 0 || attendance > 100) {
            System.out.print("Error: Input must be a number between 0 to 100.");
            return;
        }

        // Prints the user input
        // ('%.2f' prints the user input and rounds to 2 decimal places '%%' needed to be used to display the % sign)
        System.out.printf("You have a %.2f%% grade for attendance, which is 5%% of your grade\n", attendance);

        // Asks for user input on their grade for the labs with decimal being an option
        System.out.println("What is your grade for the labs?");

        // If user input does not contain a number, error will print
        if (!scnr.hasNextDouble()) {
            System.out.println("Error: Input must be a number.");
            return;
        }

        lab = scnr.nextDouble();

        // If user input is out of range, error will print
        if (lab < 0 || lab > 100) {
            System.out.print("Error: Input must be a number between 0 to 100.");
            return;
        }

        // Prints the user input
        // ('%.2f' prints the user input and rounds to 2 decimal places '%%' needed to be used to display the % sign)
        System.out.printf("You have a %.2f%% grade for the labs, which is 42%% of your grade\n", lab);

        // Asks for user input on their grade for the quizzes with decimal being an option
        System.out.println("What is your grade for the quizzes?");

        // If user input does not contain a number, error will print
        if (!scnr.hasNextDouble()) {
            System.out.println("Error: Input must be a number.");
            return;
        }

        quizzes = scnr.nextDouble();

        // If user input is out of range, error will print
        if (quizzes < 0 || quizzes > 100) {
            System.out.print("Error: Input must be a number between 0 to 100.");
            return;
        }

        // Prints the user input
        // ('%.2f' prints the user input and rounds to 2 decimal places '%%' needed to be used to display the % sign)
        System.out.printf("You have a %.2f%% grade for the quizzes, which is 10%% of your grade\n", quizzes);

        // Asks for user input on their grade for the midterm with decimal being an option
        System.out.println("What is your grade for the midterm?");

        // If user input does not contain a number, error will print
        if (!scnr.hasNextDouble()) {
            System.out.println("Error: Input must be a number.");
            return;
        }

        midterm = scnr.nextDouble();

        // If user input is out of range, error will print
        if (midterm < 0 || midterm > 100) {
            System.out.print("Error: Input must be a number between 0 to 100.");
            return;
        }

        // Prints the user input
        // ('%.2f' prints the user input and rounds to 2 decimal places '%%' needed to be used to display the % sign)
        System.out.printf("You have a %.2f%% grade for the midterm, which is 13%% of your grade\n", midterm);

        // Asks for user input on their grade for the desired grade with decimal being an option

        // Calculates all user inputs
        double calcGrades = (zyBooks * 0.1) + (attendance * 0.05) + (lab * 0.42) + (quizzes * 0.1) + (midterm * 0.13);

        // Calculates the current grade of the user minus the final exam.
        double currentGrade = calcGrades / 0.8;

        // Prints the current grade
        System.out.printf("Your current grade is %.2f%%\n", currentGrade);
        
        // Asks for user input on the desired grade, charAt selects the first letter in the input
        System.out.println("What is your desired grade for the class?");
        desiredGrade = scnr.next().charAt(0);

        // Forces the letter to be uppercase
        // Dr. Travis Doom showed toUpperCase in his slides
        desiredGrade = Character.toUpperCase(desiredGrade);

        // Initiates the target grade
        double targetGrade;

        // Determines the precentage based on the user input
        if (desiredGrade == 'A') {
            targetGrade = 90.0;

        } else if (desiredGrade == 'B') {
            targetGrade = 80.0;

        } else if (desiredGrade == 'C') {
            targetGrade = 70.0;
        
        } else if (desiredGrade == 'D') {
            targetGrade = 60.0;

        } else if (desiredGrade == 'F') {
            targetGrade = 0.0;

        } else {
            desiredGrade = 'A';
            targetGrade = 90.0;
        }

        // Calculates what grade you need to get based on desired letter grade and current grade
        double finalExam = (targetGrade - currentGrade) / 0.2;

        // Prints final exam calculation
        System.out.printf("To get a %c for the class, ", desiredGrade);
        System.out.printf("you will need to get %.2f%% for your final exam", finalExam);
    }
}
