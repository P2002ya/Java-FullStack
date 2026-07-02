public class Day15_Method {
	//     1. No input and No output
	    int a;
	    int b;
	    void add()
	    {
	        int c =a+b;
	        System.out.println("The sum is: "+c);
	    }
	    public static void main(String[] arg)
	    {
	        Day15_Method obj = new Day15_Method();
	        obj.a=10;
	        obj.b=20;
	        obj.add();
	    }

	    /* 2. No input and output
	    int a;
	    int b;
	    int add()
	    {
	        int c =a+b;
	        return c;
	    }
	    public static void main(String[] arg)
	    {
	        Day15_Method obj = new Day15_Method();
	        obj.a=10;
	        obj.b=20;
	        int result = obj.add();
	        System.out.println("The sum is: "+result);
	    }*/

	    /* 3. Input and No output
	        
	        int c;
	        void add(int a, int b)
	        {
	            int c =a+b;
	            System.out.println("The sum is: "+c);
	        }
	        public static void main(String[] arg)
	        {
	            Day15_Method obj = new Day15_Method();
	            obj.add(10,20);
	        }*/

	        /* 4. Input and output
	        int c;
	        int add(int a, int b)
	        {
	         c =a+b;
	            return c;
	        }
	        public static void main(String[] arg)
	        {
	            Day15_Method obj = new Day15_Method();
	            int result = obj.add(10,20);
	            System.out.println("The sum is: "+result);
	        }
	            */

	        /*
	        // 5. Method calling another method


	        void add()
	        {
	          int a=10;
	          int b=20;
	            int c=a+b;
	            System.out.println("The addition is: "+c);
	        }

	        void sub()
	        {
	          int a=50;
	          int b=20;
	            int c=a-b;
	            System.out.println("The subtraction is: "+c);
	        }

	        void mul()
	        {
	          int a=10;
	          int b=20;
	            int c=a*b;
	            System.out.println("The multiplication is: "+c);
	        
	        }   
	        
	        void div()
	        {
	          int a=50;
	          int b=10;
	            int c=a/b;
	            System.out.println("The division is: "+c);
	        }

	          public static void main(String[] arg)
	        {
	            Day15_Method obj = new Day15_Method();
	            obj.add();
	            obj.sub();
	            obj.mul();
	            obj.div();
	        }
	        */
	       /* 
	        void add(int a, int b)
	        {
	            int c =a+b;
	            System.out.println("The sum is: "+c);
	        }

	        public static void main(String[] arg)
	        {
	            Day15_Method obj = new Day15_Method();
	            obj.add('A','B');   //implicit type casting
	           
	        }*/

	            /*
                void add(char a, char b)
	        {
	            System.out.println(a);
	            System.out.println(b);
	        }

	         public static void main(String[] arg)
	        {
	            Day15_Method obj = new Day15_Method();
	            obj.add((char)65, (char)66);   //Explicit type casting
	           
	        }
	            */



	    }
	        
