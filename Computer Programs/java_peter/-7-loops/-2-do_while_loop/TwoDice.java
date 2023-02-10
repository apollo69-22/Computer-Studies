package packages.loops.do_while_loop.twodice;
import packages.keyboard.Keyboard;

class TwoDice {
    public static void main (String[] args) {
        System.out.println("Generating 2 Random Numbers (1 - 6) until both are Equal");
        int num1, num2 = 0;
        
        do {
            
            num1 = (int) (Math.random() * 6) + 1;
            num2 = (int) (Math.random() * 6) + 1;
            System.out.println("The Numbers were: " + num1 + " and " + num2);
            
        } while (num1 != num2);
    }
}