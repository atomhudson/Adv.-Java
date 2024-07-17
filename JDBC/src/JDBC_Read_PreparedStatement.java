import java.sql.*;
public class JDBC_Read_PreparedStatement {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","Warning@09@");
			Statement st=c.createStatement();
			ResultSet rs=st.executeQuery("select * from emp_info where emp_id='e202'");
			if(rs.next()) {
				System.out.println(rs.getString("emp_name"));
				System.out.println(rs.getString("emp_id"));
				System.out.println(rs.getString("emp_address"));
				System.out.println(rs.getInt("emp_age"));
				System.out.println(rs.getInt("emp_salary"));
				System.out.println("--------------------------------------");
				//or
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(1));
				System.out.println(rs.getInt(4));
				System.out.println(rs.getString(5));
				System.out.println(rs.getInt(3));
			}else {
				System.out.println("NO data Found!");
			}
			c.close();
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
	}
}
