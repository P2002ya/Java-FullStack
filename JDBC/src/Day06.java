import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

// ACID Properties
public class Day06 {

	
	private static final String URL = "jdbc:mysql://localhost:3306/jdbc_DEC";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	private static final String DEBIT_QUERY = "Update employee" 
									+" SET salary = salary - ? "
									+ "Where name = ? ";
									
	private static final String CREDIT_QUERY = "Update employee" 
									+" SET salary = salary + ? "
									+ "Where name = ? ";
	
	private static Connection con;
	
	static Scanner scan = new Scanner(System.in);
	
//	ctrl + D= dlt
//	alt+shift+ R = rename all references
//	ctrl + alt + down/up arrow = duplicate
//	alt + up/down = move
//	ctrl + 2 then leave press L = assign local var
//	ctrl + 2 then leave press F = assign Field (instance var/cls member)
//	alt + shift + M = Extract method
	public static void main(String[] args) {

		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			   con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
			   
			   con.setAutoCommit(false);
			   
			   Day05.display(con);
			   
			   transaction(); 
			   
			   Day05.display(con);
			   
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void transaction() throws SQLException {
		   System.out.println("Enter the Sender : ");
		   String sender = scan.next();
		   
		   System.out.println("Enter the Receiver : ");
		   String receiver = scan.next();
		   
		   System.out.println("Enter the Amount : ");
		   int amt = scan.nextInt();
		   
//		   PreparedStatement pstmt2 = con.prepareStatement(CREDIT_QUERY);
		   
		   int res1 = updateSender(sender,amt);
		   int res2 = updateReceiver(receiver,amt);
		   
		   System.out.println(res1);
		   System.out.println(res2);
		   
		  if( isConfirm(res1,res2))
		  {
			  con.commit();
		  }
		  else 
		  {
			  con.rollback();
		  }
	}

	private static boolean isConfirm(int res1, int res2) {
		if(res1 == 1 && res2 == 1)
			{return true;
	}
	return false;
	}

	private static int updateReceiver(String receiver, int amt) throws SQLException {
		PreparedStatement pstmt1 = con.prepareStatement(CREDIT_QUERY);
		
		pstmt1.setInt(1, amt);
		pstmt1.setString(2, receiver);
		
		int res = pstmt1.executeUpdate();
		
		return res;	
	}

	private static int updateSender(String sender, int amt) throws SQLException {
		
		PreparedStatement pstmt1 = con.prepareStatement(DEBIT_QUERY);
		
		pstmt1.setInt(1, amt);
		pstmt1.setString(2, sender);
		
		int res = pstmt1.executeUpdate();
		
		return res;
		
	}
		

}
