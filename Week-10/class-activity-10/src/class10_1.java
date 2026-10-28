import java.util.Scanner;

public class class10_1 {
    public static void main(String[] args) throws Exception {
        Scanner scnr = new Scanner(System.in);

        int[][] martixA = new int[2][2];
        int[][] martixB = new int[2][2];
        int[][] sumMartix = new int[2][2];

        System.out.println("Enter elements for Matrix A");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                martixA[i][j] = scnr.nextInt();
            }
        }
        
        System.out.println("Enter elements for Matrix B");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                martixB[i][j] = scnr.nextInt();
            }
        }


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sumMartix[i][j] = martixA[i][j] + martixB[i][j];
            }
        }

        System.out.println("Sum equals");

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.println(sumMartix[i][j]);
            }
        }
        scnr.close();
    }
}