class ExamMarkForLoop {
    public static void main(String[] args) {
        System.out.println("Enter 20 Exam Marks: ");
        
        int examMark = 0;
        int totMarks = 0;
        
        for (int i = 1; i <= 20; i++) {
            examMark = Keyboard.readInt();
            totMarks += examMark;
        }
      
        int averageMark = totMarks / 20;

        if (examMark >= 0 && examMark <= 100) {
            System.out.println("The Total Marks are: " + totMarks + " and the Average Mark is: " + averageMark);
        
        }   else System.out.println("Error. Enter a Valid Mark");
    }
}