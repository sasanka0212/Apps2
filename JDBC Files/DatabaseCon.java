import java.sql.*;
/*
 * Java Database connectivity
 * 1. import required package
 * 2. load and register the Driver
 * 3. create connection
 * 4. create statement
 * 5. execute query
 * 6. process result
 * 7. end the connection(close) 
 */

public class DatabaseCon
{
	public static void main(String args[]) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/sasa";
		String userName = "root";
		String password = "2002";
		String qrery = "select * from student where rollNo = 17";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, userName, password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(qrery);
		while(rs.next())
			System.out.println("name : " + rs.getString("sname") + " rollNo : " + rs.getInt("rollNo") + " college : " + rs.getString("college"));
		st.close();
		rs.close();
	}
}