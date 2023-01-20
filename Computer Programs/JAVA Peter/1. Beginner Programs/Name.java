class Name{
    public static void main(String []args){
        System.out.print("Enter you first name: ");
        String name = Keyboard.readString();
        
        System.out.print("Enter you second name: ");
        String secondname = Keyboard.readString();
        
        System.out.println("Your full name is: " + name + " " + secondname);
    }
}