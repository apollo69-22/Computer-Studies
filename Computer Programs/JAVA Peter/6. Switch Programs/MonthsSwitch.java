class MonthsSwitch{
    public static void main(String []args){
        System.out.println("Enter a number from 1 till 12 to Represent a Month: ");
        int mon = Keyboard.readInt();
        
        switch (mon) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: System.out.println("This month has 31 Days"); break;
            case 2: System.out.println("This month has 28 or 29 Days"); break;
            case 4:
            case 6:
            case 9:
            case 11: System.out.println("This month has 30 Days"); break;
        }
    }
}