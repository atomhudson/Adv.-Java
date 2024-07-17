import java.sql.*;
public class JDBC_Delete_PreparedStatement {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","Warning@09@");
//			PreparedStatement p=c.prepareStatement("delete from emp_info where eid=?");
//			p.setString(1, "e105");
			
			PreparedStatement p=c.prepareStatement("delete from emp_info where emp_age>? and emp_salary<?");
			p.setInt(1, 50);
			p.setInt(2, 50000);
			int r=p.executeUpdate();
			
			
			if(r==0) {
				System.out.println("Data not found!");
			}else {
				System.out.println("Success");
			}
			c.close();
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
	}
}
