class VolCylinder{
    public static void main (String []args){
        System.out.println("    Finding the Volume of a Cylinder    ");
        
        System.out.print("Enter radius of cylinder: ");
        double radius = Keyboard.readDouble();
        System.out.print("Enter height of cylinder: ");
        double height = Keyboard.readDouble();
        final double PI = 3.1415926535897932384626433832795; // declaring PI, will not change
        double volume = 2*PI*radius*height;  // OR do this instead:  double volume = 2*3.142*radius*height;   BETTER VERSION
                                                // This is a much more complicated version: float volume = 2*3.142f*radius*height;
        
        System.out.println("Volume of Cylinder is: " + volume + " cubic cm");
    }
}