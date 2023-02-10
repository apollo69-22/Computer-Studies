class Cuboid{
    public static void main (String []args){
        System.out.println("    Finding the volume of a Cylinder    ");
        
        System.out.print("Enter the length: ");
        double Num1 = Keyboard.readDouble();
        
        System.out.print("Enter the width: ");
        double Num2 = Keyboard.readDouble();
        
        System.out.print("Enter the height: ");
        double Num3 = Keyboard.readDouble();
        
        double volume = Num1*Num2*Num3;
        
        System.out.println("The Volume of the Cylinder is: " + volume);
    }
}