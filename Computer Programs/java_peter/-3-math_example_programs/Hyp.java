package packages.math_example_programs.hyp;
import packages.keyboard.Keyboard;

class Hyp{
    public static void main(String []args){
        System.out.println("    Hypothenuse Calculator - RIGHT ANGLED TRIANGLE    ");
        
        System.out.print("Enter the length of SIDE A: ");
        double sideA = Keyboard.readDouble();
        
        System.out.print("Enter the length of SIDE B: ");
        double sideB = Keyboard.readDouble();
        
        double c = Math.sqrt(Math.pow(sideA, 2)+Math.pow(sideB, 2));
        
        System.out.println("The hypothenuse of your Right Angled Triangle is: " + c + " cm");
    }
}