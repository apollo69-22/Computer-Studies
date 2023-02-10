import java.awt.*;


class HomeProject{
    public static void main(String []args){
        char menuOpt = main_menu();
        Toolkit.getDefaultToolkit().beep();
        char[] avalOpt = {'a', 'A', 'b', 'B', 'c', 'C'};

        /* if (choice==a | choice==A) {
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
        
        } else System.out.println("Invalid Responce"); */
    
    
    }

    public static char main_menu() {
        System.out.println();
        System.out.println("Main Menu");
        
        System.out.println();
        System.out.println("Math Operations     -   Press A");
        System.out.println("Convertions         -   Press B");
        System.out.println("Grades              -   Press C");
        
        System.out.println();
        System.out.print("Enter your choice: ");
        char choice = Keyboard.readChar();

        return choice;
    }

    public static char math_menu() {
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

        return choice;
    }
}