package packages.loops.for_loop.gamenumber;
import packages.keyboard.Keyboard;

class GameNumber {
    public static void main(String[] args) {
        System.out.println("    Try To Guess The Number Game    ");
        System.out.println("Guess a Number between 1 and 10");
        
        int rNum = (int) (Math.random() * 10 + 1);

        for (int i = 5; i >= 1; i--) {
            System.out.println();
            System.out.print("Please Enter a Number between 1-10: ");
            int num = Keyboard.readInt();
            
            if (num == rNum) {
                System.out.println("Well Done. You have Guessed The Number!");
                break;
            }    
            
            else if (num < rNum) {
                System.out.println();
                System.out.println("Wrong Number. Try Again");
                System.out.println(i + " Tries Left");
                System.out.println("HINT: Random Number needs to be Larger");
            }

            else {
                System.out.println();
                System.out.println("Wrong Number. Try Again");
                System.out.println(i + " Tries Left");
                System.out.println("HINT: Random Number is Smaller");
            }
                 
        }
    }
}