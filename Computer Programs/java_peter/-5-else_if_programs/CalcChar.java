package packages.else_if_programs.calcchar;
import packages.keyboard.Keyboard;

class CalcChar{
    public static void main(String []args){
        System.out.print("Enter Number 1: ");
        double num1 = Keyboard.readDouble();
        
        System.out.print("Enter Number 2: ");
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
        char a = 'a';
        char A = 'A';
        char b = 'b';
        char B = 'B';
        char c = 'c';
        char C = 'C';
        char d = 'd';
        char D = 'D';
        
        if (choice==a | choice==A) {
            System.out.println("Addition Menu");
            double addAns = (int)num1+num2;
            System.out.println("Your answers is: " + addAns);
        
        } else if (choice==b | choice==B) {
            System.out.println("Subtraction Menu");
            double subAns = (int)num1-num2;
            System.out.println("Your answers is: " + subAns);
        
        } else if (choice==c | choice==C) {
            System.out.println("Division Menu");
            double divAns = num1/num2;
            System.out.println("Your answers is: " + divAns);
        
        } else if (choice==d | choice==D) {
            System.out.println("Multiplication Menu");
            double mulAns = num1*num2;
            System.out.println("Your answers is: " + mulAns);
        
        } else System.out.println("Invalid Responce");
    
    
    }
}