class Dice{
    public static void main(String []args){
        System.out.print("Guess the Number: ");
        int num = Keyboard.readInt();
        int rNum = (int) (Math.random() * 3 + 1);
        
        if (num==rNum)
            System.out.println("Well Done");
        else
            System.out.println("No. Try Again.");
    }
}