package emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

public class ProjectDbUtil {
	
	private DataSource dataSource;
	
	public ProjectDbUtil(DataSource theDataSource) {
		dataSource = theDataSource;
	}

	public List<Project> getProject() throws SQLException {
		// TODO Auto-generated method stub
		
		List<Project> project = new ArrayList<>();
		
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		
		try {
			// get Connection
			myConn =dataSource.getConnection();
			
			// String sql statement
			String sql ="select * from p_data";
			
			myStmt = myConn.createStatement();
			
			// execute query
			myRs = myStmt.executeQuery(sql);
			
			//process result set
			while(myRs.next()) {
				
				//retrive data from result set
				
				int id = myRs.getInt("Id");
				String projectName = myRs.getString("projectName");
				String clientName = myRs.getString("clientName");
				String clientEmail = myRs.getString("clientEmail");
				int budget = myRs.getInt("budget");
				String shortProjectInfo = myRs.getString("shortProjectInfo");
				long clientPhoneNo = myRs.getLong("clientPhoneNo");
				String status = myRs.getString("status");
				
				Project tempProject = new Project(id,projectName,clientName,clientEmail,budget,shortProjectInfo,clientPhoneNo,status);
				
				// add it to the list project
				project.add(tempProject);
				
			}
			
			return project;
			
		} 
		finally {
			//close jdbc object
			close(myConn,myStmt,myRs);
		}
	}
	
	private void close(Connection myConn, Statement myStmt, ResultSet myRs) {
		// TODO Auto-generated method stub
		try {
			if(myRs != null) {
				myRs.close();
			}
			if(myRs != null) {
				myStmt.close();
			}
			if(myRs != null) {
				myConn.close();
			}
		}catch(Exception exc) {
			exc.printStackTrace();
		}
	}

	public void addproject(Project theProject) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection myConn = null;
		PreparedStatement myStmt = null;
		
		try {
			
			// get db connection
			myConn = dataSource.getConnection();
			
			// create sql query
			String sql = "insert into p_data"
						+"(projectName,clientName,clientEmail,budget,shortProjectInfo,clientPhoneNo,status)"
						+"values(?,?,?,?,?,?,?)";
			
			myStmt = myConn.prepareStatement(sql);
			
			// set the parameter value for project
			
			myStmt.setString(1, theProject.getProjectName());
			myStmt.setString(2,theProject.getClientName());
			myStmt.setString(3, theProject.getClientEmail());
			myStmt.setInt(4, theProject.getBudget());
			myStmt.setString(5, theProject.getShortProjectInfo());
			myStmt.setLong(6, theProject.getClientPhoneNo());
			myStmt.setString(7, theProject.getStatus());
			
			
			myStmt.execute();
			
		} 
		finally {
			
			// clean up JDBC object
			close(myConn,myStmt,null);
		}
		
	}

	public Project getProject(String theProjectId) throws Exception {
		// TODO Auto-generated method stub
		Project theProject = null;
		
		Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet myRs = null;
		
		int Id;
		try {
			
			// convert employee id in to int

			Id = Integer.parseInt(theProjectId);
			
			// get connection to data base
			
			myConn = dataSource.getConnection();
		
			// creating sql query
			
			String sql = "select * from p_data where id=?";
			
			// create prepare statement
			myStmt = myConn.prepareStatement(sql);
			
			// set parameter
			myStmt.setInt(1, Id);
			
			// execute query
			myRs = myStmt.executeQuery();
			
			if(myRs.next()) {
				String projectName = myRs.getString("projectName");
				String clientName = myRs.getString("clientName");
				String clientEmail = myRs.getString("clientEmail");
				int budget = myRs.getInt("budget");
				String shortProjectInfo = myRs.getString("shortProjectInfo");
				long clientPhoneNo = myRs.getLong("clientPhoneNo");
				String status = myRs.getString("status");
				
				// use the projectId during construction
				theProject = new Project(Id,projectName,clientName,clientEmail,budget,shortProjectInfo,clientPhoneNo,status);
			}
			else {
				throw new Exception("could not find Employee Id: " + Id);
			}
			return theProject;
		}
		finally {
			// clean up JDBC object
			close(myConn,myStmt,myRs);
		}
	}

	public void updateproject(Project theProject) throws SQLException {
		// TODO Auto-generated method stub
		Connection myConn = null;
		PreparedStatement myStmt = null;
		
		try {
			// get db connection
			myConn = dataSource.getConnection();
			
			// create sql query
			String sql = "update p_data "+"set projectName=?,clientName=?,clientEmail=?,budget=?,shortProjectInfo=?,clientPhoneNo=?,status=? "+"where id=?";
					
			// prepare statement
			myStmt = myConn.prepareStatement(sql);
			
			// set the parameter value for project
			
			myStmt.setString(1, theProject.getProjectName());
			myStmt.setString(2,theProject.getClientName());
			myStmt.setString(3, theProject.getClientEmail());
			myStmt.setInt(4, theProject.getBudget());
			myStmt.setString(5, theProject.getShortProjectInfo());
			myStmt.setLong(6, theProject.getClientPhoneNo());
			myStmt.setString(7, theProject.getStatus());
			myStmt.setInt(8, theProject.getId());
			
			// execute sql statement
			myStmt.execute();
			
		} 
		finally {
			// clean up JDBC object
			close(myConn,myStmt,null);
		}
	}

	public void deleteproject(String theProjectId) throws SQLException {
		// TODO Auto-generated method stub
		Connection myConn = null;
		PreparedStatement myStmt = null;
		
		try {
			
			// convert project id in to int
			int Id = Integer.parseInt(theProjectId);
			
			// get connection to database
			myConn = dataSource.getConnection();
			
			// create SQL query to delete emp
			String sql = "Delete from p_data where id= ?";
			
			// prepare statement
			myStmt = myConn.prepareStatement(sql);
			
			// set params
			myStmt.setInt(1, Id);
			
			// sxecute query
			myStmt.execute();
			
		} 
		finally {
			// clean up JDBC object
			close(myConn,myStmt,null);
		}
	}

	public void printproject(Project theProject) throws SQLException {
		// TODO Auto-generated method stub
		Connection myConn = null;
		PreparedStatement myStmt = null;
		
		try {
			// get db connection
			myConn = dataSource.getConnection();
			
			// create sql query
			String sql = "update p_data" +"set projectName=?,clientName=?,clientEmail=?,budget=?,shortProjectInfo=?,clientPhoneNo=?,status=?" + "where id=?";
			
			// prepare statement
			myStmt = myConn.prepareStatement(sql);
			
			// set the parameter value for project
			
			myStmt.setString(1, theProject.getProjectName());
			myStmt.setString(2,theProject.getClientName());
			myStmt.setString(3, theProject.getClientEmail());
			myStmt.setInt(4, theProject.getBudget());
			myStmt.setString(5, theProject.getShortProjectInfo());
			myStmt.setLong(6, theProject.getClientPhoneNo());
			myStmt.setString(7, theProject.getStatus());
			myStmt.setInt(8, theProject.getId());
			
			// execute sql statement
			
			myStmt.execute();
			
		} 
		finally {
			// clean up JDBC object
			close(myConn,myStmt,null);
		}
	}
}	

