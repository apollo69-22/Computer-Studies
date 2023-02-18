public class TelDirectoryII {
    public static int mainMenu() {
        System.out.println("    Menu    ");
        System.out.println("1. Enter Details");
        System.out.println("2. Display Details");
        System.out.println("3. Search Particular Name");
        System.out.println("4. Exit");
        System.out.println();
    
        System.out.print("Enter a choice: ");
        int choice = Keyboard.readInt();
        System.out.println();

        return choice;
    }

    public static String[][] inputDetails() {
        System.out.print("How many entries?: " );
        int entries = Keyboard.readInt();

        String[] names = new String[entries]; 
        String[] localities = new String[entries]; 
        String[] telMobNum = new String[entries];

        System.out.println();
        System.out.println("Enter " + entries + " Names, Localities, Tel/Mob Numbers: ");
        for (int i = 0; i < entries; i++) {
            System.out.print("Enter Name " + (i + 1) + ": ");
            names[i] = Keyboard.readString();
            names[i] = names[i].trim();

            System.out.print("Enter Locality " + (i + 1) + ": ");
            localities[i] = Keyboard.readString();
            
            System.out.print("Enter Tel/Mob Numbers " + (i + 1) + ": ");
            telMobNum[i] = Keyboard.readString();

            System.out.println();
        }

        return new String[][] {names, localities, telMobNum};
    }

    public static void outputDetails(String[][] data) {
        System.out.println();
        System.out.println("    Details    ");

        for (int i = 0; i < data[0].length; i++) {   
            System.out.println("Names: " + data[0][i]);
            System.out.println("Localities: " + data[1][i]);
            System.out.println("Tel/Mob Numbers: " + data[2][i]);
            System.out.println();
        }
    }

    public static void searchDetails(String[][] data) {
        String[] names = data[0]; String[] localities = data[1]; String[] telMobNum = data[2];

        System.out.print("Enter a name you want to search for: ");
        String search = Keyboard.readString();
        search = search.trim();
        System.out.println();
    
        boolean found = false;      
        for (int i = 0; i < names.length; i++) {
            if (search.equals(names[i])) {
                System.out.println("Name: " + names[i]);
                System.out.println("Locality: " + localities[i]);
                System.out.println("Tel/Mob Number: " + telMobNum[i]);
                System.out.println();
                found = true;
            }
        }
        if (found == false) {
            System.out.println("Not Found");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int choice = 0;
        String[] names = null; String[] localities = null; String[] telMobNum = null;

        while (choice != 4) {
            choice = mainMenu();

            switch (choice) {
                case 1:
                    String[][] data = inputDetails();
                    names = data[0];
                    localities = data[1];
                    telMobNum = data[2];
                break;

                case 2:
                    outputDetails(new String[][] {names, localities, telMobNum});
                break;

                case 3:
                    searchDetails(new String[][] {names, localities, telMobNum});
                break;

                case 4:
                break;

                default:
                    System.out.print("Please enter a number from 1 to 4");
                break;
            }
        }
    }
}
