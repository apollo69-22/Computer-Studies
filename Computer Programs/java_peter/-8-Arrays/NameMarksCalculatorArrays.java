package packages.arrays.namemarkscalculatorarrays;
import packages.keyboard.Keyboard;

class NameMarksCalculatorArrays {
    public static void main(String[] args) {
        System.out.println("    Marks Calculator   ");
        System.out.println();

        String[] names = new String[10];
        int[] marks = new int[10];
        int totMarks = 0, highest = 0, lowest = 100;
        int i = 0;

        for (i = 0; i < 10; i++) {
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

        int average = totMarks / 10;

        System.out.println();
        System.out.println("Total Marks are " + totMarks);
        System.out.println("Average Mark is " + average);
    
        System.out.println("Lowest Mark is: " + lowest);
        System.out.println("Highest Mark is: " + highest);

        System.out.println();
        System.out.println();
        System.out.println("    List of Names Above Average   ");
        System.out.println();

        for (i = 0; i < 10; i++) {
            if (marks[i] >= average)
                System.out.println(names[i]);
        }
    }
}