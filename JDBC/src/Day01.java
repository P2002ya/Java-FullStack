import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Day01 {

	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost : 3306/jdbc_DEC";
		String username = "root";
		String password = "root";
		String SELECT_QUERY = "select * from employee";
		try {
			// 1. Load the driver
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is Loaded");
			
			//2. ESTD connection to database
			
			Connection con=DriverManager.getConnection(url, username, password);
			System.out.println("Conn is Estd");
			
			//3. Create SQL stmt
			
			Statement stmt=con.createStatement();
			System.out.println("Stmt is created");
			
			// 4. Execute SQL stmt
			
			ResultSet result = stmt.executeQuery(SELECT_QUERY);
//			System.out.println(result);
			
			// 5. Process the result
			printResultSet(result);
			
			}

		
		
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

	public static void printResultSet(ResultSet result) throws SQLException
	{
		System.out.println("----------------------------------------------------");
		while(result.next())
		{
			int id = result.getInt("id");
			String name = result.getString("name");
			String email = result.getString("email");
			String dept = result.getString("dept");
			int sal = result.getInt("salary");
			
			//System.out.println(id + " "+name+" " + email+" " + dept+" " + sal);
			System.out.printf("| %d | %-7s |%-16s| %-10s| %-6d | \n",id ,name,email,dept,sal);
			System.out.println("----------------------------------------------------");

		}
	}
}
