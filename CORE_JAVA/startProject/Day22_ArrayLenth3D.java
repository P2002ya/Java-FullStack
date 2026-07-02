import java.util.Scanner;
public class Day22_ArrayLenth3D {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

            int schools=scan.nextInt();
            int clsrm = scan.nextInt();
            int students=scan.nextInt();

            int[][][] a=new int[schools][clsrm][students];
            
            for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                for(int k=0;k<a[i][j].length;k++){
                    a[i][j][k]=scan.nextInt();
                    }
                }
             }
             
             System.out.println("Length of 3D array is: ");
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[i].length;j++){
                    for(int k=0;k<a[i][j].length;k++){
                        System.out.print(a[i][j][k]+" ");
                    }
                    System.out.println();
                }
                System.out.println();
            }

    }
}

    


