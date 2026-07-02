import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Day03 {

	private static final String URL = "jdbc:mysql://localhost:3306/jdbc_DEC";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	private static final String SELECT_QUERY="Select * from employee";

	public static void main(String[] args) {
	
		
		Connection con= null;
		Statement stmt = null;
		ResultSet res = null;
		
		try {
			// 1. Load the driver
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. Estd con
			
			con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
			
			// 3. create sql stmt
			
			 stmt =con.createStatement();
			
			// 4. execute the sql query
			
			 res = stmt.executeQuery(SELECT_QUERY);
			
			// 5. Process the result
					printResultSet(res);		
		} 
	
		
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				if(res!=null) {res.close();}
				if(stmt!=null) {stmt.close();}
				if(con!=null) {con.close();}
			}
			catch(SQLException e){
				
			}
			
		}
	}

		static void printResultSet(ResultSet res) throws SQLException {
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