public class class11_1 {
    
    public static int calc(int[][] num) {
        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            sum += num[i][i];
        }

        return sum;
    }
    
    public static void main(String[] args) throws Exception {
        int[][] matrix = {
            {10, 2, 3, 4},
            {5, 20, 7, 8},
            {9, 10, 30, 12},
            {13, 14, 15, 40}
        };

        int sum = calc(matrix);
        System.out.println("The sum is: " + sum);
    }
}
