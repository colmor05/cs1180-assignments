public class class_activity_2 {
    public static void main(String[] args) throws Exception {

        int count = 0;
        
        while (true) {

            if (count < 10000) {
                System.out.println(count);
                count = count + 1;
            } else {
                System.out.println("Reached 10,000!");
                break;
            }
        }
    }
}
