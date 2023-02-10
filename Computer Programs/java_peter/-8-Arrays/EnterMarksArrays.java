package packages.arrays.entermarksarrays;
import packages.keyboard.Keyboard;

class EnterMarksArrays {
    public static void main(String[] args) {
        System.out.println("    Marks Storage   ");
        System.out.println();
        int[] marks = new int[10];  //from 0 to 9
        int i = 0;
        
        for (i = 0; i < 10; i++) {
            System.out.print("Enter Mark " + (i + 1) + ":");
            marks[i] = Keyboard.readInt();
        }
        
        System.out.println();
        System.out.println("You Just Entered " + i + " Marks");
    }
}