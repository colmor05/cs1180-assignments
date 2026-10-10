import java.util.Scanner;
import java.util.Random;

public class project2 {
    public static void main(String[] args) throws Exception {

        String again = "yes";

        // Starts new game if user inputs yes
        while (again.equals("yes")) {

            // Calls to select difficulty
            String mode = selectMode();

            // Calls to play game and saves the score
            int score = playGame(mode);

            System.out.println("End of Round!");
            System.out.println("Your score was " + score + ".");

            // Calls to ask user if they want to play again
            again = playAgain();
        }
        System.out.println("Thanks for playing!");
    }

    // Asks user to select easy or hard mode
    public static String selectMode() {

        Scanner scnr = new Scanner(System.in);

        String mode = "";

        // Loops to keep asking until the user enters a valid mode
        while (!mode.equals("easy") && !mode.equals("hard")) {

            System.out.println("Select difficulty (Easy / Hard)");

            // Gets user input and ignores case and spaces
            // trim() learned from W3Schools
            // (https://www.w3schools.com/java/ref_string_trim.asp)
            mode = scnr.nextLine().toLowerCase().trim();

            // Displays an error if user input is not "easy" or "hard"
            if (!mode.equals("easy") && !mode.equals("hard")) {
                System.out.println("Invalid Difficulty");
            }
        }

        // Returns the mode
        return mode;
    }

    // Runs one game of Simon Says
    public static int playGame(String mode) {

        // Initializes Scanner and Random
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random();

        // Stores the sequence in an array
        String[] sequence = new String[100];

        // Possible colors on easy mode
        String[] colors = { "yellow", "green", "red", "blue" };

        // Score counter
        int score = 0;

        // If true, the game continues
        boolean correct = true;

        // Displays the game mode selected
        if (mode.equals("easy")) {
            System.out.println("Easy mode - Colors");
        } else {
            System.out.println("Hard mode - Numbers");
        }

        // Continues while the user answers correctly
        while (correct && score < sequence.length) {

            if (mode.equals("easy")) {

                // Selects a random color
                sequence[score] = colors[rand.nextInt(4)];
            } else {

                // Selects a random number from 0 to 9
                sequence[score] = String.valueOf(rand.nextInt(10));
            }

            // Displays the entire sequence
            System.out.print("Simon Says: ");

            for (int i = 0; i <= score; i++) {
                System.out.print(sequence[i] + " ");
            }

            // Prints new line
            System.out.println();

            // Waits three seconds and clears the screen
            pauseClear();

            // Asks user to repeat the sequance
            System.out.println("Player repeats:");
            String answer = scnr.nextLine();

            // Removes spaces and ignores case
            // Kayleigh Duncan taught me about regex
            answer = answer.replaceAll("\\s+", "").toLowerCase();

            // Builds a string containing the correct sequence
            String expected = "";

            for (int i = 0; i <= score; i++) {
                expected = expected + sequence[i];
            }

            // Checks if the user's answer matches the sequence
            if (answer.equals(expected)) {

                // Increases the score after a correct answer
                score++;

                // Displays current score
                System.out.println("Score: " + score);

            } else {

                // Ends the game if the answer is incorrect
                correct = false;
            }
        }

        // Returns the final score to main
        return score;
    }

    // Pauses for 3 seconds
    public static void pauseClear() {

        try {
            // Waits for 3 seconds
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }

        // Prints 100 blank lines
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }

    // Asks user if they want to play again
    public static String playAgain() {

        Scanner scnr = new Scanner(System.in);

        String answer = "";

        while (!answer.equals("yes") && !answer.equals("no")) {
            System.out.println("Would you like to play again? (Yes / No)");

            answer = scnr.nextLine().toLowerCase().trim();

            if (!answer.equals("yes") && !answer.equals("no")) {
                System.out.println("Invalid choice");
            }
        }

        return answer;
    }
}