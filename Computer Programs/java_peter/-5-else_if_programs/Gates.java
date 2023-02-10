package packages.else_if_programs.gates;
import packages.keyboard.Keyboard;

class Gates{
    public static void main (String []args){
        System.out.println("    AND or OR Gate Outputs  ");
        System.out.println("Please press A (AND Gate) or O (OR Gate):");
        char gate = Keyboard.readChar();
        char a = 'a';
        char A = 'A';
        char o = 'o';
        char O = 'O';
        
        
        if (gate==a | gate==A) {
            System.out.println("Enter 2 inputs: ");
            int andNum1 = Keyboard.readInt();
            int andNum2 = Keyboard.readInt();
            
            if (andNum1==0 && andNum2==0) {
                System.out.println("Output is: 0");
            
            } else if (andNum1==0 && andNum2==1) {
                System.out.println("Output is: 0");
            
            } else if (andNum1==1 && andNum2==0) {
                System.out.println("Output is: 0");
            
            } else if (andNum1==1 && andNum2==1) {
                System.out.println("Output is: 1");
            
            } else System.out.println("Error. Please enter 1 or 0");
    
            
        } else if (gate==o | gate==O) {
            System.out.println("Enter 2 inputs: ");
            int orNum1 = Keyboard.readInt();
            int orNum2 = Keyboard.readInt();
            
            if (orNum1==0 && orNum2==0) {
                System.out.println("Output is: 0");
            } else if (orNum1==0 && orNum2==1) {
                System.out.println("Output is: 1");
            } else if (orNum1==1 && orNum2==0) {
                System.out.println("Output is: 1");
            } else if (orNum1==1&&orNum2==1) {
                System.out.println("Output is: 1");
            } else System.out.println("Error. Please enter 1 or 0");
        }
    }
}