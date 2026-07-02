import java.util.Scanner;
public class Day19_Array2D {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        
        int clsrm = scan.nextInt();
        int students=scan.nextInt();

            int[][] a=new int[clsrm][students];

            for(int i=0;i<clsrm;i++){
                    for(int j=0;j<students;j++){
                        a[i][j]=scan.nextInt();
                    }
                }

            System.out.println("Length of 2D array is: ");
            for(int i=0;i<clsrm;i++){
                for(int j=0;j<students;j++){
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }

    }
}

