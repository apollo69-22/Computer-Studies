class SpaceTraveler {
    public static void main(String[] args) {
        System.out.println("    WELCOME TO SPACE TRAVELER  ");
        System.out.println("1. Game Instructions");
        System.out.println("2. Play Game");
        System.out.println("3. Exit");
        System.out.println();
        
        System.out.print("Enter a choice: ");
        int choice = Keyboard.readInt();
        System.out.println();
    }
    
    public static String instructions() {
        String gameInstructions = instructions();
        System.out.println();
        System.out.println("    Game Instructions   ");
        System.out.println("You are a traveler through space and your mission is to explore the solar system");
        System.out.println("You start on Mercury and finish on Neptune");
        System.out.println("You have to roll a dice and with the number you get you move on different asteroids");
        System.out.println("BUT..");
        System.out.println("The further you go along the solar system the more challenges you'll find");
        System.out.println("Some of the asteroids will have resources and some will be blackholes");
        System.out.println("The goal is to try to make it to the end and get as many points as possible");
        System.out.println("You ONLY have 3 LIVES!");
        System.out.println("TRY TO DON'T DIE");
        System.out.println("Enjoy! :D");
        return gameInstructions;
    }
    
    public static void game() {
        
    }
    
    public static void mainGame() {
        int choice = 0;
        
        while (choice != 3) {
            choice = main();

            switch (choice) {
                case 1:
                    System.out.println(instructions());
                break;

                case 2:
                break;

                case 3:
                break;

                default:
                    System.out.print("Please enter a number from 1 to 3");
                break;
            }
        }
    }
}