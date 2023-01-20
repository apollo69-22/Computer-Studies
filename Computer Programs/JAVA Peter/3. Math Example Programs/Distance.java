class Distance{
    public static void main(String []args){
        System.out.println("    Distance covered Calculator    ");
        
        System.out.print("Enter Velocity: ");
        double velocity = Keyboard.readDouble();
        
        System.out.print("Enter Time: ");
        double time = Keyboard.readDouble();
        
        System.out.print("Enter Accelaration: ");
        double accelaration = Keyboard.readDouble();
        
        //double distance = (velocity*time)+(0.5)+(accelaration*(float)Math.pow(time, 2));
        double distance = (velocity*time)+(double)(0.5)+(accelaration*Math.pow(time, 2));
        
        System.out.println("The distance covered is: " + distance);
    }
}