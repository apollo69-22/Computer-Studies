class MarkSwitch {
    public static void main(String[] args) {
        System.out.println("    Exam Mark   ");

        System.out.print("Enter a number in Multiples of 5. Eg:(5, 10, 15): ");
        int num = Keyboard.readInt();

        switch (num) {
            case 5:
            case 10:
            case 15:
            case 20:
            case 25:
            case 30:
            case 35:
            case 40:
            
            case 45:
                System.out.println("Fail");
                break;

            
            
            case 55:
            case 60:
            case 65:

            case 50:
                System.out.println("Pass");
                break;

            
            
            case 75:
            case 80:
            case 85:
            
            case 70:
                System.out.println("Merit");
                break;
            


            case 95:
            case 100:

            case 90:
                System.out.println("Distinction");
                break;
            
            default:
                System.out.println("Error. Enter a Valid Mark (0 - 100) or a Multiple of 5");
                break;
        }
    }
}