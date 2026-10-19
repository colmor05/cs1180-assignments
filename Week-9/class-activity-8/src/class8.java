import java.util.Arrays;
import java.util.Scanner;

public class class8 {

    public static void main(String[] args) throws Exception {
        
        Scanner scnr = new Scanner(System.in);
        int[] numbers = new int[3];

        System.out.println("Enter 3 integers:");

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter int" + (i + 1) + ":");
            numbers[i] = scnr.nextInt();
        }

        scnr.close();

        System.out.println("\nOriginal array: " + Arrays.toString(numbers));
        sortThree(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }

    public static void sortThree(int[] num) {
        Arrays.sort(num);
    }
}
