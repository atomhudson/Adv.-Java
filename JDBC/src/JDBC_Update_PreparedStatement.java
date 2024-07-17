import java.sql.*;

public class JDBC_Update_PreparedStatement {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","Warning@09@");
			PreparedStatement p=c.prepareStatement("update emp_info set emp_age=?, emp_salary=emp_salary+? where emp_id=?");
			p.setInt(1, 50);
			p.setInt(2, 10000);
			p.setString(3, "e104");
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
