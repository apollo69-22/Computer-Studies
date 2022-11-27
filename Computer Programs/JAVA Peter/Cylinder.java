class Cylinder{
    public static void main(String []args){
        System.out.println("    Total Surface Area of a Cylinder Calculator    ");
        
        System.out.print("Enter the radius: ");
        double radius = Keyboard.readDouble();
        
        final double PI = 3.142;
        
        System.out.print("Enter the height: ");
        double height = Keyboard.readDouble();
        
        double square = Math.pow(radius, 2);   // Math.pow() is used to work out the powers like, Math.pow(4, 3); this will work out 4*4*4
        double area = (2*PI*square)+(2*PI*height);
        
        System.out.println("The Total Surface Area of your Cylinder is: " + area);
    }
}