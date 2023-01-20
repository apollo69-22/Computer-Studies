class Bits{
    public static void main(String []args){
        System.out.println("    Megabytes to Bits Calculator    ");
        
        System.out.print("Enter the number of Megabytes: ");
        int megabytes = Keyboard.readInt();
        
        int mbtobits = 8*1024*1024; // Using a computer will be like this: int mbtobits = 8*1024*1024;
        int ans = megabytes*mbtobits;
        
        System.out.println(megabytes + " Megabytes are " + ans + " bits");
    }
}