import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/CountVistit"})
public class CountVistit extends HttpServlet
{
	int i;
	public void init()
	{
		i = 1;
	}
	public void service(HttpServletRequest re, HttpServletResponse rn) throws IOException
	{
		PrintWriter out = rn.getWriter();
		out.println(i);
		i+=1;
	}
}