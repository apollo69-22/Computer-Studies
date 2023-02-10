package packages.keyboard_example_programs.average;
import packages.keyboard.Keyboard;

class Average{
    public static void main (String []args){
        System.out.println("    Finding the Average    ");
        
        System.out.print("Enter the first number: ");
        double Num1 = Keyboard.readDouble();
        
        System.out.print("Enter the second number: ");
        double Num2 = Keyboard.readDouble();
        
        System.out.print("Enter the third number: ");
        double Num3 = Keyboard.readDouble();
        
        double average = (Num1+Num2+Num3)/3;
        
        System.out.println("Your Average is: " + average);
    }
}