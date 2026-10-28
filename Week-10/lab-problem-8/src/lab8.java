import java.util.Scanner;

/**
 * Implementation of Lab 8: Weather
 * CS1180L - Computer Science 1 Lab
 * Wright State University - Fall 2026
 * 
 * @author Colin Brunson
 * @since 10/26/2026
 */
public class lab8 {

    /**
     * Calculates the average of numbers in an array
     * 
     * @param nums the array of numbers
     * @return the average of the numbers
     */
    public static double findAverage(int[] nums) {
        int sum = 0;

        // Adds all numbers in the array
        // Jackson Marques de Jackson taught how to add arrays
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        return (double) sum / nums.length;
    }

    public static void main(String[] args) throws Exception {
        Scanner scnr = new Scanner(System.in);

        System.out.println("How many days of data?");
        int days = scnr.nextInt();

        // Creates arrays for each time of day
        int[] morning = new int[days];
        int[] noon = new int[days];
        int[] night = new int[days];

        // Asks for input for the tempretures each day
        // GeeksForGeeks shows how to get user input for arrays
        // (https://www.geeksforgeeks.org/java/how-to-take-array-input-from-user-in-java/)
        for (int i = 0; i < days; i++) {
            System.out.println("Day " + (i + 1));

            System.out.println("Enter morning temp");
            morning[i] = scnr.nextInt();

            System.out.println("Enter noon temp");
            noon[i] = scnr.nextInt();

            System.out.println("Enter night temp");
            night[i] = scnr.nextInt();
        }

        // Displays the average tempreture for each time of day
        System.out.println("--Average Report--");

        System.out.println("Morning average: " + Math.round(findAverage(morning)));
        System.out.println("Noon average: " + Math.round(findAverage(noon)));
        System.out.println("Night average: " + Math.round(findAverage(night)));

        for (int i = 0; i < days; i++) {
            int[] dailyTemps = { morning[i], noon[i], night[i] };

            System.out.println("Day " + (i + 1) + " average: " + Math.round(findAverage(dailyTemps)));
        }

        scnr.close();
    }
}
