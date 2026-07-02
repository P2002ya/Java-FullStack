import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
class p3
{
    public static void main(String[] arg)
    {
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        int n=5;
        // System.out.print("*");

       

        for(int i=1;i<=n;i++)
        {
           for(int j=1;j<=n;j++)
           {
               System.out.print((i+j)-1 + " ");
           }
           System.out.println();
        }
        System.out.println();

        for(int i=1;i<=n;i++)
        {
           for(int j=1;j<=i;j++)
           {
               System.out.print("*");
           }
           System.out.println("");
        }
        System.out.println(""); 
        

        for(int i=1;i<=n;i++)
        {
           for(int j=1;j<=i;j++)
           {
               System.out.print(i);
           }
           System.out.println("");
        }
        System.out.println(""); 


        for(int i=1;i<=n;i++)
        {
           for(int j=1;j<=i;j++)
           {
               System.out.print(j);
           }
           System.out.println("");
        }
        System.out.println(""); 

        for(int i=1;i<=n;i++)
        {
           for(int j=1;j<=i;j++)
           {
               System.out.print(i+j-1);
           }
           System.out.println("");
        }
        System.out.println(""); 

        int count =1;
         for(int i=1;i<=n;i++)
        {
           for(int j=1;j<=i;j++)
           {
               System.out.print(count + " ");
               count++;
           }
           System.out.println("");
        }
        System.out.println(""); 



        for(int i=1;i<=n;i++)
        {
           for(int j=1;j<=n-i;j++)
           {
               System.out.print("*");
           }
           System.out.println("");
        }
        System.out.println(""); 

        
        for(int i=1;i<=n;i++)
        {
           for(int j=1;j<=n;j++)
           {
               System.out.print("*");
           }
           System.out.println();
        }
        System.out.println();
        
        
         for(int i=1;i<=n;i++)
        {
           for(int j=1;j<=i;j++)
           {
               System.out.print("*");
           }
           System.out.println();
        }
        System.out.println();

         for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=n-i;k++)
           { 
            System.out.print(" ");
         }

           for(int j=1;j<=i;j++)
           {
               System.out.print("*");
           }
           

           System.out.println();
        }
        System.out.println();

        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=n-i;k++)
           { 
            System.out.print(" ");
         }

           for(int j=1;j<=i;j++)
           {
               System.out.print("*" + " ");
           }
           

           System.out.println();
        }
        System.out.println();


         for(int i=1;i<=n;i++)
        {
           for(int j=1;j<=i;j++)
           {
               System.out.print((i+j)-1 + " ");
           }
           System.out.println();
        }
        System.out.println();

    }  
 }