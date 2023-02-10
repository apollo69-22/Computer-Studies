package packages.arrays.ultimatemarksarray;
import packages.keyboard.Keyboard;

class UltimateMarksArray {
    public static void main(String[] args) {
        System.out.println("    Marks Calculator   ");
        System.out.println();

        System.out.print("Enter Amount of Names to enter: ");
        int namesAmount = Keyboard.readInt();
        System.out.print("Enter Amount of Marks to enter: ");
        int marksAmount = Keyboard.readInt();
        System.out.println();
                
        String[] names = new String[namesAmount];
        int[] marks = new int[marksAmount];
        
        char[] grades = {'A', 'B', 'C', 'F'};
                
        int i = 0, choice = 0, totMarks = 0, highest = 0, lowest = 100;
                
        for (i = 0; i < marksAmount; i++) {
            System.out.print("Enter Name " + (i + 1) + ": ");
            names[i] = Keyboard.readString();
            System.out.print("Enter Mark " + (i + 1) + ": ");
            marks[i] = Keyboard.readInt();

            if (marks[i] > highest)
                highest = marks[i];
    
            if (marks[i] < lowest)
                lowest = marks[i];

            totMarks += marks[i];
        }

        int average = totMarks / marksAmount;

        do {
            System.out.println();
            System.out.println("    Menu    ");
            System.out.println("1. Display Statistics");
            System.out.println("2. Exit");
            System.out.println();
        
            System.out.print("Enter a choice: ");
            choice = Keyboard.readInt();

            switch (choice) {
                case 1:
                    System.out.println();
                    System.out.println("    List of Names   ");
                    System.out.println();
                
                    for (i = 0; i < marksAmount; i++) {
                        System.out.println(names[i]);
                    }
        
                    System.out.println();
                    System.out.println("Total Marks are: " + totMarks);
                    System.out.println("Average Mark is: " + average);
            
                    System.out.println("Lowest Mark is: " + lowest);
                    System.out.println("Highest Mark is: " + highest);
        
                    System.out.println();
                    System.out.println();
                    System.out.println("    List of Names Above Average   ");
                    System.out.println();
                
                    for (i = 0; i < marksAmount; i++) {
                        if (marks[i] >= average)
                            System.out.println(names[i]);
                    }
        
                    System.out.println();
                    System.out.println("    List of Names and their Grades   ");
                    System.out.println();
        
                    for (i = 0; i < marksAmount; i++) {
                        if (marks[i] >= 0 && marks[i] <= 39)
                            System.out.println(names[i] + " : " + grades[3]);
        
                        else if (marks[i] >= 40 && marks[i] <= 59)
                            System.out.println(names[i] + " : " + grades[2]);
        
                        else if (marks[i] >= 60 && marks[i] <= 79)
                            System.out.println(names[i] + " : " + grades[1]);
        
                        else if (marks[i] >= 80 && marks[i] <= 100)
                            System.out.println(names[i] + " : " + grades[0]);
                    }

                break;
            }
        } while (choice != 2);

    }
}