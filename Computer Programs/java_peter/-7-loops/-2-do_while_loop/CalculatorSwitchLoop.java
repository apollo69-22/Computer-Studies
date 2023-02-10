package packages.loops.do_while_loop.calculatorswitchloop;
import packages.keyboard.Keyboard;

class CalculatorSwitchLoop {
    public static void main (String[] args) {
        System.out.println("    Calculator  ");

        System.out.println("Enter 2 numbers: ");
        double num1 = Keyboard.readDouble();
        double num2 = Keyboard.readDouble();

        System.out.println("    MENU    ");
        System.out.println("Addition        ....Press +");
        System.out.println("Subtraction     ....Press -");
        System.out.println("Multiplication  ....Press *");
        System.out.println("Division        ....Press /");
        System.out.println("Exit            ....Press E");

        System.out.print("Please enter your choice: ");
        char opt = Keyboard.readChar();

        do {

            switch (opt) {
                case '+': 
                    double ansadd = num1 + num2;
                    System.out.println("Your Answer is: " + ansadd);
                    break;

                case '-':
                    double anssub = num1 - num2;
                    System.out.println("Your Answer is: " + anssub);
                    break;

                case '*': 
                    double ansmul = num1 * num2;
                    System.out.println("Your Answer is: " + ansmul);
                    break;

                case '/':
                    double ansdiv = num1 / num2;
                    System.out.println("Your Answer is: " + ansdiv);
                    break;
                    
                case 'e':
                    break;
                    
                case 'E':
                    break;

                default:
                    System.out.println("Error, press (+, -, *, /)");
                    break;
            }

        } while (opt != 'e' && opt != 'e');
    }
}