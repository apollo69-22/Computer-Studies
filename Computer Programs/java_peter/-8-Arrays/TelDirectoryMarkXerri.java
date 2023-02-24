package packages.arrays.teldirectorymarkxerri;
import packages.keyboard.Keyboard;

class TelDirectoryMarkXerri{
    public static void main (String[]args){   
        int choice=0;

        System.out.println("How many Persons'information would you like to work with? ");
        int pnum=Keyboard.readInt();
        String[] names = new String[pnum];
        String[] snames = new String[pnum];
        int[] number = new int[pnum];
        String[] locality = new String[pnum];

        boolean found=false;
        boolean entered=false;
        do{
            System.out.println("1. Enter details");
            System.out.println("2. Display details");
            System.out.println("3. Display tel/mob numb of particular person");
            System.out.println("4. Exit");
            choice=Keyboard.readInt();
            switch (choice){
                case 1:
                for(int i=0;i<pnum;i++){
                    System.out.println("Name "+(i+1)+":");
                    names[i]=Keyboard.readString();
                    System.out.println("Enter Surname "+(i+1)+":");
                    snames[i]=Keyboard.readString();
                    System.out.println("Enter Number "+(i+1)+":");
                    number[i]=Keyboard.readInt();
                    System.out.println("Enter Residence Of Person "+(i+1)+":");
                    locality[i]=Keyboard.readString();
                }
                entered=true;
                break;

                case 2:
                if (entered==true){
                    for(int i=0;i<pnum;i++){
                        System.out.println("Person "+(i+1)+": "+names[i]+" "+snames[i]+" from "+locality[i]+" : "+number[i]);
                    }
                }
                else System.out.println("Please enter the details first.");
                break;

                case 3:
                if (entered==true){
                    System.out.println("Enter name or surname of person to be found:");
                    String search=Keyboard.readString();
                    for(int i=0;i<pnum;i++){
                        if (search.equals(names[i]) || (search.equals(snames[i]))){
                            System.out.println("Name: "+names[i]+" "+snames[i]+" from "+locality[i]+" Number: "+number[i]);
                            found=true;
                        }
                    }
                    if (found==false) System.out.println("Person not found");
                }
                else System.out.println("Please enter the details first.");
                break;

                case 4:break;
                default: System.out.println("Number enetered was not in range 1-4");
            }
        }while(choice!=4);
    }
}