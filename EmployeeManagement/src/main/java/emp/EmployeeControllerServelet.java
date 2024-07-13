package emp;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class EmployeeControllerServelet
 */
@WebServlet("/EmployeeControllerServelet")
public class EmployeeControllerServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private EmployeeDbUtil employeeDbUtil;
	
	@Resource(name="jdbc/employee_management")
	private DataSource dataSource;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try {
			// read the "command" parameter 
			String theCommand = request.getParameter("command");
			
			if(theCommand == null) {
				theCommand = "LIST";
			}
			
			switch(theCommand) {
			
			case "LIST" :
				listemp(request,response);
			break;
			
			case "ADD" :
				listadd(request,response);
			break;	
			
			case "LOAD" :
				loademp(request,response);
			break;	
			
			case "UPDATE" :
				updateemp(request,response);
			break;	
			
			case "DELETE" :
				deleteemp(request,response);
			break;	
			
			case "LOGIN" :
				loginemp(request,response);
			 break;
			 
			case "PRINT" :
				printemp(request,response);
			break;	 
			
			case "LPRINT" :
				lprint(request,response);
			break;	
			}
		}catch(Exception e) {
			throw new ServletException(e);
		}
	}

	private void lprint(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		// read emp id from form data
				String theEmployeeId = request.getParameter("empId");
				
				// get emp from database db util
				Employee theEmployee = employeeDbUtil.getEmployee(theEmployeeId);
				
				//place employe in request attribute
				request.setAttribute("THE_EMPLOYEE", theEmployee);
			
				//send to jsp:update-emp-form.jsp
				RequestDispatcher dispatcher = request.getRequestDispatcher("/print-emp-form.jsp");
				dispatcher.forward(request, response);
		
	}


	private void printemp(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
		// TODO Auto-generated method stub
		
		// read employee info from form data
				int id = Integer.parseInt(request.getParameter("empId"));
				String employeeName = request.getParameter("employeeName");
				int empid = Integer.parseInt(request.getParameter("empid"));
				String gender = request.getParameter("gender");
				String email = request.getParameter("email");
				long phoneNumber = Long.parseLong(request.getParameter("phoneNumber"));
				int salary = Integer.parseInt(request.getParameter("salary"));
				String designation = request.getParameter("designation");
				String city = request.getParameter("city");
				
				// create a new employee object
				Employee theEmployee = new Employee(id, empid,employeeName,gender,email,phoneNumber,salary,designation,city);
				
				// perform update on database
				employeeDbUtil.printemp(theEmployee);
				
				// send them back to the "list employee" page
				//listemp(request,response);
		
		
	}


	private void deleteemp(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
		// TODO Auto-generated method stub
		
		// read employee id from employee data
		String theEmployeeId = request.getParameter("empId");
		
		// delete student from database
		employeeDbUtil.deleteemp(theEmployeeId);
		
		// send them back to the "list employee" jsp
		listemp(request,response);
	}


	private void updateemp(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
		// TODO Auto-generated method stub
		
		// read employee info from form data
		int id = Integer.parseInt(request.getParameter("empId"));
		String employeeName = request.getParameter("employeeName");
		int empid = Integer.parseInt(request.getParameter("empid"));
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		long phoneNumber = Long.parseLong(request.getParameter("phoneNumber"));
		int salary = Integer.parseInt(request.getParameter("salary"));
		String designation = request.getParameter("designation");
		String city = request.getParameter("city");
		
		// create a new employee object
		Employee theEmployee = new Employee(id, empid,employeeName,gender,email,phoneNumber,salary,designation,city);
		
		// perform update on database
		employeeDbUtil.updateemp(theEmployee);
		
		// send them back to the "list employee" page
		listemp(request,response);
	}


	private void loademp(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		// read emp id from form data
		String theEmployeeId = request.getParameter("empId");
		
		// get emp from database db util
		Employee theEmployee = employeeDbUtil.getEmployee(theEmployeeId);
		
		//place employe in request attribute
		request.setAttribute("THE_EMPLOYEE", theEmployee);
	
		//send to jsp:update-emp-form.jsp
		RequestDispatcher dispatcher = request.getRequestDispatcher("/update-emp-form.jsp");
		dispatcher.forward(request, response);
	}


	private void listadd(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
		// TODO Auto-generated method stub
		
		// read data
		int empid = Integer.parseInt(request.getParameter("empid"));
		String employeeName = request.getParameter("employeeName");
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		long phoneNumber = Long.parseLong(request.getParameter("phoneNumber"));
		int salary = Integer.parseInt(request.getParameter("salary"));
		String designation = request.getParameter("designation");
		String city = request.getParameter("city");
		
		//create new employee object
		
		Employee theEmployee = new Employee(empid,employeeName,gender, email, phoneNumber, salary,designation,city);
		
		// send data to database
		employeeDbUtil.addemp(theEmployee);
		
		// add back to the main page
		listemp(request,response);
	}
	

	private void listemp(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
		// TODO Auto-generated method stub
		
		//get emp from dbutil
		List<Employee> employee = employeeDbUtil.getEmployee();
		
		// add emp to the request
		request.setAttribute("EMPLOYEE_LIST", employee);
		
		//send jsp page
		RequestDispatcher dispatcher = request.getRequestDispatcher("/List-emp.jsp");
		dispatcher.forward(request, response);
	}


	private void loginemp(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		// TODO Auto-generated method stub
		
		// read data
		
		String username = request.getParameter("username");
		String pass = request.getParameter("pass");
		
		boolean auth = employeeDbUtil.loginemp(username,pass);
		
		if(auth) {
			
//			show login successfull
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
	
	
	//init is constructor for servlet 
		//execute automatically
		

}
