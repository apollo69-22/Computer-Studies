class Calc{
    public static void main(String []args){
        System.out.println("    Calculator    ");
        System.out.println("Enter 2 WHOLE Numbers");
        int Num1 = Keyboard.readInt();
        int Num2 = Keyboard.readInt();
        
        int Addition = Num1+Num2;
        int Subtraction = Num1-Num2;
        int Multiplication = Num1*Num2;
        int Division = Num1/Num2;
        
        System.out.println("Your answers are: ");
        System.out.println("Addition: " + Addition);
        System.out.println("Subtraction: " + Subtraction);
        System.out.println("Multiplication: " + Multiplication);
        System.out.println("Division: " + Division);
    }
}