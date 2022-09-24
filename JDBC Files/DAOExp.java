import java.sql.*;
import java.util.*;

public class DAOExp 
{
	public static void main(String args[]) throws Exception
	{
		StudentDAO dao = new StudentDAO();
		List<collegeStd> ls = new ArrayList<>();
		ls.add(dao.getStudentInfo(18));
		ls.add(dao.getStudentInfo(06));
		for(collegeStd c : ls)
		{
			System.out.println(c.rollNo + " " + c.sname + " " + c.college);
		}
	}
}

class StudentDAO
{
	public collegeStd getStudentInfo(int rollNo) throws Exception
	{
		collegeStd s = new collegeStd();
		s.rollNo = rollNo;
		String Query = "select sname,college from student where rollNo = " + s.rollNo;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sasa","root","2002");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(Query);
		rs.next();
		s.sname = rs.getString("sname");
		s.college = rs.getString("college");
		return s;
	}
}

class collegeStd
{
	int rollNo;
	String sname;
	String college;
}