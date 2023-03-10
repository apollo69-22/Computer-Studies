class House {
    public static void main(String[] args) {
        System.out.println("What is your rooms' height, lenght, width, color and apertures?");
        
        //Declaring an object type Room and assigning values to room's instances variables
        Room kitchen = new Room();
        System.out.println("Enter Properties of Kitchen");
        System.out.print("Height of Kitchen: ");
        kitchen.height = Keyboard.readDouble();
        System.out.print("Lenght of Kitchen: ");
        kitchen.length = Keyboard.readDouble();
        System.out.print("Width of Kitchen: ");
        kitchen.width = Keyboard.readDouble();
        System.out.print("Color of Kitchen: ");
        kitchen.color = Keyboard.readString();
        System.out.print("Apertures of Kitchen: ");
        kitchen.apertures = Keyboard.readInt();
        
        Room garage = new Room();
        System.out.println();
        System.out.println("Enter Properties of Garage");
        System.out.print("Height of Garage: ");
        garage.height = Keyboard.readDouble();
        System.out.print("Lenght of Garage: ");
        garage.length = Keyboard.readDouble();
        System.out.print("Width of Garage: ");
        garage.width = Keyboard.readDouble();
        System.out.print("Color of Garage: ");
        garage.color = Keyboard.readString();
        System.out.print("Apertures of Garage: ");
        garage.apertures = Keyboard.readInt();
        
        System.out.println("Volumes of kitchen is: " + kitchen.getVol());
        System.out.println("Volumes of garage is: " + garage.getVol());
        
        System.out.println();
        System.out.println("Enter price of tiles per square meter: ");
        double tilePrice = Keyboard.readDouble();
        
        System.out.println("Price per square meter: " + tilePrice);
        double tileArea = kitchen.getFArea() + garage.getFArea();
        
        System.out.println("Total area to be tiled: " + tileArea);

        double totalPrice = tileArea * tilePrice;
        System.out.println("Total cost of tiles: " + totalPrice);
    }
}