class Seasons{
    public static void main (String []args){
        System.out.println("Enter a number: ");
        int num = Keyboard.readInt();
        
        if (num==1 | num==2 | num==12) {
            System.out.println("Winter is during December till February");
        
        } else if (num==3 | num==4 | num==5) {
            System.out.println("Spring is during March till May");
        
        } else if (num==6 | num==7 | num==8) {
            System.out.println("Summer is during June till August");
        
        } else if (num==9 | num==10 | num==11) {
            System.out.println("Autumn is during September till November");
        
        } else System.out.println("Error. Try Again");
    }
}