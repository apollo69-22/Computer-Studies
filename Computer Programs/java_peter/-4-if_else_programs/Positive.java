package packages.if_else_programs.positive;
import packages.keyboard.Keyboard;

class Positive{
    public static void main(String []args){
        System.out.print("Enter a Positive Number: ");
        int num = Keyboard.readInt();
        
        if (num>=0)
            System.out.println("Positive");
        else
            System.out.println("Negative");
    }
}