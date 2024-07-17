import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_ReadMultipleRow {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","Warning@09@");
			Statement st = c.createStatement();
			ResultSet r= st.executeQuery("Select * from emp_info");
			System.out.println(r);
			boolean flag = true;
			while (r.next()) {
				flag = false;
				System.out.println("Employee ID: "+r.getString("emp_id"));
				System.out.println("Employee Name: "+r.getString("emp_name"));
				System.out.println("Employee Adress: "+r.getString("emp_address"));
				System.out.println("Employee Salary: "+r.getInt("emp_salary"));
				System.out.println("Employee Age: "+r.getInt("emp_age"));
				System.out.println("----------------------------------------------------");
			}
			if(flag) {
				System.out.println("NO Data Found");
			}
			c.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
