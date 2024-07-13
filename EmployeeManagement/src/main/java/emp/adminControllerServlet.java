package emp;

import java.io.IOException;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class adminControllerServlet
 */
@WebServlet("/adminControllerServlet")
public class adminControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private EmployeeDbUtil employeeDbUtil;
	
	@Resource(name="jdbc/employee_management")
	private DataSource dataSource;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
		// read the "command" parameter 
		String theCommand = request.getParameter("command");
		
		switch(theCommand) {
		
		case "LOGIN" :
			loginemp(request,response);
		 break;
		
		}
	}catch(Exception e) {
		throw new ServletException(e);
	}
	}

	private void loginemp(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
		// TODO Auto-generated method stub
		
		// read data
		
				String username = request.getParameter("username");
				String pass = request.getParameter("pass");
				
				boolean auth = employeeDbUtil.loginemp(username,pass);
				
				if(auth) {
					
//					show login successfull
					RequestDispatcher dispatcher = 
							request.getRequestDispatcher("/admin.jsp");
					dispatcher.forward(request, response);
					
					//listemp(request,response);
				}
				else {
					RequestDispatcher dispatcher = 
							request.getRequestDispatcher("/error.jsp");
					dispatcher.forward(request, response);
				}
		
	}
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		employeeDbUtil =new EmployeeDbUtil(dataSource);
	}
	

}
