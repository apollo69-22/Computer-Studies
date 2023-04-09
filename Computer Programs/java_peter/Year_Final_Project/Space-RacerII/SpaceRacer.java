import java.io.IOException;

class SpaceRacer {
    public static int mainMenu() {

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

    public static void game() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        
        int currentAsteroid = 1;
        int numAsteroids = 100;
        int[] asteroidPoints = new int[numAsteroids];
        boolean[] isWormhole = new boolean[numAsteroids];
        int totalPoints = 0;
        boolean enteredWormhole = false;

        System.out.println("Welcome Lieutenant!");
        System.out.println("You are currently on Mars.");
        System.out.println("Use the dice to travel between asteroids and reach Europa!");

        for (int i = 0; i < numAsteroids; i++) {
            asteroidPoints[i] = (int) (Math.random() * 26) + 75;
            isWormhole[i] = Math.random() < 0.13;
        }

        while (currentAsteroid < numAsteroids && !enteredWormhole) {
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
                int diceResult = (int) (Math.random() * 12) + 1;
                currentAsteroid += diceResult;
    
                if (currentAsteroid > numAsteroids) {
                    currentAsteroid = numAsteroids;
                }
    
                if (isWormhole[currentAsteroid-1]) {
                    System.out.println();
                    System.out.println("You rolled a " + diceResult + " and arrived at a wormhole!");
                    System.out.println("Oh no! The wormhole leads to a random location in the universe and you're lost forever...");
                    System.out.println();
                    System.out.println();
                    enteredWormhole = true;
                } else {
                    int points = asteroidPoints[currentAsteroid-1];
                    System.out.println();
                    System.out.println("You rolled a " + diceResult + " and arrived at asteroid " + currentAsteroid + ".");
                    System.out.println("This asteroid is worth " + points + " points!");
                    totalPoints += points;
                }
            }            
        }

        if (!enteredWormhole) {
            System.out.println();
            System.out.println("You have reached Europa!");
            System.out.println("Your total score is: " + totalPoints + " points.");
        }
    }

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
            System.out.println("|                  - Starting Location: Mars                                                                       |");
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
}