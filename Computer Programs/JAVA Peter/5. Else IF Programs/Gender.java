class Gender{
    public static void main (String []args){
        System.out.println("Enter your name: ");
        String name = Keyboard.readString();
        
        System.out.println("Enter your gender (M/F): ");
        char gen = Keyboard.readChar();
        char M = 'M';
        char m = 'm';
        char F = 'F';
        char f = 'f';
        
        if (gen==M | gen==m) {
            System.out.println("Mr. " + name);
        
        } else if (gen==F | gen==f) {
            System.out.println("Are you Married (Y/N):"); {
                
                char marriage = Keyboard.readChar();
                char Y = 'Y';
                char y = 'y';
                char N = 'N';
                char n = 'n';
                
                if (marriage==Y | marriage==y) {
                    System.out.println("Mrs. " + name);
                
                } else if (marriage==N | marriage==n)
                    System.out.println("Miss. " + name);
            }
            
            } else if (gen!=M | gen!=m | gen!=F | gen!=f){
                System.out.println("Error, please try again");            
        }
    }
}