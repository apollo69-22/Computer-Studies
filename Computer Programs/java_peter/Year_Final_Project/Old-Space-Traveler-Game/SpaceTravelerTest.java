class SpaceTravelerTest {
    public static int mainMenu() {
        System.out.println("    WELCOME TO SPACE TRAVELER  ");
        System.out.println("1. Game Instructions");
        System.out.println("2. Play Game");
        System.out.println("3. Exit");
        System.out.println();
        
        System.out.print("Enter a choice: ");
        int choice = Keyboard.readInt();
        System.out.println();

        return choice;
    }
    
    public static char instructions() {
        char choice;

        System.out.println("    Game Instructions   ");
        System.out.println("You are a traveler through space and your mission is to explore the solar system..");
        System.out.println("You start on Mercury and finish on Neptune..");
        System.out.println("Each planet gives you a set of points..");
        System.out.println("BUT....");
        System.out.println("The further you go along the solar system the more challenges you'll find..");
        System.out.println("Some of the challenges are asteroids and blackholes..");
        System.out.println("The goal is to try to make it to the end and get as many points as possible..");
        System.out.println("You ONLY have 3 LIVES!");
        System.out.println("If you lose all lives, YOU LOSE THE GAME!");
        System.out.println("TRY NOT TO DIE!");
        System.out.println("Enjoy! :D");

        System.out.println();
        System.out.println("Press B to continue...");
        choice = Keyboard.readChar();
        System.out.println();

        boolean B;
        if (choice == 'B' || choice == 'b') {
            B = true;
        }
        else if (choice != 'B' || choice != 'b') {
            B = false;
            System.out.println("Error. Please press B to continue...");
            choice = Keyboard.readChar();
            System.out.println();
        }
            
        return choice;
    }

    // OLD POINT SYSTEM DISPLAY: System.out.println("You have recieved " + "getLowPoints()" + " points");

    /* 
        OLD ASTEROID SYSTEM
            if (hitByAsteroid() == true) {
                System.out.println();
                System.out.println("OH NO!! You have been hit by an asteroid.");
                System.out.println("You have been sent back to the previous planet to repair your ship.");
                System.out.println();

                getVenus();        
            }
            else if (hitByAsteroid() == false) {
                getMars();
            } */


   /*public static int[] getLowPoints() {
        int[] lowPoints = {(int)(Math.random() * (100 - 75)) + 75, (int)(Math.random() * (100 - 75)) + 75, (int)(Math.random() * (100 - 75)) + 75};
        lowPoints[0] = (int)(Math.random() * (100 - 75)) + 75;
        lowPoints[1] = (int)(Math.random() * (100 - 75)) + 75;
        lowPoints[2] = (int)(Math.random() * (100 - 75)) + 75;

        return new int[] {lowPoints[0], lowPoints[1], lowPoints[2]};
    }

    public static int[] getHighPoints() {
        int[] highPoints = new int[4];
        highPoints[0] = (int)(Math.random() * (2500 - 1000)) + 1000;
        highPoints[1] = (int)(Math.random() * (2500 - 1000)) + 1000;
        highPoints[2] = (int)(Math.random() * (2500 - 1000)) + 1000;
        highPoints[3] = (int)(Math.random() * (2500 - 1000)) + 1000;

        return new int[] {highPoints[0], highPoints[1], highPoints[2]};
    } */

    public static boolean hitByAsteroid() {
        boolean randomizer = Math.random() < 0.3;
        return randomizer;
    }

    public static boolean suckedByBlackhole() {
        boolean randomizer = Math.random() < 0.7;
        return randomizer;
    }    
    
    public static void getMercury(String[] planetPosition) {      
        System.out.println("Location: Planet Mercury");
        System.out.println();
        System.out.println("Press T to travel to the next planet");
        char choice = Keyboard.readChar();

        boolean T;
        if (choice == 'T' || choice == 't') {
            T = true;

            for (String m:planetPosition) {
                planetPosition[1] = getVenus();
            }
        }
        else if (choice != 'T' || choice != 't') {
            T = false;
            System.out.println("Error. Please press T to travel...");
            choice = Keyboard.readChar();
            System.out.println();
        }

        //return new String[] {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
    }

    public static String[] getVenus(String[] planetPosition) {
        System.out.println();
        System.out.println("You have made it to Venus");
        System.out.println("Location: Planet Venus");
        System.out.println();
        System.out.println("Press T to travel to the next planet");
        char choice = Keyboard.readChar();

        boolean T;
        if (choice == 'T' || choice == 't') {
            T = true;

            for (String m:planetPosition) {
                planetPosition[1] = getEarth();
            }
        }
        else if (choice != 'T' || choice != 't') {
            T = false;
            System.out.println("Error. Please press T to travel...");
            choice = Keyboard.readChar();
            System.out.println();
        }

        return null;
    }

    public static void getEarth() {
        System.out.println();
        System.out.println("You have made it to Earth");
        System.out.println();
        System.out.println("Location: Planet Earth");
        System.out.println("You have recieved " + "getLowPoints()" + " points");
        System.out.println();

        System.out.println("Press T to travel to the next planet");
        char choice = Keyboard.readChar();

        boolean T;
        if (choice == 'T' || choice == 't') {
            T = true;
        }
        else if (choice != 'T' || choice != 't') {
            T = false;
            System.out.println("Error. Please press T to travel...");
            choice = Keyboard.readChar();
            System.out.println();
        }
    }

    public static void getMars() {
        System.out.println();
        System.out.println("You have made it to Mars");
        System.out.println();
        System.out.println("Location: Planet Mars");
        System.out.println("You have recieved " + "getLowPoints()" + " points");
        System.out.println();

        System.out.println("Press T to travel to the next planet");
        char choice = Keyboard.readChar();

        boolean T;
        if (choice == 'T' || choice == 't') {
            T = true;
        }
        else if (choice != 'T' || choice != 't') {
            T = false;
            System.out.println("Error. Please press T to travel...");
            choice = Keyboard.readChar();
            System.out.println();
        }
    }

    public static void getJupiter() {
        System.out.println();
        System.out.println("You have made it to Jupiter");
        System.out.println();
        System.out.println("Location: Planet Jupiter");
        System.out.println("You have recieved " + "getHighPoints()" + " points");
        System.out.println();

        System.out.println("Press T to travel to the next planet");
        char choice = Keyboard.readChar();

        boolean T;
        if (choice == 'T' || choice == 't') {
            T = true;
        }
        else if (choice != 'T' || choice != 't') {
            T = false;
            System.out.println("Error. Please press T to travel...");
            choice = Keyboard.readChar();
            System.out.println();
        }
    }

    public static void getSaturn() {
        System.out.println();
        System.out.println("You have made it to Saturn");
        System.out.println();
        System.out.println("Location: Planet Saturn");
        System.out.println("You have recieved " + "getHighPoints()" + " points");
        System.out.println();

        System.out.println("Press T to travel to the next planet");
        char choice = Keyboard.readChar();

        boolean T;
        if (choice == 'T' || choice == 't') {
            T = true;
        }
        else if (choice != 'T' || choice != 't') {
            T = false;
            System.out.println("Error. Please press T to travel...");
            choice = Keyboard.readChar();
            System.out.println();
        }
    }

    public static void getUranus() {
        int lives = 3;

        System.out.println();
        System.out.println("You have made it to Uranus");
        System.out.println();
        System.out.println("Location: Planet Uranus");
        System.out.println("You have recieved " + "getHighPoints()" + " points");
        System.out.println();

        System.out.println("Press T to travel to the next planet");
        char choice = Keyboard.readChar();

        boolean T;
        if (choice == 'T' || choice == 't') {
            T = true;
        }
        else if (choice != 'T' || choice != 't') {
            T = false;
            System.out.println("Error. Please press T to travel...");
            choice = Keyboard.readChar();
            System.out.println();
        }
    }

    public static void getNeptune() {
        System.out.println();
        System.out.println("You have made it to Neptune!");
        System.out.println();
        System.out.println("    CONGRATULATIONS YOU HAVE WON THE GAME!!    ");
        System.out.println();
        System.out.println("You have recieved " + "getHighPoints()" + " points");
        System.out.println();
        
        //int totPoints = getLowPoints() + getHighPoints();
        //System.out.println("In total you got: " + totPoints);

        System.out.println("Press B to continue...");
        char choice = Keyboard.readChar();
        System.out.println();

        boolean B;
        if (choice == 'B' || choice == 'b') {
            B = true;
        }
        else if (choice != 'B' || choice != 'b') {
            B = false;
            System.out.println("Error. Please press B to continue...");
            choice = Keyboard.readChar();
            System.out.println();
        }
    }

    public static void game() {

    }
    
    public static void main(String[] args) {
        int choice = 0;
        String[] planetPosition = new String[] {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};

        while (choice != 3) {
            choice = mainMenu();

            switch (choice) {
                case 1:
                    instructions();
                break;

                case 2:
                    boolean startPosition = true;
                    if (startPosition == true) {
                        planetPosition = getMercury();
                    }
                break;

                case 3:
                break;

                default:
                    System.out.println("Error. Please enter a number from 1 to 3");
                    System.out.println();
                    mainMenu();
                break;
            }
        }
    }
}