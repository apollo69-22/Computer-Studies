class Numbers {
    public static void main(String[] args) {
        System.out.print("Please enter a number between 5 and 20: ");
        int num = Keyboard.readInt();

        if (num >= 5 && num <= 20)
            for (int i = 1; i <= num; i++) {
                System.out.println("Number: " + i);
            }
        else System.out.println("Error. Enter A NUMBER BETWEEN 5 and 20");    
    }
}