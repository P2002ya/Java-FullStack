import  java.util.Scanner;
public class Day22_JaggedArray3D {
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);  
            
            int[][][] a = new int[2][][];
            a[0]=new int[3][];
            a[1]=new int[2][];
            a[0][0]=new int[2];
            a[0][1]=new int[3]; 
            a[0][2]=new int[3];
            a[1][0]=new int[2];
            a[1][1]=new int[3];

            System.out.println("Enter the elements of jagged 3D array: ");
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[i].length;j++){
                    for(int k=0;k<a[i][j].length;k++){
                        System.out.print("enter the age for school "+(i+1)+" classroom "+(j+1)+" student "+(k+1)+": ");
                        a[i][j][k]=scan.nextInt();
                    }
                }
            }

            System.out.println("Elements of jagged 3D array are: ");
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
