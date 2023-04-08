import java.io.IOException;


class SpaceRacer {
    public static int mainMenu() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        
        System.out.println("    WELCOME TO SPACE RACER  ");
        System.out.println("1. Game Instructions");
        System.out.println("2. Play Game");
        System.out.println("3. Exit");
        System.out.println();
        
        System.out.print("Enter a choice: ");
        int choice = Keyboard.readInt();
        System.out.println();

        return choice;
    }

    public static void game() {

    }

    public static void instructions() throws IOException, InterruptedException {
        char choice = ' ';
        while (choice != 'B' && choice != 'b') {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

            System.out.println("    Game Instructions   ");
            System.out.println("You are a spaceship captain and your mission is to make it across 40 asteroids..");
            System.out.println("You start on Mars and finish on Europa..");
            System.out.println("BUT....");
            System.out.println("Some asteroids will give a set of points..");
            System.out.println("Some asteroids will send you back to Mars..");
            System.out.println("The goal is to try to make it to the end and get as many points as possible..");
            /* System.out.println("You ONLY have 3 LIVES!"); add this if you have time
            System.out.println("If you lose all lives, YOU LOSE THE GAME!");
            System.out.println("TRY NOT TO DIE!"); */
            System.out.println("Enjoy! :D");

            System.out.println();
            System.out.print(/*\t\t\t\t\t\t\t*/"Press B to continue: ");
            choice = Keyboard.readChar();

            if (choice != 'B' && choice != 'b') {
                System.out.print("\nError. Press B to continue.");
                System.out.println();
                System.out.println();

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
                    System.out.print("Error. Please enter a number from 1 to 3.");

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
