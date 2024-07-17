import java.sql.*;
public class JDBCMySql {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","Warning@09@");
			Statement st=c.createStatement();
			st.executeUpdate("insert into emp_info (eid,name,salary,age) VALUES ('e110','Kaku Singh',450000,21)");
			System.out.println("Success");
			c.close();
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
	}
}
