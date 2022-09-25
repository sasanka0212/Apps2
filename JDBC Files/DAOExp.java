import java.sql.*;
import java.util.*;

// Database example with student type data
public class DAOExp 
{
	public static void main(String args[]) throws Exception
	{
		StudentDAO dao = new StudentDAO();
		List<collegeStd> ls = new ArrayList<>();	// collegeStd type List to get into an array
		dao.Connect();
		ls.add(dao.getStudentInfo(18));
		ls.add(dao.getStudentInfo(06));
		for(collegeStd c : ls)
		{
			System.out.println(c.rollNo + " " + c.sname + " " + c.college);
		}
		dao.Connect();
		collegeStd s1 = new collegeStd();
		s1.sname = "Aritra";
		s1.rollNo = 5;
		s1.college = "NIT Sodepur";
		dao.addStudentInfo(s1);		// add student data
	}
}
// StudentDAO class declaration
class StudentDAO
{
	Connection con;
	Statement st;
	PreparedStatement pst;
	public void Connect() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sasa","root","2002");
	}
	public collegeStd getStudentInfo(int rollNo) throws Exception
	{
		collegeStd s = new collegeStd();
		s.rollNo = rollNo;
		String Query = "select sname,college from student where rollNo = " + s.rollNo;
		st = con.createStatement();
		ResultSet rs = st.executeQuery(Query);
		rs.next();
		s.sname = rs.getString("sname");
		s.college = rs.getString("college");
		st.close();	 
		return s;
	}
	public void addStudentInfo(collegeStd s) throws Exception
	{
		String Query = "insert into student values(?,?,?)";
		pst = con.prepareStatement(Query);
		pst.setString(1, s.sname);
		pst.setInt(2, s.rollNo);
		pst.setString(3, s.college);
		int rows = pst.executeUpdate();
		System.out.println(rows + "'s inserted.");
		pst.close();
	}
}
// collegeStd class declaration
class collegeStd
{
	int rollNo;
	String sname;
	String college;
}