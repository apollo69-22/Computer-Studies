class Menu{
    public static void main(String []args){
        System.out.println("Enter 2 integer numbers: ");
        int num1 = Keyboard.readInt();
        int num2 = Keyboard.readInt();
        
        System.out.println("Menu");
        System.out.println("Calculator");
        System.out.println("Press 1.....Add");
        System.out.println("Press 2.....Subtract");
        System.out.println("Press 3.....Divide");
        System.out.println("Press 4.....Multiply");
        
        System.out.println("Please enter your choice: ");
        int choice = Keyboard.readInt();
        
        if (choice==1){
            System.out.println("Add Menu");
            int addAns = num1+num2;
            System.out.println("Your answers is: " + addAns);
        }else if (choice==2){
            System.out.println("Subtract Menu");
            int subAns = num1-num2;
            System.out.println("Your answers is: " + subAns);
        }else if (choice==3){
            System.out.println("Divide Menu");
            double divAns = (double)num1/num2;
            System.out.println("Your answers is: " + divAns);
        }else if (choice==4){
            System.out.println("Multiply Menu");
            int mulAns = num1*num2;
            System.out.println("Your answers is: " + mulAns);
        }
    }
}