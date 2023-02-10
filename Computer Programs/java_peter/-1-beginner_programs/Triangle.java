package packages.beginner_programs.triangle;
import packages.keyboard.Keyboard;

class Triangle{
    public static void main (String []args){
        int base = 12;
        int height = 9;
        int area = base*height/2; //OR you can do (base*height)/2
        
        System.out.println("Area of Triangle is: " + area + " cm square");
        
        /* You could even do this to use a point(.)
        
        double base = 13;
        int height = 9;
        double area = (base*height)/2;       OR    double area = (base*height)*0.5;
        
        System.out.println("Area of Triangle is: " + area + " cm square");              */
        
        // This is called type casting:   int = area(int)(base*height)/2;
    }
}