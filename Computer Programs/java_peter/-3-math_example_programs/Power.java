package packages.math_example_programs.power;
import packages.keyboard.Keyboard;

class Power{
    public static void main(String []args){
        System.out.println("    Power Calculator    ");
        
        System.out.println("Enter the First Number: ");
        double num1 = Keyboard.readDouble();
        
        System.out.println("Enter the Second Number: ");
        double num2 = Keyboard.readDouble();
        
        double ans = Math.pow(num1, num2);
        
        System.out.println("Your answer is: " + ans);
    }
}