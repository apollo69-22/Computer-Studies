package packages.math_example_programs.surfsphere;
import packages.keyboard.Keyboard;

class SurfSphere{
    public static void main(String []args){
        System.out.println("    Surface Area of a Sphere Calculator    ");
        
        System.out.print("Enter radius: ");
        double rad = Keyboard.readDouble();
        
        final double PI = 3.142;
        double surfacearea = 4*PI*Math.pow(rad, 2);
        
        System.out.println("The surface area is: " + surfacearea);        
    }
}