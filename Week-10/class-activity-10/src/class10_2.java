public class class10_2 {
    public static void main(String[] args) throws Exception {

        int i;
        int j;
        int[] oneD = new int[4];
        int[][] twoD = new int[2][4];

        oneD[0] = 8;
        oneD[1] = 5;
        oneD[2] = 3;
        oneD [3] = 1;

        for (i = 0; i <= 1; i++) {
            twoD[1][i] = oneD[i];
        }

        for (i = 2; i <= 3; i++) {
            twoD[0][i] = oneD[i];
        }

        for (i = 0; i <= 3; i++) {
            for (j = 0; j <= 3; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
    }
}