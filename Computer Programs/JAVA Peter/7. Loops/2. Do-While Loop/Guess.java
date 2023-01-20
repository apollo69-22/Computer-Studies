class Guess {
    public static void main (String[] args) {
        int num = (int) (Math.random() * 10) + 1;
        int guess = 0, count = 0;
        
        do {
            
            System.out.print("Guess the number from 1 to 10: ");
            guess = Keyboard.readInt();
            count += 1;
        
            while (guess > 10) {
                System.out.println("Invalid Responce");
                break;
            }
            
        } while (guess != num); // Repeat as long as guess is not equal to num (guess != num)
        
        System.out.println("Well Done! You guessed after " + count + " tries.");
    }
}