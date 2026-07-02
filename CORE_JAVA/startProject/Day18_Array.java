import java.util.Scanner;
public class Day18_Array {
    public static void main(String[] args) {
     Scanner scan=new java.util.Scanner(System.in);
        System.out.println("Enter the number of students: ");   
        int students=scan.nextInt();
        int[] a=new int[students];
        /* 
        System.out.println("Enter the age: "); //default value 0
        a[0]=scan.nextInt();
        System.out.println("Enter the age: "); //default value 1
        a[1]=scan.nextInt();
        System.out.println("Enter the age: "); //default value 2
        a[2]=scan.nextInt();
        System.out.println("Enter the age: "); //default value 3
        a[3]=scan.nextInt();
        System.out.println("Enter the age: "); //default value 4
        */

        for(int i=0;i<students;i++){
            System.out.println("Enter the age of "+(i+1)+" Student"); 
            a[i]=scan.nextInt();
        }
        /* 
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);   
        */
        for(int i=0;i<students;i++){
            System.out.print(a[i]+" ");
        }
    }
}