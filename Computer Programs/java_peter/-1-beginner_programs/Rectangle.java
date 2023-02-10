package packages.beginner_programs.rectangle;
import packages.keyboard.Keyboard;

class Rectangle{
    public static void main (String []args){
        int length = 8;
        int width = 3;
        int area = length*width;
        
        int perimeter = length+length+width+width; // OR you could use this:  (length+width) * 2;
        
        System.out.println("Area: " + area + "cm square");
        System.out.println("Perimeter: " + perimeter + "cm");
    }
}