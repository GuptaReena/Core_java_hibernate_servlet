package mvc;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentController
 */
@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//get the data from model
		List<Student> students = StudentDataUtil.getStudent();
		
		//set Attribute
		request.setAttribute("stud_list", students);
		
		// call jsp
		RequestDispatcher dispatcher = request.getRequestDispatcher("view-student.jsp");
		
		//forward object to JSP
		dispatcher.forward(request, response);
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	

}
