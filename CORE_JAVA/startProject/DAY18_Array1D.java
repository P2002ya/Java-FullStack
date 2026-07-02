import java.util.Scanner;
public class DAY18_Array1D {

    public static void main(String[] args) {
     Scanner scan=new java.util.Scanner(System.in);
     
    /*
        System.out.println("Enter the number of students: ");   
            int students=scan.nextInt();
            int[] a=new int[students];

        for(int i=0;i<students;i++){
            System.out.println("Enter the age of "+(i+1)+" Student"); 
            a[i]=scan.nextInt();

        for(int i=0;i<students;i++){
            System.out.print(a[i]+" ");
        }    
    */


     /* 
        System.out.println("Enter the number of students: ");   
        int students=scan.nextInt();
        float[] a=new float[students];

        for(int i=0;i<students;i++){
            System.out.println("Enter the height of "+(i+1)+" Student"); 
            a[i]=scan.nextFloat();
        }
        for(int i=0;i<students;i++){
            System.out.print(a[i]+" ");
        }
     */

        System.out.println("Enter the number of students: ");   
        int students=scan.nextInt();
        String[] a=new String[students];

        for(int i=0;i<students;i++){
            System.out.println("Enter the name of "+(i+1)+" Student"); 
            a[i]=scan.next();
        }

        for(int i=0;i<students;i++){
            System.out.print(a[i]+" ");
    }
}
}

