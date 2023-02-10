class Months{
    public static void main(String []args){
        System.out.print("Enter a number from 1 - 12: ");
        int mon = Keyboard.readInt();
        
        if (mon==1|mon==3|mon==5|mon==7|mon==8|mon==10|mon==12)
            System.out.println("It has 31 Days");
        else if (mon==2) System.out.println("It has 28 or 29 days");
        else System.out.println("It has 30 Days");
            
        
        /* int mon = Keyboard.readInt();
          
          
           if (monthNum==1)
            System.out.println("January has 31 Days");
        else if (monthNum==2)
            System.out.println("Febuary has 28 Days");
        else if (monthNum==3)
            System.out.println("March has 31 Days");
        else if (monthNum==4)
            System.out.println("April has 30 Days");
        else if (monthNum==5)
            System.out.println("May has 31 Days");
        else if (monthNum==6)
            System.out.println("June has 30 Days");
        else if (monthNum==7)
            System.out.println("July has 31 Days");
        else if (monthNum==8)
            System.out.println("August has 31 Days");
        else if (monthNum==9)
            System.out.println("September has 30 Days");
        else if (monthNum==10)
            System.out.println("October has 31 Days");
        else if (monthNum==11)
            System.out.println("November has 30 Days");
        else if (monthNum==12)
            System.out.println("December has 31 Days");
            
        else System.out.println("Error. Try Again"); */
    }
}