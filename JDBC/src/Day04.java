import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Day04 {

	private static final String URL = "jdbc:mysql://localhost:3306/jdbc_DEC";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	
	private static final Scanner scan = new Scanner(System.in);
	
//	private static final String QUERY="Select * from `employee`"
//			+ " WHERE `dept` = ? ";
	
	private static final String QUERY="Update `employee`" + 
								" SET `salary`=`salary` + ? "
								+ " WHERE `dept`= ? ";
			
	
	public static void main(String[] args) {
		
		try {
			Connection con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
			
//			PreparedStatement pstmt = con.prepareStatement(QUERY);
//			System.out.println("Enter the department");
//			String dept = scan.next();
//			pstmt.setString(1,dept);
			
//			ResultSet res = pstmt.executeQuery();
			
			PreparedStatement pstmt = con.prepareStatement(QUERY);
			System.out.println("Enter the Increment");
			int inc = scan.nextInt();
			System.out.println("Enter the department");
			String dept = scan.next();
			
			pstmt.setInt(1,inc);
			pstmt.setString(2,dept);
			
			int i = pstmt.executeUpdate();
			System.out.println(i+" Row affected");
			
//			Day03.printResultSet(res);
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
