import java.sql.*;

public class DatabaseCon3
{
	public static void main(String args[]) throws Exception
	{
		Class.forName("p1");
		
		//DriverManager.registerDriver(new p1());
		
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
	}
}

class p1
{
	static
	{
		System.out.println("In P1 static block...");
	}
	// Instance block
	{
		System.out.println("In p1 instance block...");
	}
}