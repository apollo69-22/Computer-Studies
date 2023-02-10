package packages.keyboard_example_programs.simpleinterest;
import packages.keyboard.Keyboard;

class SimpleInterest{
    public static void main(String []args){
        System.out.println("    Simple Interest Calculator    ");
        
        System.out.print("Enter the Pricipal Amount: ");
        double principalAmount = Keyboard.readDouble();
        
        System.out.print("Enter the Interest Rate: ");
        double interestRate = Keyboard.readDouble();
        
        System.out.print("Enter the Years: ");
        double years = Keyboard.readDouble();
        
        double simpleInterest = (principalAmount*interestRate*years)/100;
        
        System.out.println("Your Simple Interest is: " + simpleInterest);
    }
}