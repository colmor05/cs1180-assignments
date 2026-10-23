import java.util.Arrays;
import java.util.Scanner;

public class class9_1 {
    public static void main(String[] args) throws Exception {
        int[] maxArr = {9, 4, 8, 18, 6};

        findMax(maxArr);

        Scanner scnr = new Scanner(System.in);

        System.out.println("What number do you want to find");

        int userInput = scnr.nextInt();

        findNum(maxArr, userInput);

    }

    public static void findMax(int[] arr) {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Max: " + max);
    }

    public static void findNum(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                System.out.println(num + " is in the array");
            }
        }
        
    }

}
