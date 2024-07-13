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
 * Servlet implementation class ProjectControllerServlet
 */
@WebServlet("/ProjectControllerServlet")
public class ProjectControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    

private ProjectDbUtil projectDbUtil;
	
	@Resource(name="jdbc/employee_management")
	private DataSource dataSource;
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		try {
//			//read the command parmeter
			String theCommand =request.getParameter("command");
			
			if(theCommand == null) {
				theCommand = "LIST";
			}
			
			switch(theCommand) {
			
			case "LIST" :
				listproject(request,response);
			break;
			
			case "ADD" :
				addproject(request,response);
			break;	
			
			case "LOAD" :
				loadproject(request,response);
			break;	
			
			case "UPDATE" :
				updateproject(request,response);
			break;	
			
			case "DELETE" :
				deleteproject(request,response);
			break;	
			
			case "PRINT" :
				printproject(request,response);
			break;
			
			case "LPRINT" :
				lprint(request,response);
			}
		}catch(Exception e) {
			throw new ServletException(e);
		}
		
	}
	
	

	private void lprint(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
//		// read project details from form
		String theProjectId = request.getParameter("Id");
		
		// get project form data to db util
		Project theProject = projectDbUtil.getProject(theProjectId);
				
		// place project details in request attribute
		request.setAttribute("THE_PROJECT", theProject);
				
		// send to jsp : update-project.jsp
		RequestDispatcher dispatcher = request.getRequestDispatcher("/print-project.jsp");
		dispatcher.forward(request, response);
	}



	private void printproject(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		// TODO Auto-generated method stub
		
		// read data
		String projectName = request.getParameter("projectName");
		String clientName = request.getParameter("clientName");
		String clientEmail = request.getParameter("clientEmail");
		int budget = Integer.parseInt(request.getParameter("budget"));
		String shortProjectInfo = request.getParameter("shortProjectInfo");
		long clientPhoneNo = Long.parseLong(request.getParameter("clientPhoneNo"));
		String status = request.getParameter("status");
				
		// create new project object
				
		Project theProject = new Project(projectName,clientName,clientEmail,budget,shortProjectInfo,clientPhoneNo,status);
				
		// perform print on the database
		projectDbUtil.printproject(theProject);
		
	}

	private void deleteproject(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
	// TODO Auto-generated method stub
		
		// read project id from p_data 
		String  theProjectId = request.getParameter("Id");
		
		// delete project from data
		projectDbUtil.deleteproject(theProjectId);
		
		// send them back to the list project
		listproject(request,response);
	}

	private void updateproject(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
		// TODO Auto-generated method stub
		
		// read project info from form
		int id = Integer.parseInt(request.getParameter("Id"));
		String projectName = request.getParameter("projectName");
		String clientName = request.getParameter("clientName");
		String clientEmail = request.getParameter("clientEmail");
		int budget = Integer.parseInt(request.getParameter("budget"));
		String shortProjectInfo = request.getParameter("shortProjectInfo");
		long clientPhoneNo = Long.parseLong(request.getParameter("clientPhoneNo"));
		String status = request.getParameter("status");
		
		// create new project object
		
		Project theProject = new Project(id,projectName,clientName,clientEmail,budget,shortProjectInfo,clientPhoneNo,status);
				
		// send data to database
		projectDbUtil.updateproject(theProject);
				
		// add back to the main page
		listproject(request,response);
		
	}

	private void loadproject(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		// read project details from form
		String theProjectId = request.getParameter("Id");
		
		// get project form data to db util
		Project theProject = projectDbUtil.getProject(theProjectId);
		
		// place project details in request attribute
		request.setAttribute("THE_PROJECT", theProject);
		
		// send to jsp : update-project.jsp
		RequestDispatcher dispatcher = request.getRequestDispatcher("/update-project.jsp");
		dispatcher.forward(request, response);
	}

	private void addproject(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
		// TODO Auto-generated method stub
		
		// read data
		String projectName = request.getParameter("projectName");
		String clientName = request.getParameter("clientName");
		String clientEmail = request.getParameter("clientEmail");
		int budget = Integer.parseInt(request.getParameter("budget"));
		String shortProjectInfo = request.getParameter("shortProjectInfo");
		long clientPhoneNo = Long.parseLong(request.getParameter("clientPhoneNo"));
		String status = request.getParameter("status");
		
		// create new project object
		
		Project theProject = new Project(projectName,clientName,clientEmail,budget,shortProjectInfo,clientPhoneNo,status);
		
		// send data to database
		projectDbUtil.addproject(theProject);
		
		// add back to the main page
		listproject(request,response);
	}

	private void listproject(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		// TODO Auto-generated method stub
	
		//get the project list from db util
		List<Project> project = projectDbUtil.getProject();
	
		// add emp to the request
		request.setAttribute("PROJECT_LIST", project);
				
		//send jsp page
		RequestDispatcher dispatcher = request.getRequestDispatcher("/list-project.jsp");
		dispatcher.forward(request, response);
	}

	
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		projectDbUtil =new ProjectDbUtil(dataSource);
	}
	

	}

