package packages.math_example_programs.seconds;
import packages.keyboard.Keyboard;

class Seconds{
    public static void main(String []args){
        System.out.println("    Seconds in a Year Calculator    ");
        
        System.out.print("Enter the number of years: ");
        int years = Keyboard.readInt();
        
        final int SECONDS = 31536000;
        
        int ans = years*SECONDS;
        
        System.out.println("There are " + ans + " seconds" + " in " + years + " years");
    }
}