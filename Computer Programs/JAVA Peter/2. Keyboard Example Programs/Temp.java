class Temp{
    public static void main(String []args){
        System.out.println("    Celsius to Fahrenheit    ");
        
        System.out.print("Enter your Temperature: ");
        double C = Keyboard.readDouble();
        double F = C*9/5+32;
        
        System.out.println(C + " Celsius becomes: " + F + " Fahrenheit");
    }
}