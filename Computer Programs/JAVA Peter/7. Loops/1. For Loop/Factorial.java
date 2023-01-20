class Factorial {
    public static void main(String[] args) {
        System.out.println("    Factorial Calculator  ");
        System.out.print("Enter your Number: ");
        long num = Keyboard.readLong();

        if (num <= 20 && num >= 0) {
            System.out.print("Your Answer is: " + num);
            for (long i = (num - 1); i > 0; i--) {
                System.out.print("*" + i);
                num *= i;
            } 

            System.out.printf(" = %d", num);
        
        } 
        
        else if (num > 20)
            System.out.println("Buffer OVERFLOW OCCURS With Numbers ABOVE 20");
        else if (num < 0)
            System.out.println("Number cannot be smaller than 0");
    }
}