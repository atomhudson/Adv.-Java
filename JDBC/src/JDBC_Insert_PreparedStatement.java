
import java.sql.*;

public class JDBC_Insert_PreparedStatement {
	public static void main(String[] args) {
		try {
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","Warning@09@");
			PreparedStatement p = c.prepareStatement("Insert into emp_info(emp_id, emp_name, emp_address, emp_salary, emp_age) values (?,?,?,?,?)");
			p.setString(1, "e87701");
			p.setString(2, "Tejjjjjja Kapoor");
			p.setString(3, "Ambala");
			p.setInt(4, 350000);
			p.setInt(5, 41);
			p.executeUpdate();
			
			
			System.out.println("Success");
			c.close();
		}catch (SQLException e) {
			System.out.println(e);
		}
	}
}
