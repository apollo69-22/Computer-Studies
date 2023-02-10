package packages.if_else_programs.oddeven;
import packages.keyboard.Keyboard;

class OddEven{
    public static void main(String []args){
        System.out.print("Enter a number: ");
        int num = Keyboard.readInt();
        double ans = num%2;
        
        if (ans==1)
            System.out.println("Odd");
        else
            System.out.println("Even");
    }
}    