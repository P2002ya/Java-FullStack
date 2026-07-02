import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Day07_1 {
	
	private static final String URL = "jdbc:mysql://localhost:3306/jdbc_DEC";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	private static final String UPDATE_QUERY = "UPDATE  student SET dp = ?"
											+ " where id = ? ";
	

	
	private static Connection con;
	
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
			
			PreparedStatement pstmt = con.prepareStatement(UPDATE_QUERY);
			
		
			System.out.println("Enter the id : ");
			int id = scan.nextInt();
			
			
			
			pstmt.setInt(2, id);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
