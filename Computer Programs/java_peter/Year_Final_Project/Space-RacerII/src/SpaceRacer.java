import java.io.IOException;

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


    /************************Game Method************************/
    public static void game() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        
        /***************Variable Initialization****************/
        char choice = 0;
        int currentAsteroid = 1;
        int numAsteroids = 100;
        int[] asteroidPoints = new int[numAsteroids];
        boolean[] isWormhole = new boolean[numAsteroids];
        boolean[] isMeteoroid = new boolean[numAsteroids];
        int totalPoints = 0;
        int lives = 3;
        boolean enteredWormhole = false;

        String[] position = {"Earth", "Mars"};
        String currentPosition = position[0];
        /******************************************************/

        System.out.println("Welcome Lieutenant!");
        System.out.println("You are currently on " + currentPosition + ".");

        System.out.print("Press T to travel to Mars: ");
        choice = Keyboard.readChar();
        if (choice == 'T' || choice == 't') {
            System.out.println();
            System.out.println("You have arrived on " + position[1] + "!");
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

                    int challengeType = (int)(Math.random() * 4) + 1;
                    if (isWormhole[currentAsteroid-1]) {
                    switch (challengeType) {
                        case 1:
                            System.out.println();
                            System.out.println("You rolled a " + diceResult + " and arrived at a wormhole!");
                            System.out.println("Oh no! The wormhole lead to the Sun. Oops you burned up..");
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
                            System.out.println("Oh no! The wormhole lead to an unknown location in the universe and you're lost forever...");
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
                            System.out.println("Congratulations this wormhole lead straight to Europa!");
                            System.out.println("Your total score is: " + totalPoints + " points.");

                            try {
                                Thread.sleep(5000);
                            } catch (InterruptedException e) {
                                Thread.currentThread().interrupt();
                            }

                            enteredWormhole = true;
                        return;

                        case 4:
                            System.out.println();
                            System.out.println("You rolled a " + diceResult + " and you got hit by a meteoroid!");
                            System.out.println("You have to go back to Earth to repair your ship or else you will die!");

                            System.out.print("Do you want to travel back to Earth? (Y/N): ");
                            choice = Keyboard.readChar();
                            if (choice == 'Y' && choice == 'y') {
                                System.out.println(position[0]);
                                System.out.println("Welcome back to " + currentPosition + " Lieutenant!");
                                System.out.println("");

                                String command_lst[] = {
                                    "Exit", "Help", "Stats", "find: ", "starmap", "travel: "};
                        
                                /*String command = "";
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
                                        getStats(stats);
                                    }
                                    else if (command.equals(command_lst[3])) {
                                        getShipCargo(ship_cargo);
                                    }
                                    else if (command.contains(command_lst[4])) {
                                        String x[] = command.split(" ");
                                        String output = check_location(x[1], star_map);
                                        System.out.printf("\n%s\n", output);
                                    }
                                    else if (command.contains(command_lst[5])) {
                                        getMap(star_map);
                                    }
                                    else if (command.contains(command_lst[6])) {
                                        String x[] = command.split(" ");
                                        stats[0] = current_location = travel(current_location, x[1], star_map);
                                    }
                                }*/
                            } 
                            else {
                                System.out.println("YOU LOST!");
                                System.out.println("You did not repair your ship, therefore you died!");

                                try {
                                    Thread.sleep(4000);
                                } catch (InterruptedException e) {
                                    Thread.currentThread().interrupt();
                                }

                                return;
                            }
                        break;
                    }
                }
        
                    /*if (isWormhole[currentAsteroid-1]) {
                        System.out.println();
                        System.out.println("You rolled a " + diceResult + " and arrived at a wormhole!");
                        System.out.println("Oh no! The wormhole leads to an unknown location in the universe and you're lost forever...");
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
                    }*/ 
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
        else {
            System.out.print("\nError. Press T to travel to Mars.");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
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