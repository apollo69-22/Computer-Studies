class ExamMarkForLoop {
    public static void main(String[] args) {
        System.out.println("Enter 20 Exam Marks: ");
        
        float[] examMark;
        examMark = new float[20];

        float averageMark = 0, totMarks = 0; 
        
        for (int i = 0; i < 20; i++) { 
            examMark[i] = Keyboard.readFloat();
            
            totMarks += examMark[i];
        }
      
        averageMark = totMarks / 20;

        System.out.println("The Total Marks are: " + totMarks);
        System.out.println("The Average Mark is: " + averageMark);
           
    }
}