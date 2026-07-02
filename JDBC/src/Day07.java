import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Day07 {
	
	private static final String URL = "jdbc:mysql://localhost:3306/jdbc_DEC";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	private static final String INSERT_QUERY = "INSERT into student (id,name,email,branch,cgpa)"
												+ "values(?,?,?,?,?)";
	private static Connection con;
	
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
			
			PreparedStatement pstmt = con.prepareStatement(INSERT_QUERY);
			
			
			System.out.println("Enter the Id");
			int id = scan.nextInt();
			System.out.println("Enter the Name");
			String name = scan.next();
			
			System.out.println("Enter the Email");
			String email = scan.next();

			System.out.println("Enter the Branch");
			String branch = scan.next();

			System.out.println("Enter the CGPA");
			float cgpa = scan.nextFloat();
			
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, email);
			pstmt.setString(4, branch);
			pstmt.setFloat(5, cgpa);
			
			int i = pstmt.executeUpdate();
			System.out.println(i);

			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
