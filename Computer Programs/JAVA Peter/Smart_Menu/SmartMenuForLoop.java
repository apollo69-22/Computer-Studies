class SmartMenuForLoop {
    public static String[][] inputMarks() {
        String[][] student_marks; 
        student_marks = new String[20][2];  // 20 rows, 2 columns each row

        for (int i = 0; i < 20; i++) {  // Row loop
            /* for (int j = 0; j < 2; j++) {   // Column loop
                System.out.printf("Enter student %d name: ", i);
                student_marks[i][j] = Keyboard.readString();
            }   */

            // Saves student (in row i(0-20)) name in column 0
            System.out.printf("Enter student %d name: ", i);
            student_marks[i][0] = Keyboard.readString();

            // Saves student mark in column 1
            System.out.print("Enter student mark: ");
            student_marks[i][1] = Keyboard.readString();
        }

        return student_marks;   // returns stored student name and mark
         
        /* for (int i = 0; i < 20; i++) {
            System.out.printf("Enter student %d name: ", i); 
            student[i] = Keyboard.readString();

            System.out.print("Enter Mark: ");
            examMark[i] = Keyboard.readFloat();
        }   */
    }

    public static float[] calcAverageTotal(float[] marks) {
        float average_Mark = 0, total_Marks = 0;

        for (int i = 0; i < 20; i++) {
            average_Mark += marks[i];
        }

        total_Marks = average_Mark;
        average_Mark /= 20;

        return new float[] {average_Mark, total_Marks};
    }

    public static void statistics(String[][] student_marks) {
        float[] marks;
        marks = new float[20];  // stores 20 marks

        float highest_Mark = 0, lowest_Mark = 100;

        for (int i = 0; i < 20; i++) {
            marks[i] = Float.parseFloat(student_marks[i][1]);

            if (marks[i] > highest_Mark)
                highest_Mark = marks[i];

            if (marks[i] < lowest_Mark)
                lowest_Mark = marks[i];
        }

        float[] average_Total = calcAverageTotal(marks);
        
        System.out.printf("Total Marks are: %f\n", average_Total[1]);
        System.out.printf("Average Mark is: %f\n", average_Total[0]);
        System.out.printf("Lowest Mark is: %f, Highest Mark is: %f", lowest_Mark, highest_Mark);

        System.out.println();
    }
    
    public static char mainMenu() {
        System.out.println("    Menu    ");
        System.out.println("1. Enter Marks");
        System.out.println("2. Display Statistics");
        System.out.println("3. Exit");
        System.out.println();
        
        System.out.print("Enter a choice: ");
        char choice = Keyboard.readChar();

        return choice;
    }


    public static void main(String[] args) {
        char menu_Opt;
        Boolean marks_is_stored = false;

        String[][] student_marks;
            student_marks = new String[20][2];
        
        do {
            menu_Opt = mainMenu();
            
            if (menu_Opt == '1') {
                marks_is_stored = true;
                student_marks = inputMarks();
            }
            
            else if (menu_Opt == '2' && marks_is_stored == false) {
                System.out.print("No Student Marks Stored!");
                
                System.out.println();
            }
            
            else if (menu_Opt == '2' && marks_is_stored == true)
                statistics(student_marks);

            else if (menu_Opt == '3') {}
            
            else  {
                System.out.print("Invalid Option!");
                
                System.out.println();
            }

        } while (menu_Opt != '3');
    }
}
        