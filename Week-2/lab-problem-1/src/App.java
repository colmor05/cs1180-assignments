public class App {
    public static void main(String[] args) throws Exception {
        
        // Current Grades 
        // Citation for numbers containing decimals: https://www.w3schools.com/java/ref_keyword_double.asp
        double zyBooks = 97.3;
        double attendance = 100.0;
        double lab = 89.72;
        double quizzes = 86.24;
        double midterm = 87.5;

        // Category Weights
        double zyBooksWeight = 10;
        double attendanceWeight = 5;
        double labWeight = 42;
        double quizzesWeight = 10;
        double midtermWeight = 13;
        double finalWeight = 20;

        // Calculates the weighted points
        double score = (zyBooks * zyBooksWeight)
            + (attendance * attendanceWeight)
            + (lab * labWeight)
            + (quizzes * quizzesWeight)
            + (midterm * midtermWeight);

        // Calcuates the current average (excluding final)
        double currentAvg = score
                / (zyBooksWeight + attendanceWeight + labWeight
                + quizzesWeight + midtermWeight);

        // Calculates final exam grade needed for a 90% overall grade
        double targetGrade = 90;
        double finalGrade = (targetGrade * 100 - score) / finalWeight;
        
        // Prints results
        // Dr. Doom presented a slide that contained how to print something.
        System.out.println("Current Average: " + currentAvg);
        System.out.println("Final Grade: " + finalGrade);
    }
}
