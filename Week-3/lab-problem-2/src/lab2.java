import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) throws Exception {
        
        // Creates a scanner for user input
        Scanner scnr = new Scanner(System.in);

        // Initiates doubles
        double zyBooks;
        double attendance;
        double lab;
        double quizzes;
        double midterm;
        double desiredGrade;

        // Asks for user input on their grade for zyBooks with decimal being an option
        System.out.println("What is your grade for zyBooks?");
        zyBooks = scnr.nextDouble();

        // Prints the user input
        // ('%.2f' prints the user input and rounds to 2 decimal places '%%' needed to be used to display the % sign)
        System.out.printf("You have a %.2f%% grade for zyBooks, which is 10%% of your grade\n", zyBooks);

        // Asks for user input on their grade for attendance with decimal being an option
        System.out.println("What is your grade for attendance?");
        attendance = scnr.nextDouble();

        // Prints the user input
        // ('%.2f' prints the user input and rounds to 2 decimal places '%%' needed to be used to display the % sign)
        System.out.printf("You have a %.2f%% grade for attendance, which is 5%% of your grade\n", attendance);

        // Asks for user input on their grade for the labs with decimal being an option
        System.out.println("What is your grade for the labs?");
        lab = scnr.nextDouble();

        // Prints the user input
        // ('%.2f' prints the user input and rounds to 2 decimal places '%%' needed to be used to display the % sign)
        System.out.printf("You have a %.2f%% grade for the labs, which is 42%% of your grade\n", lab);

        // Asks for user input on their grade for the quizzes with decimal being an option
        System.out.println("What is your grade for the quizzes?");
        quizzes = scnr.nextDouble();

        // Prints the user input
        // ('%.2f' prints the user input and rounds to 2 decimal places '%%' needed to be used to display the % sign)
        System.out.printf("You have a %.2f%% grade for the quizzes, which is 10%% of your grade\n", quizzes);

        // Asks for user input on their grade for the midterm with decimal being an option
        System.out.println("What is your grade for the midterm?");
        midterm = scnr.nextDouble();

        // Prints the user input
        // ('%.2f' prints the user input and rounds to 2 decimal places '%%' needed to be used to display the % sign)
        System.out.printf("You have a %.2f%% grade for the midterm, which is 13%% of your grade\n", midterm);

        // Asks for user input on their grade for the desired grade with decimal being an option
        System.out.println("What is your desired grade?");
        desiredGrade = scnr.nextDouble();

        // Calculates all user inputs and aligns with their final grades
        double calcGrades = (zyBooks * 0.1) + (attendance * 0.05) + (lab * 0.42) + (quizzes * 0.1) + (midterm * 0.13);

        // Calculates what you need on the final exam to get the desired grade
        double finalExam = (desiredGrade - calcGrades) / 0.2;

        // Prints the first part of the sentence containing the desired grade
        System.out.printf("To get %.2f%%", desiredGrade);

        // Prints the last part of the sentence containing the final exam grade needed
        System.out.printf(", you will need to get %.2f%% on the final exam.", finalExam);
    }
}
