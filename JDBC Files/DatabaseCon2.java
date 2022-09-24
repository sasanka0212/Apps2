import java.sql.*;

public class DatabaseCon2 
{
	public static void main(String args[]) throws Exception
	{
		// passwords to provide security
		String url = "jdbc:mysql://localhost:3306/sasa";
		String username = "root";
		String password = "2002";
		int rollno = 18;
		String sname = "Siddhartha";
		String clg = "Kalyani College";
		String query = "insert into student values(?,?,?)";
		
		// set up the connection and work
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement st = con.prepareStatement(query);
		st.setString(1,sname);
		st.setInt(2,rollno);
		st.setString(3,clg);
		int aff = st.executeUpdate();
		
		// print no of rows affected
		System.out.println(aff + " no of rows afftectd");
	}
}