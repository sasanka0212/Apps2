import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/Add"})
public class Add extends HttpServlet
{
	public void doPost(HttpServletRequest req, HttpServletResponse res)
	{
		perform(req,res);
	}
	public void doGet(HttpServletRequest req, HttpServletResponse res)
	{
		perform(req, res);
	}
	public void perform(HttpServletRequest req, HttpServletResponse res)
	{
		int a = Integer.parseInt(req.getParameter("t1"));
		int b = Integer.parseInt(req.getParameter("t2"));
		
		int c = a + b;
		try {
			PrintWriter out = res.getWriter();
			out.println(c);
		}
		catch(Exception e) {};
	}
}