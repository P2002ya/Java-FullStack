import java.util.Scanner;
class p2
{
    public static void main(String[] arg)
    {
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        int n=5;
        // System.out.print("*");

      

         for(int i=1;i<=n;i++)             //rows
        {
           for(int j=1;j<=n;j++)         //columns
           {
            if(i==1 || i==n || j==1 || j==n)
               System.out.print("*");
            else
               System.out.print(" ");
           }
           System.out.println();
        }
        
        System.out.println(""); 

        
         for(int i=1;i<=n;i++)             //rows
        {
           for(int j=1;j<=n;j++)         //columns
           {
            if(i==1 || i==n || j==1 || j==n)
               System.out.print(i);
            else
               System.out.print(" ");
           }
           System.out.println();
        }
        
        System.out.println(""); 

        
         for(int i=1;i<=n;i++)             //rows
        {
           for(int j=1;j<=n;j++)         //columns
           {
            if(i==1 || i==n || j==1 || j==n)
               System.out.print(j);
            else
               System.out.print(" ");
           }
           System.out.println();
        }
        
        System.out.println(""); 

        
         for(int i=1;i<=n+1;i++)             //rows
        {
           for(int j=1;j<=n;j++)         //columns
           {
               System.out.print("*");
              }
           System.out.println();
        }
        
        System.out.println(""); 

        int count = 1;
         for(int i=1;i<=n;i++)             //rows
        {
           for(int j=1;j<=n;j++)         //columns
           {
            if (count<10)
                System.out.print("0");
               System.out.print(count+" ");
               count++;
           }
           System.out.println(" ");
        }
        
        System.out.println(""); 

        
         for(int i=1;i<=n;i++)             //rows
        {
           for(int j=1;j<=n;j++)         //columns
           {
            if ((i * j) <10)
                System.out.print("0");
               System.out.print(i*j+" ");
           }
           System.out.println();
        }
        
        System.out.println(""); 

    }  
 }