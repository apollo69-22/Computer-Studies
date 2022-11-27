class OddEven{
    public static void main(String []args){
        System.out.print("Enter a number: ");
        int num = Keyboard.readInt();
        int rem = num%2;
        
        if (rem==1)
            System.out.println("Odd");
        else
            System.out.println("Even");
    }
}    