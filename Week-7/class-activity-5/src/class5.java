import java.util.Scanner;

public class class5 {

    public static double calc(double grade1, double grade2, double grade3) {
        
        double quizAvg = (grade1 + grade2 + grade3) / 3.0;

        average(quizAvg);
        return quizAvg;
    }

    public static double average(double finalGrade) {

        if (finalGrade > 80.0) {
            System.out.println("good job!");
        } else {
            System.out.println("below 80%");
        }

        return finalGrade;
    }

    public static void result(double avg, String name, String age) {
        System.out.println("Quiz Average: " + avg);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) throws Exception {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter Name");
        String name = scnr.nextLine();

        System.out.println("Enter age");
        int age = scnr.nextInt();

        System.out.println("Enter quiz1");
        double quiz1 = scnr.nextDouble();

        System.out.println("Enter quiz2");
        double quiz2 = scnr.nextDouble();

        System.out.println("Enter quiz3");
        double quiz3 = scnr.nextDouble();
        
        result(calc(quiz1, quiz2, quiz3), name, age);
    }
}
