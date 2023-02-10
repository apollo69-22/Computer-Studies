class CompoundIf{
    public static void main (String[]args){
        System.out.print("Enter your mark: ");
        int mark = Keyboard.readInt();
        
        if (mark>=0&&mark<=49)
            System.out.println("Fail!");
        else if (mark>=50&&mark<=65)
            System.out.println("Pass");
        else if (mark>=66&&mark<=85)
            System.out.println("Merit");
        else if (mark>=86&&mark<=100)
            System.out.println("Distinction");    
    }
}