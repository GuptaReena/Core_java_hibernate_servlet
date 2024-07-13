package dbConn;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class DbConnection
 */
@WebServlet("/DbConnection")
public class DbConnection extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Resource(name="jdbc/student_tracker") //resource injection
	DataSource ds;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DbConnection() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get print writer
		PrintWriter out=response.getWriter();
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		String q= "SELECT * FROM student";
		
		
			try {
				conn = ds.getConnection();
				stmt = conn.createStatement();
				rs = stmt.executeQuery(q);
				
				while(rs.next()) {
					String email = rs.getString("email");
					out.println(email);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
