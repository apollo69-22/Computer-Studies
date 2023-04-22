//Importing extra tools for game
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;

class SpaceRacer {
    /******************Welcome Screen******************/
    public static int mainMenu()throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        System.out.println(" ___________________________________");
        System.out.println("|      WELCOME TO SPACE RACER       |");
        System.out.println("|                                   |");
        System.out.println("| 1. Game Instructions              |");
        System.out.println("| 2. Play Game                      |");
        System.out.println("| 3. Exit                           |");
        System.out.println("|___________________________________|");
        System.out.println();
        
        System.out.print("Enter a choice: ");
        int choice = Keyboard.readInt();
        System.out.println();

        return choice;
    }
    /************************************************************/

    /*****************Game Methods & Functions******************/
    public static void getStats(int lives, int money, String currentPosition) {
        if (money == 0) {
            System.out.println("  ______________________________________");
            System.out.println(" |   Lives   |   Money   |   Location   |");
            System.out.println(" |     " +  lives  + "     |   S-$" + money + "    |    " + currentPosition + "     |");
            System.out.println(" |______________________________________|");
        }
        else {
            System.out.println("  ______________________________________");
            System.out.println(" |   Lives   |   Money   |   Location   |");
            System.out.println(" |     " +  lives  + "     | S-$" + money + "  |    " + currentPosition + "     |");
            System.out.println(" |______________________________________|");
        }
    }

    public static void getStore(Map<String, Integer> inventory) {
        System.out.println(inventory.get("Ship Repairs"));
        System.out.println(" _______________________________________________________________________");
        System.out.println("|                                 STORE                                 |");
        System.out.println("|                                                                       |");
        System.out.printf("|                1. Repair Ship:               S-$%d                 |\n", inventory.get("Ship Repairs"));
        System.out.println("|                                                                       |");
        System.out.println("|_______________________________________________________________________|");
    }
    /***********************************************************/

    /********************Game Initialization********************/
    public static void game_init_(Map<String, String> star_map, Map<String, Integer> inventory) {
        inventory.put("Ship Repairs", 10000); //Declaring a map type String, String to "Repair Ship", "S-$10,000"
    }
    /***********************************************************/

    public static int getRandom(int max, int min) {
        int rand = (int)(Math.random() * (max - min) + min);
        return rand;
    } 

    /************************Game Method************************/
    public static void game() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        
        /***************Variable Initialization****************/
        int currentAsteroid = 1; //Declaring a variable named currentAsteroid to 1
        int numAsteroids = 100;  //Declaring a variable named numAsteroids to 100

        int[] asteroidPoints = new int[numAsteroids];        //Declaring an array named asteroidPoints to the number of asteroids the user is at
        boolean[] isWormhole = new boolean[numAsteroids];    //Declaring an array named isWormhole to the number of asteroids the user is at
        //boolean enteredWormhole = false;

        int totalPoints = 0;  //Declaring a variable named totalPoints to 0
        int lives = 3;        //Declaring a variable named lives to 3 
        int money = 20000;    //Declaring a variable named money to 20000

        /*Map<String, Integer> stats = new HashMap<>();
        stats.put("totalPoints", 0);
        stats.put("lives", 3);
        stats.put("money", 20000);*/

        Map<String, Integer> inventory = new HashMap<>(); //This map type String, String is connectedto the method getStore()
        inventory.put("Ship Repairs", 10000); //Declaring a map type String, String to "Repair Ship", "S-$10,000"

        String[] position = {"Sun", "Mercury", "Venus", "Earth", "Mars", "Europa", 
        "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto", "UNKNOWN"}; //Declaring an array named position and it stores all of the positions used in this game
        String currentPosition = position[3]; //Starting position is set to position 3 (Earth)
        /******************************************************/

        char choice = ' ';
        while (choice != 'T' | choice != 't') { //This while loop will work only if the user enters the letter 'T' or 't', otherwise it will print an error
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

            System.out.println("Welcome Lieutenant!");
            System.out.println("You are currently on " + currentPosition + ".");

            System.out.print("Press T to travel to Mars: ");
            choice = Keyboard.readChar();
            if (choice == 'T' | choice == 't') {  //Checks if user entered 'T' or 't' in the variable choice
                System.out.println();
                System.out.println("You have arrived on " + position[4] + "!");
                System.out.println("Use the dice to travel between asteroids and reach Europa!");

                //Randomizing Asteroid & Wormhole Chances
                for (int i = 0; i < numAsteroids; i++) {
                    //asteroidPoints[i] = (int)(Math.random() * 26) + 75;
                    asteroidPoints[i] = (int)(Math.random() *(100-75) + 75); //verify this works like line 110
                    isWormhole[i] = Math.random() < 0.30;
                }
                
                ///hawn ross zubbi!!
                while (currentAsteroid < numAsteroids && lives > 0 && money >= 0) {
                    System.out.println();
                    System.out.print("Press R to roll the dice and travel to a new asteroid: ");
                    char roll = Keyboard.readChar();
                    if (roll == 'R' | roll == 'r') { //Checks if user entered 'R' or 'r' in the variable choice
                        int die1 = (int)(Math.random() * 6) + 1; //range in this one is 6 which equals to (max 6 - min 0) and starts from min == 1
                        int die2 = (int)(Math.random() * 6) + 1;
                        int diceResult = die1 + die2;
                        currentAsteroid += diceResult;
            
                        //This if will run everytime until currentAsteroid is equal to numAsteroids 
                        if (currentAsteroid > numAsteroids) {
                            currentAsteroid = numAsteroids;
                        }

                        int challengeType = (int)(Math.random() * 1) + 1; //Variable challengeType is created to randomize 4 chances of different ypes of challenges
                        if (isWormhole[currentAsteroid-1]) {
                            switch (challengeType) {
                                /*case 1:
                                        System.out.println();
                                        System.out.println("You rolled a " + diceResult + " and arrived at a wormhole!");
                                        currentPosition = position[0];
                                        System.out.println("Oh no! The wormhole led to the " + currentPosition + ". Oops you burned up..");
                                        lives--;
                                        System.out.println("You have " + lives + " lives left.");
                                        if (lives == 0) {
                                            System.out.println();
                                            System.out.println("GAME OVER!");

                                            try {
                                                Thread.sleep(5000);
                                            } catch (InterruptedException e) {
                                                Thread.currentThread().interrupt();
                                            }

                                            return;
                                        }

                                        try {
                                            Thread.sleep(5000);
                                        } catch (InterruptedException e) {
                                            Thread.currentThread().interrupt();
                                        }
                                        
                                        enteredWormhole = true;
                                break;

                                case 2:
                                        System.out.println();
                                        System.out.println("You rolled a " + diceResult + " and arrived at a wormhole!");
                                        currentPosition = position[11];
                                        System.out.println("Oh no! The wormhole led to an " + currentPosition + " location in the universe and you're lost forever...");
                                        lives--;
                                        System.out.println("You have " + lives + " lives left.");
                                        if (lives == 0) {
                                            System.out.println();
                                            System.out.println("GAME OVER!");

                                            try {
                                                Thread.sleep(5000);
                                            } catch (InterruptedException e) {
                                                Thread.currentThread().interrupt();
                                            }

                                            return;
                                        }

                                        try {
                                            Thread.sleep(5000);
                                        } catch (InterruptedException e) {
                                            Thread.currentThread().interrupt();
                                        }

                                        enteredWormhole = true;
                                break;*/

                                case 1:        
                                    System.out.println();
                                    System.out.println("You rolled a " + diceResult + " and you got hit by a meteoroid!");
                                    System.out.println("You have to go back to Earth to repair your ship or else you will die and LOSE!!");

                                    choice = ' ';
                                    while (choice != 'n' && choice != 'N' && choice != 'y' && choice != 'Y') {
                                        System.out.println();
                                        System.out.print("Do you want to travel back to Earth? (Y/N): ");
                                        choice = Keyboard.readChar();

                                        if (choice != 'n' && choice != 'N' && choice != 'y' && choice != 'Y') {
                                            System.out.print("Error. Press (Y/N) to continue.");

                                            try {
                                                Thread.sleep(2000);
                                            } catch (InterruptedException e) {
                                                Thread.currentThread().interrupt();
                                            }
                                        }

                                        else if (choice == 'n' || choice == 'N') {
                                            System.out.println();
                                            System.out.println("GAME OVER!");
                                            System.out.print("You did not repair your ship, therefore you couldn't continue the mission!");

                                            try {
                                                Thread.sleep(4000);
                                            } catch (InterruptedException e) {
                                                Thread.currentThread().interrupt();
                                            }
                                            return;
                                        }

                                        else if (choice == 'y' || choice == 'Y') {
                                            boolean repairedShip = false;// Resets the value of repairedShip to false everytime it runs again
                                            currentPosition = position[3];
                                            
                                            
                                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                                            System.out.println("Welcome back to " + currentPosition + ", Lieutenant!");
                                            System.out.println("We noticed your ship needs a few repairs.");
                                            System.out.println();
                                            System.out.print("HINT: Type 'Help' for a list of commands.");

                                            String command_lst[] = {"Leave Earth", "Help", "Stats", "Store",};
                                            
                                            String command = "";
                                            while(!command.equals(command_lst[0]) || !repairedShip) { //This while loop will run until user enters "Leave Earth" and ship must be repaired
                                                System.out.print("\nCommand: ");
                                                command = Keyboard.readString();

                                                if (command.equals(command_lst[0]) && !repairedShip) {
                                                    System.out.println();
                                                    System.out.println("Can't Leave Earth, your ship is still broken ;)");

                                                    try {
                                                        Thread.sleep(5000);
                                                    } catch (InterruptedException e) {
                                                        Thread.currentThread().interrupt();
                                                    }
                                                }
                                    
                                                else if (command.equals(command_lst[1])) {
                                                    System.out.print("\n| ");
                                                    for (int i = 0; i < command_lst.length; i++) {
                                                        System.out.print(command_lst[i] + " : ");
                                                    }
                                                    System.out.print("|\n");
                                                }
                                                else if (command.equals(command_lst[2])) {
                                                    getStats(lives, money, currentPosition);
                                                }
                                                else if (command.equals(command_lst[3])) {
                                                    getStore(inventory);

                                                    System.out.println();
                                                    System.out.println("Pick what you need Lieutenant.");
                                                    System.out.print("Choice: ");
                                                    int storeChoice = Keyboard.readInt();

                                                    if (storeChoice == 1) {
                                                        System.out.println(money);
                                                        if (money <= 0) {
                                                            System.out.println("You ran out of money and you can't repair your ship.");
                                                            System.out.println("Lieutenant, its GAME OVER!");

                                                            try {
                                                                Thread.sleep(5000);
                                                            } catch (InterruptedException e) {
                                                                Thread.currentThread().interrupt();
                                                            }
                                                            return;
                                                        }
                                                        else {
                                                            //negates the cost of ship repairs from current money
                                                            money -= inventory.get("Ship Repairs");
                                                            repairedShip = true;

                                                            System.out.println();
                                                            System.out.println("Lieutenant, we have just repaired your ship.");
                                                            System.out.printf("That costed you %d Starfleet Dollars!", inventory.get("Ship Repairs"));

                                                            try {
                                                                Thread.sleep(2500);
                                                            } catch (InterruptedException e) {
                                                                Thread.currentThread().interrupt();
                                                            }

                                                            System.out.println();
                                                            System.out.printf("\nYou have %d Starfleet Dollars left!", money);
                                                            System.out.println();

                                                            System.out.println("Lieutenant, now you can keep going on your journey!");
                                                            System.out.println("Good Luck and don't DIE!");

                                                            try {
                                                                Thread.sleep(5000);
                                                            } catch (InterruptedException e) {
                                                                Thread.currentThread().interrupt();
                                                            }
                                                        }
                                                    }
                                                    else {
                                                        System.out.println();
                                                        System.out.println("Invalid Option");
                                                        System.out.println("Type 'Store' again to retry...");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                break;

                                /*case 4:
                                        System.out.println();
                                        System.out.println("You rolled a " + diceResult + " and arrived at a wormhole!");
                                        currentPosition = position[5];
                                        System.out.println("Congratulations this wormhole led straight to " + currentPosition + "!");
                                        System.out.println();

                                        try {
                                            Thread.sleep(3000);
                                        } catch (InterruptedException e) {
                                            Thread.currentThread().interrupt();
                                        }

                                        System.out.println("Let's hope you managed to get as many points as you could then, Lieutenant!");
                                        try {
                                            Thread.sleep(2000);
                                        } catch (InterruptedException e) {
                                            Thread.currentThread().interrupt();
                                        }
                                        System.out.println("Because...");
                                        try {
                                            Thread.sleep(2000);
                                        } catch (InterruptedException e) {
                                            Thread.currentThread().interrupt();
                                        }
                                        System.out.println("Your total score is: " + totalPoints + " points.");

                                        try {
                                            Thread.sleep(3000);
                                        } catch (InterruptedException e) {
                                            Thread.currentThread().interrupt();
                                        }

                                        return;*/
                            }
                        }
                        else { //If challengeType isn't executed then user is told the dice result and that they moved to the next asteroid
                            int points = asteroidPoints[currentAsteroid-1];
                            System.out.println();
                            System.out.println("You rolled a " + diceResult + " and arrived at asteroid " + currentAsteroid + ".");
                            System.out.println("This asteroid is worth " + points + " points!");

                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                Thread.currentThread().interrupt();
                            }

                            totalPoints += points;
                        }
                    }
                    else { //If user entered another letter than 'R' or 'r', the game will print an error message
                        System.out.println("Error. Press R to roll the dice and travel to a new asteroid.");

                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }            
                }

                if (currentAsteroid >= numAsteroids) { //If the currentAsteroid the user is on is greater or equal to the numAsteroids(100) then the user is done from game and congratulating message is outputted
                    System.out.println();
                    System.out.println("CONGRATULATIONS!");
                    System.out.println("You have reached Europa!");
                    System.out.println("Your total score is: " + totalPoints + " points.");

                    try {
                        Thread.sleep(7000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }

                    return;
                }
            }
            else {  //If user entered another letter than 'T' or 't', the game will print an error message
                System.out.print("\nError. Press T to travel to Mars.");

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
    /************************************************************/


    /******************Instructions Menu******************/
    public static void instructions() throws IOException, InterruptedException {        
        char choice = ' ';
    
        while (choice != 'B' && choice != 'b') { //The instructions will be shown to user until they press 'B' or 'b', if they do it will return to main()
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

            System.out.println(" __________________________________________________________________________________________________________________");
            System.out.println("|                                                  Instructions:                                                   |");
            System.out.println("|                                                                                                                  |");
            System.out.println("|You are a new Lieutenant in Starfleet.                                                                            |");
            System.out.println("|You're assigned to Company Alpha under Captain James T. Kirk. Assigned to the Orbiter IV!                         |");
            System.out.println("|You're heading to Europa, one of Jupiter's Moons to explore any Alien life you may find.                          |");
            System.out.println("|Unfortunately on the way you have to cross a set of asteroids.                                                    |");
            System.out.println("|                                                                                                                  |");
            System.out.println("|Mission:                                                                                                          |");
            System.out.println("|Help Captain Kirk make it to Europa safely.                                                                       |");
            System.out.println("|                                                                                                                  |");
            System.out.println("|Objective:                                                                                                        |");
            System.out.println("|You must roll two dice (6 & 6) and move forward several asteroids depending on the dice's result.                 |");
            System.out.println("|You must keep doing this until you reach Europa.                                                                  |");
            System.out.println("|                                                                                                                  |");
            System.out.println("|CAUTION:                                                                                                          |");
            System.out.println("|Space junk is dangerous!                                                                                          |");
            System.out.println("|Some asteroids will give you a set of points and some will be wormholes.                                          |");
            System.out.println("|If you pass through a wormhole you can end up:                                                                    |");
            System.out.println("|                                               - near the Sun                                                     |");
            System.out.println("|                                               - in an Unknown Location in the universe                           |");
            System.out.println("|                                               - gettig hit by meteoroids                                         |");
            System.out.println("|                                               - or making it to Europa                                           |");
            System.out.println("|                                                                                                                  |");
            System.out.println("|If you end up near the Sun you'll burn up and lose a life.                                                        |");
            System.out.println("|If you en up in an Unknown location in the universe you'll die and lose a life.                                   |");
            System.out.println("|If you end up hit by a meteoroid you'll have to go back to Earth to repair your ship from a store,                |");
            System.out.println("|otherwise you'll die and it's GAME OVER!!                                                                         |");
            System.out.println("|If you repair your ship you'll be brought back to the last asteroid you were at before you got hit.               |");
            System.out.println("|                                                                                                                  |");
            System.out.println("|Starting Stats:                                                                                                   |");
            System.out.println("|                  - 3 Lives                                                                                       |");
            System.out.println("|                  - S-$20,000 (Starfleet Dollars)                                                                 |");
            System.out.println("|                  - Starting Location: Earth                                                                      |");
            System.out.println("|                                                                                                                  |");
            System.out.println("|Tips:                                                                                                             |");
            System.out.println("|      Try: 'Help' for a list of commands!                                                                         |");
            System.out.println("|            This will give you the options for you to see your:                                                   |");
            System.out.println("|            Stats and a Store                                                                                     |");
            System.out.println("|__________________________________________________________________________________________________________________|");
            
            System.out.println();
            System.out.print("Press B to continue: ");
            choice = Keyboard.readChar();

            if (choice != 'B' && choice != 'b') {
                System.out.print("\nError. Press B to continue.");

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
    /************************************************************/

    
    /******************main Method******************/
    public static void main(String[] args) throws IOException, InterruptedException {
        int choice = 0;

        while (choice != 3) { //This while loop will keep running until 3 is pressed, if so program will exit
            choice = mainMenu();

            switch (choice) {
                case 1:
                    instructions();
                break;

                case 2:
                    game();
                break;

                case 3:
                break;

                default:
                    System.out.println("Error. Please enter a number from 1 to 3.");

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                break;
            }
        }
    }
    /************************************************************/
}