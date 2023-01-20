class MathsGrade{
    public static void main(String []agrs){
        System.out.println("  Maths Grade  ");
        
        System.out.print("Enter student's name: ");
        String name = Keyboard.readString();
        
        System.out.print("Enter student's mark: ");
        int mark = Keyboard.readInt();
        
        if (mark>80 && mark<=100) System.out.println("Grade A");
        else if (mark>60 && mark<=80) System.out.println("Grade B");
        else if (mark>40 && mark<=60) System.out.println("Grade C");
        else if (mark>0 && mark<=40) System.out.println("Grade F");
        else System.out.println("MARK OUT OF RANGE");
        
        System.out.println(name + " got " + mark + " out of 100");
    }
}