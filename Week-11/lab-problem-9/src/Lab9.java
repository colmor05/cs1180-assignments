/**
 * Implementation Lab Problem 9: Treasure Hunt
 * CS1180L - Computer Science 1 Lab
 * Wright State University - Fall 2026
 * 
 * @author Colin Brunson
 * @since 11/7/2026
 */
public class Lab9 {
    /**
     * Prints the row and column of the '+' sign from the 2D array. If there is no '+', an error message will print.
     * @param map The 2D array of the treasure map.
     */
    public static void getCoordinates(char[][] map) {

        // Searches each row and column of the 2D array
        for (int row = 0; row < map.length; row++) {
            for (int col = 0; col < map[row].length; col++) {

                // Checks if the current has the treasure
                // Jackson Marques de Jackson taught how to check something inside a 2D array
                if (map[row][col] == '+') {
                    System.out.println("Start digging in row " + row + ", column " + col);
                    return;
                }
            }
        }
        // Prints if there is no '+' found
        System.out.println("No tresure found");
    }


    /**
     * Removes the '+' from the 2D array and replaces it with a '-'
     * @param map The 2D array of the treasure map.
     */
    public static void digTreasure(char[][] map) {

        // Searches each row and column of the 2D array
        for (int row = 0; row < map.length; row++) {
            for (int col = 0; col < map[row].length; col++) {

                // If a '+' is found, it will replace the '+' with a '-'
                // GeeksforGeeks showed how to replace an element in an array 
                // (https://www.geeksforgeeks.org/java/how-to-replace-a-element-in-java-arraylist/)
                if (map[row][col] == '+') {
                    map[row][col] = '-';

                    System.out.println("Digging tresure in row " + row + ", column " + col);
                    System.out.println("The treasure is gone");
                    return;
                }
            }
        }
        // Prints if there is no '+'
        System.out.println("Can't dig up treasure that ain't there");
    }

    public static void main(String[] args) throws Exception {
        
        // Creates the 2D array of a treasure map
        char[][] map = {
        {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
        {'-', '-', '-', '-', '-', '-', '+', '-', '-', '-'},
        {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
        {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
        {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
        {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
        {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
        {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
        {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'}
        };

        // Finds the coordinates
        getCoordinates(map);

        // Digs the treasure
        digTreasure(map);

        // Checks the map again
        getCoordinates(map);

        // Tries to dig again to test if there is no '+'
        digTreasure(map);
    }
}
