class MarkXerriMenuForLoop {
    public static void main(String[] args) {
        String name;
        int choice;
        double[] examMark;
        examMark = new double[21]; 
        double totMarks = 0, high = 0, low = 0;
        
        do {
            System.out.println();
            System.out.println("    Menu    ");
            System.out.println("1. Enter Marks");
            System.out.println("2. Display Statistics");
            System.out.println("3. Exit");
            System.out.println();
        
            System.out.println("Enter a choice: ");
            choice = Keyboard.readInt();
        
            switch (choice) {
                case 1:
                    System.out.println();
                    System.out.println("Enter 20 Names & Marks: ");
                    for (int i = 1; i < 21; i++) {
                        System.out.print("Enter Name " + i + ": ");
                        name = Keyboard.readString();
        
                        System.out.print("Enter Mark " + i + ": ");
                        examMark[i] = Keyboard.readDouble();
    
                        System.out.println();
    
                        if (examMark[i] > high)
                            high = examMark[i];
                    
                        if (examMark[i] < low)
                            low = examMark[i];

                        totMarks += examMark[i];
                    }

                break;
                         
                case 2:
                    System.out.println();
                    System.out.println("Total Marks are " + totMarks);
                    System.out.println("Average Mark is " + totMarks / 20);
    
                    System.out.println("Lowest Mark is: " + low);
                    System.out.println("Highest Mark is: " + high);
            }

        } while (choice != 3);
    
    } 
}
    