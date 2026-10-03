public class class4 {
    public static void main(String[] args) throws Exception {
        int num = 5;
        System.out.println(factor(num));
    }

    static int factor(int n) {

        int result = 1, i;

        for (i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    static boolean mod(int x) {
        if (x % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

