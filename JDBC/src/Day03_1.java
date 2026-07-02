
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Day03_1 {

	private static final String URL = "jdbc:mysql://localhost:3306/jdbc_DEC";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	private static final String SELECT_QUERY="Select * from employee";
	
	public static void main(String[] args) {
	
		// try with resources
		try(
			Connection con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
			
			Statement stmt =con.createStatement();
			
			ResultSet res = stmt.executeQuery(SELECT_QUERY);
			){
			
			// 5. Process the result
					printResultSet(res);		
		} 
	
		catch (SQLException e) {
			e.printStackTrace();
		}
			
	}
	

		private static void printResultSet(ResultSet res) throws SQLException {
			while(res.next())
				{
					System.out.printf("%d %-8s %-16s %-10s %-6d\n", res.getInt("id"),
																		res.getString("name"),
																		res.getString("email"),
																		res.getString("dept"),	
																		res.getInt("salary"));
					}
				}
	}
