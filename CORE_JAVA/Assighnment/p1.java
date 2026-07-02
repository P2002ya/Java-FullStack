class p1
{
    public static void main(String[] arg)
    {
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        int n=5;
        // System.out.print("*");

        for(int i=1;i<=5;i++)
        {
           System.out.print("*");   
           System.out.println("");   
        } 

        System.out.println("");

        for(int i=1;i<=n;i++)             //rows
        {
           for(int j=1;j<=n;j++)         //columns
           {
               System.out.print("*");
           }
           System.out.println();
        }
        
        System.out.println(""); 

         for(int i=1;i<=n;i++)             //rows
        {
           for(int j=1;j<=n;j++)         //columns
           {
               System.out.print(i+" ");
           }
           System.out.println();
        }
        
        System.out.println(""); 

         for(int i=1;i<=n;i++)             //rows
        {
           for(int j=1;j<=n;j++)         //columns
           {
               System.out.print(j+" ");
           }
           System.out.println();
        }
        
        System.out.println(""); 

        for(int i=1;i<=n;i++)             //rows
        {
           for(int j=1;j<=n+1;j++)         //columns
          {
               System.out.print(i+"");
           }
           System.out.println();
        }
        
        System.out.println(""); 


        for(int i=1;i<=n;i++)
        {
           for(int j=1;j<=i;j++)
           {
               System.out.print("*");
           }
           System.out.println("");
        }
        System.out.println(""); 

         for(int i=1;i<=n;i++)             //rows
        {
           for(int j=1;j<=n;j++)         //columns
           {
               System.out.print("*"+" ");
           }
           System.out.println();
        }
        
        System.out.println(""); 

        

        
        
    }  
 }