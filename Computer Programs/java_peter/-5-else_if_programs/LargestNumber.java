package packages.else_if_programs.largestnumber;
import packages.keyboard.Keyboard;

class LargestNumber{
    public static void main(String[] args){
        System.out.println("  Largest Number Calculator   ");
        
        System.out.print("Enter a number: ");
        int num1 = Keyboard.readInt();
        
        System.out.print("Enter the 2nd number: ");
        int num2 = Keyboard.readInt();
        
        System.out.print("Enter the 3rd number: ");
        int num3 = Keyboard.readInt();
        
        if (num1>num2&&num1>num3)
            System.out.println(num1 + " is the largest");
        else if (num2>num1&&num2>num1)
            System.out.println(num2 + " is the largest");
        else if (num3>num1&&num3>num2)
            System.out.println(num3 + " is the largest");
    }
}