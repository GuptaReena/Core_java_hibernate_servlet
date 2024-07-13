package emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class EmployeeDbUtil {

	private DataSource dataSource;
	
	public EmployeeDbUtil(DataSource theDataSource) {
		dataSource = theDataSource;
	}


	public List<Employee> getEmployee() throws SQLException {
		// TODO Auto-generated method stub
		
		List<Employee> employee = new ArrayList<>();
		
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try {
			
			// get a connection
			myConn = dataSource.getConnection();
			
			// string sql statement
			String sql = "select * from emp";
			
			myStmt = myConn.createStatement();
			
			//execute query
			myRs = myStmt.executeQuery(sql);
			
			//process result set
			while(myRs.next()) {
				
				//retrive data from result set
				int id = myRs.getInt("id");
				int empid = myRs.getInt("empid");
				String employeeName = myRs.getString("employeeName");
				String gender = myRs.getString("gender");
				String email = myRs.getString("email");
				long phoneNumber = myRs.getLong("phoneNumber");
				String designation = myRs.getString("designation");
				int salary = myRs.getInt("salary");
				String city = myRs.getString("city");
				
				// create new employee object
				Employee tempEmployee = new Employee(id,empid,employeeName,gender,email,phoneNumber,salary,designation,city);
				
				// add it to the list of employee
				employee.add(tempEmployee);
			}
			
			return employee;
			
			
			
		} finally {
			// close jdbc object
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

	public void addemp(Employee theEmployee) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection myConn = null;
		PreparedStatement myStmt = null;
		
		try {
			
			// get db connection
			myConn = dataSource.getConnection();
			
			// create sql query
			String sql = "insert into emp"
						+"(empid,employeeName,gender,email,phoneNumber,salary,designation,city)"
						+"values(?,?,?,?,?,?,?,?)";
			
			myStmt = myConn.prepareStatement(sql);
			
			// set the parameter values for emp
			
			myStmt.setInt(1, theEmployee.getEmpid());
			myStmt.setString(2, theEmployee.getemployeeName());
			myStmt.setString(3, theEmployee.getGender());
			myStmt.setString(4, theEmployee.getEmail());
			myStmt.setLong(5, theEmployee.getPhoneNumber());
			myStmt.setInt(6, theEmployee.getSalary());
			myStmt.setString(7, theEmployee.getDesignation());
			myStmt.setString(8, theEmployee.getCity());
			
			// execute sql query
			myStmt.execute();
		}
		finally {
			
			// clean up JDBC object
			
			close(myConn,myStmt,null);
		}
		
	}

	public Employee getEmployee(String theEmployeeId) throws Exception {
		// TODO Auto-generated method stub
		
		Employee theEmployee = null;
		
		Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet myRs = null;
		
		int empId;
		try {
			
			// convert employee id in to int
			
			empId = Integer.parseInt(theEmployeeId);
			
			// get connection to data base
			
			myConn = dataSource.getConnection();
		
			// creating sql query
			
			String sql = "select * from emp where id=?";
			
			// create prepare statement
			myStmt = myConn.prepareStatement(sql);
			
			// set parameter
			myStmt.setInt(1, empId);
			
			// execute query
			myRs = myStmt.executeQuery();
			
			if(myRs.next()) {
				int empid = myRs.getInt("empid");
				String employeeName = myRs.getString("employeeName");
				String gender = myRs.getString("gender");
				String email = myRs.getString("email");
				long phoneNumber = myRs.getLong("phoneNumber");
				int salary = myRs.getInt("salary");
				String designation = myRs.getString("designation");
				String city = myRs.getString("city");
				
				// use the employeeId during construction
				theEmployee = new Employee(empId,empid,employeeName,gender,email,phoneNumber,salary,designation,city);
			}
			else {
				throw new Exception("could not find Employee Id: " + empId);
			}
			return theEmployee;
		}
		finally {
			// clean up JDBC object
			close(myConn,myStmt,myRs);
		}
		
	}

	public void updateemp(Employee theEmployee) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection myConn = null;
		PreparedStatement myStmt = null;
		
		try {
			// get db connection
			myConn = dataSource.getConnection();
			
			// create sql query
			String sql = "update emp "+"set empid=?,employeeName=?,gender=?,email=?,phoneNumber=?,salary=?,designation=?,city=? "+"where id=?";
			
			// prepare statement
			myStmt = myConn.prepareStatement(sql);
			
			// set params
			
			myStmt.setInt(1, theEmployee.getEmpid());
			myStmt.setString(2, theEmployee.getemployeeName());
			myStmt.setString(3, theEmployee.getGender());
			myStmt.setString(4, theEmployee.getEmail());
			myStmt.setLong(5, theEmployee.getPhoneNumber());
			myStmt.setInt(6, theEmployee.getSalary());
			myStmt.setString(7, theEmployee.getDesignation());
			myStmt.setString(8, theEmployee.getCity());
			myStmt.setInt(9,theEmployee.getId());
			
			// execute sql statement
			
			myStmt.execute();
			
		} 
		finally {
			// clean up JDBC object
			close(myConn,myStmt,null);
		}
		
	}

	public void deleteemp(String theEmployeeId) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection myConn = null;
		PreparedStatement myStmt = null;
		
		try {
			
			// convert employe id in to int
			int empId = Integer.parseInt(theEmployeeId);
			
			// get connection to database
			myConn = dataSource.getConnection();
			
			// create SQL query to delete emp
			String sql = "Delete from emp where id= ?";
			
			// prepare statement
			myStmt = myConn.prepareStatement(sql);
			
			// set params
			myStmt.setInt(1, empId);
			
			// sxecute query
			myStmt.execute();
			
		} 
		finally {
			// clean up JDBC object
			close(myConn,myStmt,null);
		}
		
	}



	public void printemp(Employee theEmployee) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection myConn = null;
		PreparedStatement myStmt = null;
		
		try {
			// get db connection
			myConn = dataSource.getConnection();
			
			// create sql query
			String sql = "update emp "+"set empid=?,employeeName=?,gender=?,email=?,phoneNumber=?,salary=?,designation=?,city=? "+"where id=?";
			
			// prepare statement
			myStmt = myConn.prepareStatement(sql);
			
			// set params
			
			myStmt.setInt(1, theEmployee.getEmpid());
			myStmt.setString(2, theEmployee.getemployeeName());
			myStmt.setString(3, theEmployee.getGender());
			myStmt.setString(4, theEmployee.getEmail());
			myStmt.setLong(5, theEmployee.getPhoneNumber());
			myStmt.setInt(6, theEmployee.getSalary());
			myStmt.setString(7, theEmployee.getDesignation());
			myStmt.setString(8, theEmployee.getCity());
			myStmt.setInt(9,theEmployee.getId());
			
			// execute sql statement
			
			myStmt.execute();
			
		} 
		finally {
			// clean up JDBC object
			close(myConn,myStmt,null);
		}
		
	}
		

}
