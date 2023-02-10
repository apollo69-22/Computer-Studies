package packages.if_else_programs.exammark;
import packages.keyboard.Keyboard;

class ExamMark{
    public static void main(String []args){
        System.out.print("Enter your Mark: ");
        int mark = Keyboard.readInt();
        
        if (mark>=50){ 
                System.out.println("You Passed!");
                System.out.println("Big Brain");
        }        
        else{
             System.out.println("You Failed!");
             System.out.println("You are a Failure");
        }
    }   
}