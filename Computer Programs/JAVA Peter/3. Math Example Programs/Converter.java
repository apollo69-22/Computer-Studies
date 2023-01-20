class Converter{
    public static void main(String []args){
        System.out.println("    Binary To Decimal Converter    ");
        
        System.out.print("Enter the 1st Binary Bit: ");
        int binarybit1 = Keyboard.readInt();                        // This is equal to 1
        
        System.out.print("Enter the 2nd Binary Bit: ");
        int binarybit2 = Keyboard.readInt();                        // This is equal to 2
        
        System.out.print("Enter the 3rd Binary Bit: ");
        int binarybit3 = Keyboard.readInt();                        // This is equal to 4
        
        System.out.print("Enter the 4th Binary Bit: ");
        int binarybit4 = Keyboard.readInt();                        // This is equal to 8
        
        System.out.print("Enter the 5th Binary Bit: ");
        int binarybit5 = Keyboard.readInt();                        // This is equal to 16
        
        System.out.print("Enter the 6th Binary Bit: ");
        int binarybit6 = Keyboard.readInt();                        // This is equal to 32
        
        System.out.print("Enter the 7th Binary Bit: ");
        int binarybit7 = Keyboard.readInt();                        // This is equal to 64
        
        System.out.print("Enter the 8th Binary Bit: ");
        int binarybit8 = Keyboard.readInt();                        // This is equal to 128
        
        int decimalnumber = binarybit1*1 + binarybit2*2 + binarybit3*4 + binarybit4*8 + binarybit5*16 + binarybit6*32 + binarybit7*64 + binarybit8*128;
        
        System.out.println("Your Binary Number is: " + binarybit8 + binarybit7 + binarybit6 + binarybit5 + binarybit4 + binarybit3 + binarybit2 + binarybit1 + " and your Decimal Number is: " + decimalnumber);
    }
}