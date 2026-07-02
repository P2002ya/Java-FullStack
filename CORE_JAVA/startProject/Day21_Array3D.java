import java.util.Scanner;
public class Day21_Array3D {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

            int schools=scan.nextInt();
            int clsrm = scan.nextInt();
            int students=scan.nextInt();

            int[][][] a=new int[schools][clsrm][students];
            for(int i=0;i<schools;i++){
                for(int j=0;j<clsrm;j++){
                    for(int k=0;k<students;k++){
                        a[i][j][k]=scan.nextInt();
                    }
                }
            }
            for(int i=0;i<schools;i++){
                for(int j=0;j<clsrm;j++){
                    for(int k=0;k<students;k++){
                        System.out.print(a[i][j][k]+" ");
                    }
                    System.out.println();
                }
                System.out.println();
            }

    }
}

    //     for(int i=0;i<students;i++){
    //         System.out.println("Enter the age of "+(i+1)+" Student"); 
    //         a[i]=scan.nextInt();

    //     for(int i=0;i<students;i++){
    //         System.out.print(a[i]+" ");
    //     }    
    // }
