package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reena")
public class Demo extends HttpServlet {

		protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
			
			res.setContentType("text/html");
			
			PrintWriter out = res.getWriter();
			
			out.println("<html><body>");
			
			out.println("<h2>Student Confirmation</h2>");
			out.println("Hi This is " + req.getParameter("firstname")+" "+
						req.getParameter("lastname"));
			out.println("</body></html>");
			
		}
		
		protected void doPost(HttpServletRequest req,HttpServletResponse res) {
			
		}
}
