import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Day05 {

	private static final String URL = "jdbc:mysql://localhost:3306/jdbc_DEC";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	
	private static final Scanner scan = new Scanner(System.in);
//	1.select
//	private static final String QUERY="Select * from `employee`"
//			+ " WHERE `dept` = ? ";
		

//	2.update
//	private static final String QUERY="Update `employee`" + 
//			" SET `salary`=`salary` + ? "
//			+ " WHERE `dept`= ? ";

//	3.insert
	private static final String QUERY="Insert into `employee`(`id`,`name`,`email`,`dept`,`salary`)" + 
			 " values( ?,?,?,?,?) ";

	
	public static void main(String[] args) {
		
		try {
			Connection con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
//			1.select
//			PreparedStatement pstmt = con.prepareStatement(QUERY);
//			System.out.println("Enter the department");
//			String dept = scan.next();
//			pstmt.setString(1,dept);
			
//			ResultSet res = pstmt.executeQuery();
			
//			Day03.printResultSet(res);
			
//			2.update
//			PreparedStatement pstmt = con.prepareStatement(QUERY);
//			System.out.println("Enter the Increment");
//			int inc = scan.nextInt();
//			System.out.println("Enter the department");
//			String dept = scan.next();
//			
//			pstmt.setInt(1,inc);
//			pstmt.setString(2,dept);
//			
//			int i = pstmt.executeUpdate();
//			System.out.println(i+" Row affected");
			
//			3.Insert
			display(con);
			String choice ;
			PreparedStatement pstmt =null;
			
			pstmt = con.prepareStatement(QUERY);
			do {
				
				System.out.println("Enter id");
				int id = scan.nextInt();
				System.out.println("Enter the name");
				String name = scan.next();
				System.out.println("Enter the email");
				String email = scan.next();
				System.out.println("Enter the department");
				String dept = scan.next();
				System.out.println("Enter salary");
				int sal = scan.nextInt();
				
				pstmt.setInt(1,id);
				pstmt.setString(2,name);
				pstmt.setString(3,email);
				pstmt.setString(4,dept);
				pstmt.setInt(5,sal);
				
//				int i = pstmt.executeUpdate();
				
				pstmt.addBatch();
//				System.out.println(i+" Row affected");
				System.out.println("Do you want to add one more employee : (YES/NO)?");

				choice = scan.next();
				
				
			}while(choice.equalsIgnoreCase("yes"));
			pstmt.executeBatch();

			display(con);
			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void display(Connection con) throws SQLException
	{
		String SELECT_QUERY = "select * from employee";
		
		Statement stmt=con.createStatement();
//		System.out.println("Stmt is created");
		
		ResultSet result = stmt.executeQuery(SELECT_QUERY);
		
		Day01.printResultSet(result);
		
	}

}
