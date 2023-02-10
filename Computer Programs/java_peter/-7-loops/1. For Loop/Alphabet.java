class Alphabet {
    public static void main(String[] args) {
        System.out.println("Printing The Alphabet");
        System.out.println();

        for (char letter = 'A'; letter <= 'Z'; letter++) {
            System.out.print(letter + " ");
        }

        System.out.println();

        for (char letter = 'a'; letter <= 'z'; letter++) {
            System.out.print(letter + " ");
        }

        
        
        
        /*
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.println(i + " ");
        }

        for (char i = 'a'; i <= 'z'; i++) {
            i = Character.toUpperCase(i);
            System.out.println(i + " ");
            
            if (i == 'Z')
            break;
        }   */
        
    }
}