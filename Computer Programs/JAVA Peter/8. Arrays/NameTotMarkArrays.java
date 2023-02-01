class NameTotMarkArrays {
    public static void main(String[] args) {
        System.out.println("    Names & Marks Storage   ");
        System.out.println();
        String[] names = new String[5];    //from 0 to 9
        int[] marks = new int[5];          //from 0 to 9
        int i = 0;
        
        for (i = 0; i < 5; i++) {
            System.out.print("Enter Name " + (i + 1) + ": ");
            names[i] = Keyboard.readString();
            System.out.print("Enter Mark " + (i + 1) + ": ");
            marks[i] = Keyboard.readInt();
        }
        
        System.out.println();
        System.out.println("You Just Entered " + i + " Names & " + i + " Marks");
        System.out.println();
        System.out.println();
        
        System.out.println("    List of Names & Marks   ");
        System.out.println();
        
        for (i = 0; i < 5; i++) {
            System.out.println(names[i] + ": " + marks[i]);
        }
    }
}