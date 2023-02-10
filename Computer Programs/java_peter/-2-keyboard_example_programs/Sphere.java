class Sphere{
    public static void main(String []args){
        System.out.println("    Volume of Sphere Calculator    ");
        System.out.print("Enter the radius of the sphere: ");
        
        final double PI = 3.142;
        
        double radius = Keyboard.readDouble();
        double ansRadius = radius*radius*radius;
        double volSphere = (double)4/3*PI*(ansRadius);  // if i type 4/3 instead of 1.33333, the output would display 392.75
                                                        // SOLUTION use (double)4/3*PI*(ansRadius);  it will force 4 to become a double variable
                                                                    // (double)4/3 is type casting, 
        
        System.out.println("The Volume of your sphere is: " + volSphere);
    }
}