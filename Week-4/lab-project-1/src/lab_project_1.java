import java.util.Scanner;

public class lab_project_1 {
    public static void main(String[] args) throws Exception {
        
        // Allows the use of user input when called
        Scanner scnr = new Scanner(System.in);

        // Asks for your name
        System.out.println("What is your name?");
        String name = scnr.next();

        // Says the player's name and sets the starting location
        System.out.println("Welcome " + name + "!");
        System.out.println("You are standing outside of a castle.");

        // Asks user if they want to enter the castle, enter the forest, or take the road
        System.out.println("What would you like to do? (enter, forest, road)");
        String choise = scnr.next();

        // If statement occurs when user inputs 'enter' and ignores case sensitivity 
        // Ignore case learned from https://www.w3schools.com/JAVA/ref_string_equalsignorecase.asp
        if (choise.equalsIgnoreCase("enter")) {

            // Gives the user a choise between picking a sword or a bow
            System.out.println("You enter the castle and immediately find an armory with a man there.");
            System.out.println("The man spots " + name + " and asks 'Would you like a sword or a bow?'");
            String weapon = scnr.next();

            // If statement occurs when user picks 'bow'
            if (weapon.equalsIgnoreCase("bow")) {

                // Progesses the story and gives an ending
                System.out.println(name + " is handed the bow by the man and is adviced by the man to 'not get shot in the knee'.");
                System.out.println("With the bow in hand " + name + " goes to the throne room to see a giant monster sleeping.");
                System.out.println("With careful aim, " + name + " shoots an arrow at the monster and defeats it.");
                System.out.println("THE END: " + name + " shot the monster with an arrow and saved the castle.");

            // Else if statement occurs when user picks 'sword'
            } else if (weapon.equalsIgnoreCase("sword")) {

                // Progessing the story
                System.out.println("The man picks up a sword from the wall mount and hands it to " + name);
                System.out.println("Before " + name + "takes the sword, the man gives a warning. 'It's dangerous to go alone! Take this.'");
                System.out.println("With a sword in hand, " + name + " moves to the throne room where theres a giant monster.");

                // Health and damage system
                int health = 100;
                int damage = 25;

                // As long as the user's health is greater than 0, there options will loop
                // My uncle suggestest a while loop for the battle system
                while (health > 0) {

                    // Gives the user choises to attack the monster
                    System.out.println(name + " prepares to attack (left, right, jump attack, slide attack, counter attack)");
                    String attack = scnr.next();

                    // If statement occurs when the user picks 'left'
                    if (attack.equalsIgnoreCase("left")) {

                        System.out.println(name + " runs to the left for an attack, but isn't paying attention and runs into a wall.");
                        System.out.println(name + " loses " + damage + " health from the blunder.");
                        
                        // Subtracts 25 health points from the user 
                        health = health - damage;

                        System.out.println("Health remaining: " + health);

                    // Else if statement occurs when the user picks 'right' and is one of the endings
                    } else if (attack.equalsIgnoreCase("right")) {
                            
                        System.out.println(name + " runs to the right for an attack, and successfully catches the monster off guard.");
                        System.out.println(name + " swings the sword at the monster and defeats it.");
                        System.out.println("THE END: " + name + " defeated the monster and saved the castle.");
                        
                        // Breaks out of the loop
                        break;

                    // Else if statement occurs when the user picks 'jump attack'
                    } else if (attack.equalsIgnoreCase("jump attack")) {
                        
                        System.out.println(name + " jumps for an attack, but the monster hits " + name + " in the middle of the air.");
                        System.out.println(name + " loses " + damage + " health from the hit and the fall.");
                        
                        // Subtracts 25 health points from the user 
                        health = health - damage;
                        
                        System.out.println("Health remaining: " + health);

                    // Else if statement occurs when the user picks 'slide attack'    
                    } else if (attack.equalsIgnoreCase("slide attack")) {

                        System.out.println(name + " slides for an attack, but hits a bump and falls face first on the ground. The monster slams " + name + " on top of that.");
                        System.out.println(name + " loses " + damage + " health from getting slammed.");
                        
                        // Subtracts 25 health points from the user 
                        health = health - damage;
                        
                        System.out.println("Health remaining: " + health);
                    
                    // Else if statement occurs when the user picks 'counter attack'
                    } else if (attack.equalsIgnoreCase("slide attack")) {

                        System.out.println(name + " deflects one of the monster's punches and goes for an attack.");
                        System.out.println("However, " + name + " forgot that the monster had another arm and gets punched by it.");
                        System.out.println(name + " loses " + damage + " health from getting punched.");
                        
                        // Subtracts 25 health points from the user 
                        health = health - damage;
                        
                        System.out.println("Health remaining: " + health);
                    }
                }

                // If statement occurs when health counter is 0
                if (health <= 0) {
                    System.out.println("GAME OVER: " + name + " has been defeated by the monster.");
                }
            }
        // Else if statement occurs when the user inputs "forest"
        } else if (choise.equalsIgnoreCase("forest")) {
            
            // Gives user a choise to enter the cabin
            System.out.println(name + " goes through the forest and sees a cabin.");
            System.out.println("Should " + name + " enter the cabin? (yes/no)");
            String cabin = scnr.next();

            // If statement occurs when user inputs 'yes'
            if (cabin.equalsIgnoreCase("yes")) {

                System.out.println(name + " goes into the cabin to find tressure.");
                System.out.println("THE END: " + name + " found treasure in the cabin.");
            
            // Else if statement occurs when user inputs 'no'
            } else if (cabin.equalsIgnoreCase("no")) {

                System.out.println("THE END: " + name + " leaves the forest.");
            }
        // Else if statement occurs when user inputs 'road'
        } else if (choise.equalsIgnoreCase("road")) {
            System.out.println("THE END: " + name + " finds a village and lives a quiet life there.");
        }
    }
}
