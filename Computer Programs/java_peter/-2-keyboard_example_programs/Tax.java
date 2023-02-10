package packages.keyboard_example_programs.tax;
import packages.keyboard.Keyboard;

class Tax{
    public static void main (String []args){
        System.out.println("    Price Calculator    ");
        System.out.print("Enter the price of your product: ");
        double price = Keyboard.readDouble();
        
        final double VAT = 0.18;
        
        double vat = price*VAT;
        double totalprice = vat+price;
        
        System.out.println("Your VAT(18%) is: " + vat);
        System.out.println("Your Total Price is: " + totalprice);
    }
}