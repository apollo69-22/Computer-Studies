class MenuForLoop {
    public static void main(String[] args) {
        System.out.println("    Menu    ");
        System.out.println("1. Enter Marks");
        System.out.println("2. Display Statistics");
        System.out.println("3. Exit");
        System.out.println();

        System.out.println("Enter a choice: ");
        int choice = Keyboard.readInt();

        String name;
        double examMark = 0, totMarks = 0, high = 0, low = 0;
        
        if (choice == 1) {
            System.out.println();
            System.out.println("Enter 20 Names & Marks: ");
            for (int i = 1; i < 21; i++) {
                System.out.print("Enter Name " + i + ": ");
                name = Keyboard.readString();
        
                System.out.print("Enter Mark " + i + ": ");
                examMark = Keyboard.readInt();

                System.out.println();

                if (examMark > high)
                    high = examMark;

                if (examMark < low)
                    low = examMark;
            }
        
            System.out.println("    Menu    ");
            System.out.println("1. Enter Marks");
            System.out.println("2. Display Statistics");
            System.out.println("3. Exit");
            System.out.println();
    
            System.out.println("Enter a choice: ");
            choice = Keyboard.readInt();

            if (choice == 2) {
                totMarks += examMark;
                System.out.println("Total Marks are " + totMarks);
                System.out.println("Average Mark is " + (double)totMarks / 20);

                System.out.println("Lowest Mark is: " + (double)low);
                System.out.println("Highest Mark is: " + (double)high);
            }
        
        } if (choice != 3);
    }
}
        