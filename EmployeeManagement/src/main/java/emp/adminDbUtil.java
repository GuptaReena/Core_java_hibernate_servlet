package emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

public class adminDbUtil {
	
private DataSource dataSource;
	
	public adminDbUtil(DataSource theDataSource) {
		dataSource = theDataSource;
	}
	
	public boolean loginemp(String username, String pass) throws SQLException {
		// TODO Auto-generated method stub
		String query = "select * from emp1 where username=? and pass=?";
		
		Connection conn = dataSource.getConnection();
		
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setString(1, username);
		ps.setString(2, pass);
		
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
			return true;
		}
		else return false;
	}
}


