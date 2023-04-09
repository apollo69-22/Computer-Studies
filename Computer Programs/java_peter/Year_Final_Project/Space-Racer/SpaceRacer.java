import java.io.IOException;
import java.util.Map;
import java.util.HashMap;


class SpaceRacer {
    public static void getStats(String stats[]) {
        System.out.println("    Location   |   Cargo   ");
        System.out.printf("      %s      %s     ", stats[0], stats[1]);
    }

    public static void getMap(Map<String, String> star_map) {
        System.out.println();
        System.out.println(star_map);
    }

    public static String check_location(String location, Map<String, String> star_map) {
        String output = "not found";

        for(Map.Entry<String, String> loc: star_map.entrySet()) {
            if (loc.getKey().equals(location)) {
                output = location + ": " + loc.getValue();
                break;
            }
            else if (loc.getValue().equals(location)) {
                output = location + ": " + loc.getKey();
                break;
            }
        }
        return output;
    }

    public static void getShipCargo(Map<String, String> ship_cargo) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        
        String output = "Current cargo:\n";
            
        if (ship_cargo.size() != 0) {
            for(Map.Entry<String, String> item: ship_cargo.entrySet())
            output += "\n" + item.getKey() + " " + item.getValue();
        }

        System.out.print(output);
    }

    public static int mainMenu() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        System.out.println(" ___________________________________");
        System.out.println("|     WELCOME TO SPACE TRAVELER     |");
        System.out.println("|                                   |");
        System.out.println("| 1. Game Instructions              |");
        System.out.println("| 2. Play Game                      |");
        System.out.println("| 3. Exit                           |");
        System.out.println("|___________________________________|");
        System.out.println();
        
        System.out.print("Enter a choice: ");
        int choice = Keyboard.readInt();
        System.out.println();

        return choice;
    }

    public static String game_init(Map<String, String> star_map, String[] locations) {
        star_map.put("SUN", "0:0:0");
        star_map.put("EARTH", "-0.992:-0.1:0");
        star_map.put("MARS","-0.140:1.195:0.053");

        return locations[3];
    }

    public static void getHint() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        System.out.print("HINT: Travel to a coordinate by using your starmap.");

        try {
            Thread.sleep(4000);
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static String travel(String current_location, String dest_coordinate, Map<String, String> star_map) {
        String found_location[] = check_location(dest_coordinate, star_map).split(": ");
        
        if (found_location[0].equals("not found"))
            System.out.println("Invalid Location");
        else {
            for(Map.Entry<String, String> loc: star_map.entrySet()) {
                if (loc.getKey().equals(found_location[0]) || loc.getValue().equals(found_location[0])) {
                    if (loc.getKey().equals(current_location))
                        System.out.println("Already there.");
                    else {
                        current_location = loc.getKey();
                        break;
                    }
                }
            }
        }        
        return current_location;
    }

    public static void game() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        
        Map<String, String> star_map = new HashMap<>();
        Map<String, String> ship_cargo = new HashMap<>();

        String locations[] = {
            "SUN", "MERCURY", "VENUS", "EARTH", "MARS", "JUPITER", "SATURN", "URANUS", "NEPTUNE", "PLUTO", "UNKNOWN"
        };

        String current_location = game_init(star_map, locations);

        String stats[] = {current_location, ship_cargo.keySet().toString()};

        String command_lst[] = {
            "exit", "help", "stats", "cargo", "find: ", "starmap", "travel: ", "hint"
        };

        String command = "";
        while(!command.equals(command_lst[0])) {
            System.out.print("\nCommand: ");
            command = Keyboard.readString();

            if (command.equals(command_lst[1])) {
                System.out.print("\n| ");
                for (int i = 0; i < command_lst.length; i++) {
                    System.out.print(command_lst[i] + " : ");
                }
                System.out.print("|\n");
            }
            else if (command.equals(command_lst[2])) {
                getStats(stats);
            }
            else if (command.equals(command_lst[3])) {
                getShipCargo(ship_cargo);
            }
            else if (command.contains(command_lst[4])) {
                String x[] = command.split(" ");
                String output = check_location(x[1], star_map);
                System.out.printf("\n%s\n", output);
            }
            else if (command.contains(command_lst[5])) {
                getMap(star_map);
            }
            else if (command.contains(command_lst[6])) {
                String x[] = command.split(" ");
                stats[0] = current_location = travel(current_location, x[1], star_map);
            }
            else if (command.contains(command_lst[7])) {
                getHint();
            }
        }
    }

    public static void instructions() throws IOException, InterruptedException {        
        char choice = ' ';
        while (choice != 'B' && choice != 'b') {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

            System.out.println(" __________________________________________________________________________________________________________________");
            System.out.println("|                                             Instructions:                                                        |");
            System.out.println("|                                                                                                                  |");
            System.out.println("|You are a new Lieutenant in Starfleet.                                                                            |");
            System.out.println("|You're assigned to Company Alpha under Captain James T. Kirk. Assigned to the Orbiter IV!                         |");
            System.out.println("|You're heading to Europa, one of Jupiter's Moons to explore any Alien life you may find.                          |");
            System.out.println("|Unfortunately the Ships navigation system is a bit glitchy…                                                       |");
            System.out.println("|                                                                                                                  |");
            System.out.println("|Mission:                                                                                                          |");
            System.out.println("|Help Captain Kirk cross the Solar System safely.                                                                  |");
            System.out.println("|                                                                                                                  |");
            System.out.println("|Objective:                                                                                                        |");
            System.out.println("|There are multiple Satellites located within the Solar System which have backup Star charts and co-ordinates.     |");
            System.out.println("|You must locate the proper ones which will take you to Europa.                                                    |");
            System.out.println("|                                                                                                                  |");
            System.out.println("|CAUTION:                                                                                                          |");
            System.out.println("|Space junk is dangerous!                                                                                          |");
            System.out.println("|Some asteroids have precious metal deposites and some will give a set of points.                                  |");
            System.out.println("|If you pass through a wormhole you can end up anywhere in the universe!                                           |");
            System.out.println("|                                                                                                                  |");
            System.out.println("|Starting Stats:                                                                                                   |");
            System.out.println("|                  - Starting Location: Earth                                                                      |");
            System.out.println("|                                                                                                                  |");
            System.out.println("|Tips:                                                                                                             |");
            System.out.println("|      Try: 'help' for a list of commands!                                                                         |");
            System.out.println("|__________________________________________________________________________________________________________________|");
            
            System.out.println();
            System.out.print("Press B to continue: ");
            choice = Keyboard.readChar();

            if (choice != 'B' && choice != 'b') {
                System.out.print("\nError. Press B to continue.");

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        int choice = 0;

        while (choice != 3) {
            choice = mainMenu();

            switch (choice) {
                case 1:
                    instructions();
                break;

                case 2:
                    game();
                break;

                case 3:
                break;

                default:
                    System.out.print("Error. Please enter a number from 1 to 3.");

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                break;
            }
        }
    }
}