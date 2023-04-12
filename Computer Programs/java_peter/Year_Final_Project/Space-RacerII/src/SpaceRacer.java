import java.io.IOException;
import java.util.Map;
import java.util.HashMap;

class SpaceRacer {
    /******************Welcome Screen******************/
    public static int mainMenu()throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        System.out.println(" ___________________________________");
        System.out.println("|     WELCOME TO SPACE TRAVELER     |");
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
        System.out.println("  ______________________________________");
        System.out.println(" |   Lives   |   Money   |   Location   |");
        System.out.printf(" |     %s     | S-$%s  |    %s     |\n", lives, money, currentPosition);
        System.out.println(" |______________________________________|");
    }

    public static void getMap(Map<String, String> star_map) {
        System.out.println();
        System.out.println(star_map);
    }

    public static void check_location(String location, Map<String, String> star_map) {
        String output = "not found";

        for(Map.Entry<String, String> loc: star_map.entrySet()) {
            if (loc.getKey().equals(location)) {
                output = location + ": " + loc.getValue();
                break;
            }
            else if (loc.getValue().equals(location)) {
                output = location + ": " + loc.getKey();
                break;
            }
        }
        System.out.printf("\n%s\n", output);
    }

    public static void getStore(Map<String, String> inventory) {
        System.out.println(" _______________________________________________________________________");
        System.out.println("|                                 STORE                                 |");
        System.out.println("|                                                                       |");
        System.out.println("|                1. Repair Ship:               S-$10,000                |");
        System.out.println("|                                                                       |");
        System.out.println("|_______________________________________________________________________|");
    }
    /***********************************************************/

    /********************Game Initialization********************/
    public static void game_init_(Map<String, String> star_map, Map<String, String> inventory) {
        star_map.put("SUN", "0:0:0");
        star_map.put("MERCURY", "0:0:0");
        star_map.put("VENUS", "0:0:0");
        star_map.put("EARTH", "-0.992:-0.1:0");
        star_map.put("MARS", "0:0:0");
        star_map.put("JUPITER", "0:0:0");
        star_map.put("SATURN", "0:0:0");
        star_map.put("URANUS", "0:0:0");
        star_map.put("NEPTUNE", "0:0:0");
        star_map.put("PLUTO", "0:0:0");

        inventory.put("Repair Ship ", " S-$10,000");
    }
    /***********************************************************/

    /************************Game Method************************/
    public static void game() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        
        /***************Variable Initialization****************/
        int currentAsteroid = 1;
        int numAsteroids = 100;
        int[] asteroidPoints = new int[numAsteroids];
        boolean[] isWormhole = new boolean[numAsteroids];
        boolean[] isMeteoroid = new boolean[numAsteroids];
        boolean enteredWormhole = false;

        int totalPoints = 0;
        int lives = 3;
        int money = 20000;

        Map<String, String> star_map = new HashMap<>();
        Map<String, String> inventory = new HashMap<>();

        String[] position = {"Sun", "Mercury", "Venus", "Earth", "Mars", "Europa", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto", "UNKNOWN"};
        String currentPosition = position[3];
        /******************************************************/

        char choice = ' ';
        while (choice != 'T' && choice != 't') {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

            System.out.println("Welcome Lieutenant!");
            System.out.println("You are currently on " + currentPosition + ".");

            System.out.print("Press T to travel to Mars: ");
            choice = Keyboard.readChar();
            if (choice != 'T' && choice != 't') {
                System.out.print("\nError. Press T to travel to Mars.");

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            else {
                System.out.println();
                System.out.println("You have arrived on " + position[4] + "!");
                System.out.println("Use the dice to travel between asteroids and reach Europa!");

                //Randomizing Asteroid & Wormhole Chances
                for (int i = 0; i < numAsteroids; i++) {
                    asteroidPoints[i] = (int) (Math.random() * 26) + 75;
                    isWormhole[i] = Math.random() < 0.25;
                    isMeteoroid[i] = Math.random() < 0.25;

                }
                
                while (currentAsteroid < numAsteroids && lives > 0) {
                    System.out.println();
                    System.out.print("Press R to roll the dice and travel to a new asteroid: ");
                    char roll = Keyboard.readChar();
                    if (roll != 'R' && roll != 'r') {
                        System.out.println("Error. Press R to roll the dice and travel to a new asteroid.");

                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    else {
                        int diceResult = (int)(Math.random() * 12) + 1;
                        currentAsteroid += diceResult;
            
                        if (currentAsteroid > numAsteroids) {
                            currentAsteroid = numAsteroids;
                        }

                        int challengeType = (int)(Math.random() * 1) + 1;
                        if (isWormhole[currentAsteroid-1]) {
                            switch (challengeType) {
                                /*case 1:
                                    System.out.println();
                                    System.out.println("You rolled a " + diceResult + " and arrived at a wormhole!");
                                    currentPosition = position[0];
                                    System.out.println("Oh no! The wormhole lead to the " + currentPosition + ". Oops you burned up..");
                                    lives--;
                                    System.out.println("You have " + lives + " lives left.");
                                    if (lives == 0) {
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
                                    System.out.println("Oh no! The wormhole lead to an " + currentPosition + " location in the universe and you're lost forever...");
                                    lives--;
                                    System.out.println("You have " + lives + " lives left.");
                                    if (lives == 0) {
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

                                case 3:
                                    System.out.println();
                                    System.out.println("You rolled a " + diceResult + " and arrived at a wormhole!");
                                    currentPosition = position[5];
                                    System.out.println("Congratulations this wormhole lead straight to " + currentPosition + "!");
                                    System.out.println("Your total score is: " + totalPoints + " points.");

                                    try {
                                        Thread.sleep(5000);
                                    } catch (InterruptedException e) {
                                        Thread.currentThread().interrupt();
                                    }

                                    enteredWormhole = true;
                                return;*/

                                case 1:
                                    System.out.println();
                                    System.out.println("You rolled a " + diceResult + " and you got hit by a meteoroid!");
                                    System.out.println("You have to go back to Earth to repair your ship or else you will die!");
                                    
                                    choice = ' ';
                                    while (!(choice == 'Y' || choice == 'y' || choice == 'N' || choice == 'n')) {

                                        System.out.print("Do you want to travel back to Earth? (Y/N): ");
                                        choice = Keyboard.readChar();
                                        if (!(choice == 'Y' || choice == 'y' || choice == 'N' || choice == 'n')) {
                                            System.out.print("\nError. Press (Y/N) to continue.");

                                            try {
                                                Thread.sleep(2000);
                                            } catch (InterruptedException e) {
                                                Thread.currentThread().interrupt();
                                            }
                                        }
                                        else {
                                            currentPosition = position[3];
                                            System.out.println();
                                            System.out.println("Welcome back to " + currentPosition + ", Lieutenant!");
                                            System.out.println("We noticed your ship needs a few repairs.");
                                            System.out.println();
                                            System.out.print("HINT: Type 'Help' for a list of commands.");

                                            String command_lst[] = {
                                                "Exit", "Help", "Stats", "Find: ", "StarMap", "Store"};
                                    
                                            String command = "";
                                            while(!command.equals(command_lst[0])) {
                                                System.out.print("\nCommand: ");
                                                command = Keyboard.readString();
                                    
                                                if (command.equals(command_lst[1])) {
                                                    System.out.print("\n| ");
                                                    for (int i = 0; i < command_lst.length; i++) {
                                                        System.out.print(command_lst[i] + " : ");
                                                    }
                                                    System.out.print("|\n");
                                                }
                                                else if (command.equals(command_lst[2])) {
                                                    getStats(lives, money, currentPosition);
                                                }
                                                else if (command.contains(command_lst[4])) {
                                                    String x[] = command.split(" ");
                                                    check_location(x[1], star_map);
                                                }
                                                else if (command.contains(command_lst[4])) {
                                                    getMap(star_map);
                                                }
                                                else if (command.contains(command_lst[5])) {
                                                    getStore(inventory);

                                                    if (command.equals(1)) {
                                                        System.out.println("Lieutenant, we have just repairedm your ship.");
                                                        System.out.println("That costed you 10,000 Starfleet Dollars!");
                                                        money -= 10000;
                                                        System.out.println("You have " + money + " Starfleet Dollars!");
                                                        System.out.println();
                                                        System.out.println("Lieutenant, now you can keep going on your journey!");
                                                        System.out.println("Good Luck and don't DIE!");
                                                        
                                                        
                                                    }
                                                    /*else if (command !=1)
                                                        System.out.println("Not In Store!");*/
                                                }
                                            }
                                        }
                                        /*if (choice == 'N' && choice == 'n') {
                                            System.out.println("YOU LOST!");
                                            System.out.println("You did not repair your ship, therefore you died!");

                                            try {
                                                Thread.sleep(4000);
                                            } catch (InterruptedException e) {
                                                Thread.currentThread().interrupt();
                                            }

                                            return;                                
                                        }*/
                                    }
                                break;
                            }
                        }
                        else {
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
                }

                if (currentAsteroid >= numAsteroids /*|| lives == 0*/) {
                    System.out.println();
                    if (currentAsteroid >= numAsteroids) {
                        System.out.println("You have reached Europa!");
                    } else {
                        System.out.println("GAME OVER!");
                    }
                    System.out.println("Your total score is: " + totalPoints + " points.");
                
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }
    /************************************************************/


    /******************Instructions Menu******************/
    public static void instructions() throws IOException, InterruptedException {        
        char choice = ' ';
    
        while (choice != 'B' && choice != 'b') {
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
            System.out.println("|You must roll a dice and move forward several asteroids depending on the die's result.                            |");
            System.out.println("|You must keep doing this until you reach Europa.                                                                  |");
            System.out.println("|                                                                                                                  |");
            System.out.println("|CAUTION:                                                                                                          |");
            System.out.println("|Space junk is dangerous!                                                                                          |");
            System.out.println("|Some asteroids will give you a set of points and some will be wormholes.                                          |");
            System.out.println("|If you pass through a wormhole you can end up anywhere in the universe! Therefore you will die.                   |");
            System.out.println("|                                                                                                                  |");
            System.out.println("|Starting Stats:                                                                                                   |");
            System.out.println("|                  - 3 Lives                                                                                       |");
            System.out.println("|                  - S-$20,000 (Starfleet Dollars)                                                                 |");
            System.out.println("|                  - Starting Location: Earth                                                                      |");
            System.out.println("|                                                                                                                  |");
            System.out.println("|Tips:                                                                                                             |");
            System.out.println("|      Try: 'Help' for a list of commands!                                                                         |");
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

        while (choice != 3) {
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