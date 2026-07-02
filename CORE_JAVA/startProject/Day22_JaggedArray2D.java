import java.util.Scanner;
public class Day22_JaggedArray2D {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int[][] a = new int[2][];
        a[0]=new int[2];
        a[1]=new int[3];

        System.out.println("Enter the elements of jagged array: ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=scan.nextInt();
            }   
        }

        System.out.println("Elements of jagged array are: ");
         for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }  
            System.out.println();    
        }

    }
}
