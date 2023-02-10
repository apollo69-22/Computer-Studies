package packages.else_if_programs.calccharii;
import packages.keyboard.Keyboard;

class CalcCharII{
    public static void main(String []args){
        System.out.print("Enter Num 1: ");
        double num1 = Keyboard.readDouble();

        System.out.print("Enter Num 2: ");
        double num2 = Keyboard.readDouble();
        
        System.out.println();
        System.out.println("Menu");
        
        System.out.println();
        System.out.println("Addition          -   Press A");
        System.out.println("Subtraction       -   Press B");
        System.out.println("Division          -   Press C");
        System.out.println("Multiplication    -   Press D");
        
        System.out.println();
        System.out.print("Enter your choice: ");
        char choice = Keyboard.readChar();
        
        char[] opts = {'a', 'A', 'b', 'B', 'c', 'C', 'd', 'D'};
        
        if (choice==opts[0] | choice==opts[1]) {

            System.out.println("Addition Menu");
            double addAns = (int)num1+num2;
            System.out.println("Your answers is: " + addAns);

        } else if (choice==opts[2] | choice==opts[3]) {
            
            System.out.println("Subtraction Menu");
            double subAns = (int)num1-num2;
            System.out.println("Your answers is: " + subAns);
        
        } else if (choice==opts[4] | choice==opts[5]) {
            
            System.out.println("Division Menu");
            double divAns = num1/num2;
            System.out.println("Your answers is: " + divAns);
        
        } else if (choice==opts[6] | choice==opts[7]) {
            
            System.out.println("Multiplication Menu");
            double mulAns = num1*num2;
            System.out.println("Your answers is: " + mulAns);
        
        } else System.out.println("Invalid Responce");
    }
}