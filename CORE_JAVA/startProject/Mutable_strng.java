import java.util.Scanner;
public class Mutable_strng {
    public static void main(String[] args)
    {
        // StringBuffer st = new StringBuffer();
        // System.out.print(st.capacity());

        /* 
        StringBuffer st = new StringBuffer();
        st.append("JAVA");
        st.append("JAVASCRIPT");
        st.append("JAMES GOSLING");
        System.out.println(st);
        // capacity=16
        System.out.println(st.capacity()); //capacity*2+2=34
        */

        //  StringBuffer st = new StringBuffer();
        // st.append("JAVA");
        // st.append("JAVASCRIPT");
        // st.append("JAMES GOSLING");
        // st.delete(1,10); // from 1 to 9 and 10th index will excluded
        // System.out.println(st);
        // // capacity=16
        // System.out.println(st.capacity()); //capacity*2+2=34

        // StringBuilder st = new StringBuilder();
        // System.out.print(st.capacity());

        // StringBuilder st = new StringBuilder();
        // st.append("JAVA");
        // st.append("JAVASCRIPT");
        // st.append("JAMES GOSLING");
        // System.out.println(st);
        // System.out.println(st.capacity());

        // StringBuilder st = new StringBuilder();
        // st.append("JAVA");
        // st.append("JAVASCRIPT");
        // st.append("JAMES GOSLING");
        // st.delete(1,10); 
        // System.out.println(st);
        // System.out.println(st.capacity());

        //reverce string
        //I. immutable to mutable
        /*
        //immutable
        String s ="JAVA"; 
        // System.out.println(s.reverse());

        //mutable
        StringBuffer st = new StringBuffer(s); 
        System.out.println(st.reverse());

         */

        /*
        //----------------------
        // II. mutable to immutable
        //mutable
        StringBuffer st = new StringBuffer("p@gmail.com"); 
        System.out.println(st);

        // System.out.println(st.toUpperCase());

        //immutable
        // 1.string
        String s=new String(st);
        System.out.println(s.toUpperCase());

        // 2. st is immutable i'll convert it to string
        String s2=st.toString();
        System.out.println(s2.charAt(0));

        */

        Scanner sc=new Scanner(System.in);
        System.out.println("enter string:");

        // String s=sc.next(); // 1 word
        // System.out.println(s);

        // String s=sc.nextLine();  // sentence
        // System.out.println(s); //white color

        String s=sc.nextLine();  // sentence
        System.err.println(s); // red color




    }
}
