package packages.loops.for_loop.exammarkforloopii;
import packages.keyboard.Keyboard;

class ExamMarkForLoopII {
    public static void main(String[] args) {
        float[] examMark;
        examMark = new float[20];

        float averageMark = 0, totMarks = 0; 
        
        for (int i = 0; i < 20; i++) { 
            System.out.printf("Enter Mark %d: ", i);
            examMark[i] = Keyboard.readFloat();
            
            if (examMark[i] <50)
                System.out.println("Fail");
            else System.out.println("Pass");

            totMarks += examMark[i];
        }
      
        averageMark = totMarks / 20;

        System.out.println("The Total Marks are: " + totMarks);
        System.out.println("The Average Mark is: " + averageMark);
    }
}