class Days {
    public static void main(String[] args) {
        System.out.println("    Days of the Week    ");

        System.out.print("Enter a number: ");
        int num = Keyboard.readInt();

        switch (num) {
            case 1: 
                System.out.println("Day 1 is Monday");
                break;
            
            case 2:
                System.out.println("Day 2 is Tuesday");
                break;
            
            case 3:
                System.out.println("Day 3 is Wednesday");
                break;

            case 4:
                System.out.println("Day 4 is Thursday");
                break;

            case 5:
                System.out.println("Day 5 is Friday");
                break;

            case 6:
                System.out.println("Day 6 is Saturday");
                break;

            case 7:
                System.out.println("Day 7 is Sunday");
                break;

            default:
                System.out.println("Error, type a number from 1 to 7!");
                break;
        }
    }
}