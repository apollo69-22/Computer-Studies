class TelDirectory {
    public static void main(String[] args) {
        System.out.print("Enter Amount of People: " );
        int amount = Keyboard.readInt();
    
        String[] names = new String[amount];
        String[] localities = new String[amount];
        int[] telMobNum = new int[amount];
        
        int choice = 0;
        do {
            System.out.println();
            System.out.println();
            System.out.println("    Menu    ");
            System.out.println("1. Enter Details");
            System.out.println("2. Display Details");
            System.out.println("3. Search Particular Name");
            System.out.println("4. Exit");
            System.out.println();
        
            System.out.print("Enter a choice: ");
            choice = Keyboard.readInt();
        
            switch (choice) {
                case 1:
                    System.out.println();
                    System.out.println("Enter " + amount + " Names, Localities, Tel/Mob Numbers: ");
                    for (int i = 0; i < amount; i++) {
                        System.out.print("Enter Name " + (i + 1) + ": ");
                        names[i] = Keyboard.readString();
        
                        System.out.print("Enter Locality " + (i + 1) + ": ");
                        localities[i] = Keyboard.readString();
                        
                        System.out.print("Enter Tel/Mob Numbers " + (i + 1) + ": ");
                        telMobNum[i] = Keyboard.readInt();
    
                        System.out.println();
                    }

                break;
                         
                case 2:
                    System.out.println();
                    System.out.println("    Details    ");

                    for (int i = 0; i < amount; i++) {   
                        System.out.println("Names: " + names[i]);
                        System.out.println("Localities: " + localities[i]);
                        System.out.println("Tel/Mob Numbers: " + telMobNum[i]);
                        System.out.println();
                    }
                    
                break;
                
                case 3:
                    System.out.print("Enter a name you want to search for: ");
                    String search = Keyboard.readString();
                
                    boolean found = false;                    
                    for (int i = 0; i < amount; i++) {
                        if (search.equals(names[i])) {
                            System.out.println("Name: " + names[i]);
                            System.out.println("Locality: " + localities[i]);
                            System.out.println("Tel/Mob Number: " + telMobNum[i]);
                            found = true;

                        }
                        if (found == false)
                            System.out.print("Not Found");
                    }
            }

        } while (choice != 4);
    } 
}