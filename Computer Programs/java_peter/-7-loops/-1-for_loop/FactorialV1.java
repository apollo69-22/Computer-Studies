package packages.loops.for_loop.factorialv1;
import packages.keyboard.Keyboard;

class Factorial {
    public static void main(String[] args) {
        System.out.println("    Factorial Calculator  ");
        System.out.print("Enter your Number: ");
        long num = Keyboard.readLong();

        if (num <= 20) {
            System.out.print("Your Answer is: " + num);
            for (long i = (num - 1); i > 0; i--) {
                System.out.print("*" + i);
                num *= i;
            } 

            System.out.printf(" = %d", num);
        
        } else
            System.out.println("Buffer OVERFLOW OCCURS With Numbers ABOVE 20");
    }
}