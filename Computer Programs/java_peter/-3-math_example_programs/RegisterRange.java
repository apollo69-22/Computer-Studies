package packages.math_example_programs.registerrange;
import packages.keyboard.Keyboard;

class RegisterRange{
    public static void main(String []args){
        System.out.println("Enter register size: ");
        int number = Keyboard.readInt();
        
        final int leastCommonBit = 0;
        
        int higherRange =(int)Math.pow(2, number);
        
        System.out.println("Your answers is: " +higherRange);
    }
}