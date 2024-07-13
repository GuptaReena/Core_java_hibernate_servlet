package rst;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class StudentDbUtil {
	
	private DataSource dataSource;

	public StudentDbUtil(DataSource theDataSource) {
		dataSource = theDataSource;
		
	}

	public List<Student> getStudents() throws Exception{
		List<Student> students = new ArrayList<>();
		
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs= null;
		
		try {
			//get a connection
			myConn = dataSource.getConnection();
			
			//create sql Statment
			String sql="Select * from student";
			
			myStmt = myConn.createStatement();
			
			//execute query
			myRs = myStmt.executeQuery(sql);
			
			//process result set
			while(myRs.next()) {
				//retrieve data from result set row
				int id= myRs.getInt("id");
				String firstName = myRs.getString("firstName");
				String lastName = myRs.getString("lastName");
				String email = myRs.getString("email");
				
				
				//create new student object
				Student tempStudent = new Student(id,firstName,lastName,email);
				
				//add it to the list of students
				students.add(tempStudent);
				
			}
			
			return students;
			
		}finally {
			//close jdbc objects
			close(myConn,myStmt,myRs);
		}
	}

	private void close(Connection myConn, Statement myStmt, ResultSet myRs) {
		try {
			if(myRs != null) {
				myRs.close();
			}
			
			if(myRs!=null) {
				myStmt.close();
			}
			
			if(myRs!=null) {
				myConn.close(); //doesnt really close it...just puts back in connection pool
			}
		}catch(Exception exc) {
			exc.printStackTrace();
		}
		
	}

	public void addStudent(Student theStudent) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection myConn = null;
		PreparedStatement myStmt = null;
		
		try {
			//get db connection
			
			myConn = dataSource.getConnection();
			
			// create sql for insert
			
			String sql = "insert into student"
						+"(firstName, lastName , email)"
						+"values (?,?,?)";
			
			myStmt = myConn.prepareStatement(sql);
			
			//set the param values for the student
			
			myStmt.setString(1, theStudent.getFirstName());
			myStmt.setString(2, theStudent.getLastName());
			myStmt.setString(3, theStudent.getEmail());
			
			// execute sql insert
				myStmt.execute();
			
		}
		finally {
			//clean up JDBC object
			
			close(myConn , myStmt , null);
		}
		
	}

	public Student getStudent(String theStudentId) throws Exception {
		// TODO Auto-generated method stub
		
		Student theStudent = null;
		
		Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet myRs = null;
		int studentId;
		
		try {
			//convert student id to int
			
			studentId = Integer.parseInt(theStudentId);
			
			// get connection to database
			myConn = dataSource.getConnection();
			
			// create sql to get selected student
			String sql = "select * from student where id=?";
			
			// create prepared statement
			myStmt = myConn.prepareStatement(sql);
			
			//set params
			myStmt.setInt(1, studentId);
			
			//execute statement
			myRs = myStmt.executeQuery();
			
			// retrieve data from result set row
			
			if(myRs.next()) {
				String firstName = myRs.getString("firstName");
				String lastName = myRs.getString("lastName");
				String email = myRs.getString("email");
				
				
				// use the studentId during construction
				theStudent = new Student(studentId , firstName, lastName , email);
			}
			else {
				throw new Exception("Could not find student id: "+ studentId);
			}
			
			return theStudent;
		}
		finally {
			// clean up JDBC object
			close(myConn, myStmt, myRs); 
		}
		
		
	}

	public void updateStudent(Student theStudent) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection myConn = null;
		PreparedStatement myStmt = null;
	
		try {
			// get db connection
			myConn = dataSource.getConnection();
			
			// create SQL update statement
			
			String sql = "update student "+"set firstName=?,lastName=?,email=? "+" where id=?";
			
			//prepaare statement
				myStmt = myConn.prepareStatement(sql);
			
				// set params
				
				myStmt.setString(1, theStudent.getFirstName());
				myStmt.setString(2, theStudent.getLastName());
				myStmt.setString(3, theStudent.getEmail());
				myStmt.setInt(4, theStudent.getId());
				
				// execute SQL statement
				
				myStmt.execute();
				
				
		}
		finally {
			
			// clean up JDBC object
			close(myConn , myStmt , null);
		}
	}

	public void deleteStudent(String theStudentId) throws SQLException {
		// TODO Auto-generated method stub
	
		Connection myConn = null;
		PreparedStatement myStmt = null;
		
		try {
			// Convert student id to int
			int studentId = Integer.parseInt(theStudentId);
			
			//get connection to database
			myConn = dataSource.getConnection();
			
			//create SQL to delete student
			
			String sql = "DELETE From student where id=?";
			
			//prepare statement
			myStmt = myConn.prepareStatement(sql);
			
			// set params
			myStmt.setInt(1, studentId);
			
			//execute sql statement
			myStmt.execute();
		}
		finally {
			// clean up JDBC code
			close(myConn , myStmt , null);
		}
	}

	public boolean loginStudent(String email, String pass) throws SQLException {
		
		// SQL query
		String query = "SELECT * from login where email=? and pass=?";
		
		// get connection
		Connection conn = dataSource.getConnection();
		
		// prepare connection
		 PreparedStatement ps = conn.prepareStatement(query);
		 ps.setString(1, email);
		 ps.setString(2, pass);
		
		 ResultSet rs = ps.executeQuery();
		 
		 if(rs.next()) {
			 return true;
		 }
		 else return false;
	}

	public void signup(Student theStudent) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection myConn = null;
		PreparedStatement myStmt = null;
		
		try {
			//get db connection
			
			myConn = dataSource.getConnection();
			
			// create sql for insert
			
			String sql = "insert into login "
						+"(firstName, lastName,email,pass) "
						+"values(?,?,?,?)";
			
			myStmt = myConn.prepareStatement(sql);
			
			//set the param values for the student
			
			myStmt.setString(1, theStudent.getFirstName());
			myStmt.setString(2, theStudent.getLastName());
			myStmt.setString(3, theStudent.getEmail());
			myStmt.setString(4, theStudent.getPass());
			
			// execute sql insert
				myStmt.execute();
			
		}
		finally {
			//clean up JDBC object
			
			close(myConn , myStmt , null);
		}
		
		
	}
	
}
