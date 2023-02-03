public class EnterMarksMarkXerriExample{
    public static void main (String args []){
        int[] marks=new int [10]; 
        String[] names=new String [10];
        int smallest=100;
        int largest=0;
        int total=0;

        System.out.println("Enter list of 10 names and their marks:");
        System.out.println();
        for (int i=0; i<10; i++){
            System.out.println("Please enter names "+(i+1)+":");
            names[i]=Keyboard.readString();
            System.out.println("Please enter marks "+(i+1)+":");
            marks[i]=Keyboard.readInt();
            total+=marks[i];
            //if (marks[i]>largest) largest=marks[i];
            //if (marks[i]<smallest) smallest=marks[i];
            largest=Math.max(largest,marks[i]);
            smallest=Math.min(smallest,marks[i]);
        }
        double average=(double)total/10;

        System.out.println();
        System.out.println("List of Students");
        for (int i=0; i<10; i++){
            System.out.println(names[i]+" : "+marks[i]);
        }
        System.out.println();
        System.out.println("Total:"+total);
        System.out.println("Average:"+average);
        System.out.println("Largest:"+largest);
        System.out.println("Smallest:"+smallest);
        System.out.println();
        System.out.println("List of names above the Average");
        for (int i=0; i<10; i++){
            if (marks[i]>=average) System.out.println(names[i]);
        }
        System.out.println();
        System.out.println("Student Grades");
        for (int i=0; i<10; i++){
            if ((marks[i]>80)&&(marks[i]<=100)){
                System.out.println(names[i]+" : A");
            }
            else if ((marks[i]>60)&&(marks[i]<=79)){
                System.out.println(names[i]+" : B");
            }
            else if ((marks[i]>40)&&(marks[i]<=59)){
                System.out.println(names[i]+" : C");
            }
            else if ((marks[i]>=0)&&(marks[i]<=39)){
                System.out.println(names[i]+" : F");
            }
        }
    }
}