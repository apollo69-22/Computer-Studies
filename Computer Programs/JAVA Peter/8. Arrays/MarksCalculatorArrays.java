class MarksCalculatorArrays {
    public static void main(String[] args) {
        System.out.println("    Marks Calculator   ");
        System.out.println();

        int[] marks = new int[10];
        int totMarks = 0, highest = 0, lowest = 100;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter Mark " + (i + 1) + ": ");
            marks[i] = Keyboard.readInt();

            if (marks[i] > highest)
                highest = marks[i];
    
            if (marks[i] < lowest)
                lowest = marks[i];

            totMarks += marks[i];
        }

        int average = totMarks/ 10;

        System.out.println();
        System.out.println("Total Marks are " + totMarks);
        System.out.println("Average Mark is " + average);
    
        System.out.println("Lowest Mark is: " + lowest);
        System.out.println("Highest Mark is: " + highest);
    }
}