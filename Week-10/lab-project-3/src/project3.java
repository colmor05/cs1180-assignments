import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Implementation Project 3: Word Game
 * CS1180L - Computer Science 1 Lab
 * Wright State University - Fall 2026
 * 
 * @author Colin Brunson
 * @since 10/29/2026
 */
public class project3 {

    // GeeksForGeeks showed info on static variables (https://www.geeksforgeeks.org/java/static-variables-in-java/)
    // Stores words from words.txt
    static ArrayList<String> words = new ArrayList<>();

    // Stores the valid words
    static ArrayList<String> guessedWords = new ArrayList<>();

    // Stores the word and scrambled letters
    static String gameWord;
    static String letters;

    // Keeps track of the game score
    static int score = 0;

    public static void main(String[] args) throws Exception {

        // Loads words.txt
        loadWords();

        // Chooses the word
        chooseWord();

        // Scrambles the word
        mixLetters();

        System.out.println("Letters: " + letters);
        System.out.println("Score: " + score);

        Scanner scnr = new Scanner(System.in);
        String command = "";

        // If user does not enter "bye", it continues
        while (!command.equals("bye")) {

            // Input while being case-insensitive.
            command = scnr.nextLine().toLowerCase();

            // Scrambles the letters
            if (command.equals("mix")) {
                mixLetters();
                System.out.println(letters);

                // Displays guessed words
            } else if (command.equals("ls")) {
                listWords();

                // Checks a word entered by the player
            } else if (!command.equals("bye")) {
                checkGuess(command);
            }

            // Displays score after each input
            if (!command.equals("bye")) {
                System.out.println("Score: " + score);
            }
        }
        scnr.close();
    }

    /**
     * Reads words from words.txt into the word list
     */
    public static void loadWords() {
        try {
            Scanner file = new Scanner(new File("words.txt"));

            // Reads each word
            while (file.hasNext()) {
                String word = file.next();
                words.add(word);
            }

            file.close();

        // Shows error if words.txt is not found
        } catch (FileNotFoundException e) {
            System.out.println("Could not find words.txt");
        }
    }

    /**
     * Chooses a random seven letter word with unique letters
     */
    public static void chooseWord() {

        // Stores words
        ArrayList<String> choices = new ArrayList<String>();

        // Only accepts seven letter words
        for (String word : words) {
            if (word.length() == 7 && uniqueLetters(word)) {
                choices.add(word);
            }
        }

        // Selects a random word
        int number = (int) (Math.random() * choices.size());
        gameWord = choices.get(number);

        // Saves original letters
        letters = gameWord;
    }

    /**
     * Checks if every letter in a word is unique
     * 
     * @param word The word to check
     * @return True if all letters are unique
     */
    public static boolean uniqueLetters(String word) {

        // Compares each letter with the letter after it
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {

                if (word.charAt(i) == word.charAt(j)) {
                    return false;
                }
            }
        }

        return true;
    }

    /**
     * Shuffles the seven letters
     */
    public static void mixLetters() {

        // Puts each letter into a list so it can be shuffled
        ArrayList<Character> list = new ArrayList<Character>();

        for (int i = 0; i < gameWord.length(); i++) {
            list.add(gameWord.charAt(i));
        }

        // Shuffles letters
        // Greg Rosen showed how to shuffle an ArrayList
        Collections.shuffle(list);

        // Builds a new string from the shuffled letters
        letters = "";

        for (char letter : list) {
            letters += letter;
        }
    }

    /**
     * Checks if a guess can be made using the letters
     * 
     * @param guess The word entered by the user
     * @return true if the required letters are available
     */
    public static boolean validLetters(String guess) {
        // Makes a copy of the word
        String available = gameWord;

        // Check every letter in the user's guess
        for (int i = 0; i < guess.length(); i++) {
            char letter = guess.charAt(i);

            // Finds the position of the letter
            int position = available.indexOf(letter);

            if (position == -1) {
                return false;
            }

            // Removes the used letter to not be used twice
            available = available.substring(0, position) + available.substring(position + 1);
        }

        return true;
    }

    /**
     * Checks a guess and adds points for a valid word
     * 
     * @param guess the word entered by the user
     */
    public static void checkGuess(String guess) {

        // If the word is less than 4 letters
        if (guess.length() < 4) {
            return;
        }

        // Does not award points for words already guessed
        if (guessedWords.contains(guess)) {
            System.out.println("Word already guessed.");
            return;
        }

        // Checks the letter and dictionary before adding points
        if (!validLetters(guess) || !words.contains(guess)) {
            System.out.println("Invalid word.");
            return;
        }

        // Remembers the valid guess
        guessedWords.add(guess);

        // Adds 1 point for four letter words
        if (guess.length() == 4) {
            score++;

            // 1 point for each letter if longer than 4 letters
        } else {
            score += guess.length();
        }
    }

    /**
     * Displays all vailid words guessed by the user
     */
    public static void listWords() {
        for (String word : guessedWords) {
            System.out.println(word);
        }
    }

}
