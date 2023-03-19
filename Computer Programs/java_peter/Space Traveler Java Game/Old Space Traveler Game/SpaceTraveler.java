class SpaceTraveler {
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

    
    public static int game() {
        char choice;

        int[] lowPoints = new int[3];
        lowPoints[0] = (int)(Math.random() * (100 - 75)) + 75;
        lowPoints[1] = (int)(Math.random() * (100 - 75)) + 75;
        lowPoints[2] = (int)(Math.random() * (100 - 75)) + 75;

        int[] highPoints = new int[4];
        highPoints[0] = (int)(Math.random() * (2500 - 1000)) + 1000;
        highPoints[1] = (int)(Math.random() * (2500 - 1000)) + 1000;
        highPoints[2] = (int)(Math.random() * (2500 - 1000)) + 1000;
        highPoints[3] = (int)(Math.random() * (2500 - 1000)) + 1000;


        System.out.println();
        System.out.println("    LEVEL EASY    ");
        
        System.out.println("Location: Planet Mercury");
        System.out.println();
        System.out.println("Press T to travel to the next planet");
        choice = Keyboard.readChar();

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


        System.out.println();
        System.out.println("You have made it to Venus");

        System.out.println("Location: Planet Venus");
        System.out.println("You have recieved " + lowPoints[0] + " points");
        System.out.println();
        System.out.println("Press T to travel to the next planet");
        choice = Keyboard.readChar();

        if (choice == 'T' || choice == 't') {
            T = true;
        }
        else if (choice != 'T' || choice != 't') {
            T = false;
            System.out.println("Error. Please press T to travel...");
            choice = Keyboard.readChar();
            System.out.println();
        }
        

        System.out.println();
        System.out.println();
        System.out.println("    LEVEL MEDIUM    ");

        System.out.println();
        System.out.println("You have made it to Earth");

        System.out.println("Location: Planet Earth");
        System.out.println("You have recieved " + lowPoints[1] + " points");
        System.out.println();

        //ADD RANDOM ASTEROID CODE HERE

        System.out.println("Press T to travel to the next planet");
        choice = Keyboard.readChar();

        if (choice == 'T' || choice == 't') {
            T = true;
        }
        else if (choice != 'T' || choice != 't') {
            T = false;
            System.out.println("Error. Please press T to travel...");
            choice = Keyboard.readChar();
            System.out.println();
        }


        System.out.println();
        System.out.println("You have made it to Mars");

        System.out.println("Location: Planet Mars");
        System.out.println("You have recieved " + lowPoints[2] + " points");
        System.out.println();
        
        //ADD RANDOM ASTEROID CODE HERE

        System.out.println("Press T to travel to the next planet");
        choice = Keyboard.readChar();

        if (choice == 'T' || choice == 't') {
            T = true;
        }
        else if (choice != 'T' || choice != 't') {
            T = false;
            System.out.println("Error. Please press T to travel...");
            choice = Keyboard.readChar();
            System.out.println();
        }


        System.out.println();
        System.out.println();
        System.out.println("    LEVEL HARD    ");

        System.out.println();
        System.out.println("You have made it to Jupiter");

        System.out.println("Location: Planet Jupiter");
        System.out.println("You have recieved " + highPoints[0] + " points");
        System.out.println();
        
        //ADD RANDOM ASTEROID CODE HERE

        System.out.println("Press T to travel to the next planet");
        choice = Keyboard.readChar();

        if (choice == 'T' || choice == 't') {
            T = true;
        }
        else if (choice != 'T' || choice != 't') {
            T = false;
            System.out.println("Error. Please press T to travel...");
            choice = Keyboard.readChar();
            System.out.println();
        }


        System.out.println();
        System.out.println("You have made it to Saturn");

        System.out.println("Location: Planet Saturn");
        System.out.println("You have recieved " + highPoints[1] + " points");
        System.out.println();
        
        //ADD RANDOM ASTEROID CODE HERE

        System.out.println("Press T to travel to the next planet");
        choice = Keyboard.readChar();

        if (choice == 'T' || choice == 't') {
            T = true;
        }
        else if (choice != 'T' || choice != 't') {
            T = false;
            System.out.println("Error. Please press T to travel...");
            choice = Keyboard.readChar();
            System.out.println();
        }


        System.out.println();
        System.out.println("You have made it to Uranus");

        System.out.println("Location: Planet Uranus");
        System.out.println("You have recieved " + highPoints[2] + " points");
        System.out.println();
        
        //ADD RANDOM ASTEROID CODE HERE

        System.out.println("Press T to travel to the next planet");
        choice = Keyboard.readChar();

        if (choice == 'T' || choice == 't') {
            T = true;
        }
        else if (choice != 'T' || choice != 't') {
            T = false;
            System.out.println("Error. Please press T to travel...");
            choice = Keyboard.readChar();
            System.out.println();
        }


        System.out.println();
        System.out.println("You have made it to Neptune");

        System.out.println("Location: Planet Neptune");
        System.out.println("You have recieved " + highPoints[3] + " points");
        System.out.println();
        
        int totPoints = lowPoints[0] + lowPoints[1] + lowPoints[2] + highPoints[0] + highPoints[1] + highPoints[2] + highPoints[3];
        System.out.println("In total you got: " + totPoints);

        //ADD RANDOM ASTEROID CODE HERE

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
    
    public static void main(String[] args) {
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
                    System.out.println("Error. Please enter a number from 1 to 3");
                    System.out.println();
                    mainMenu();
                break;
            }
        }
    }
}