import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_Read {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","Warning@09@");
			Statement st = c.createStatement();
			ResultSet r = st.executeQuery("Select * from emp_info where emp_id ='e7'");
			if(r.next()) {
				System.out.println("Employee ID: "+r.getString("emp_id"));
				System.out.println("Employee Name: "+r.getString("emp_name"));
				System.out.println("Employee Adress: "+r.getString("emp_address"));
				System.out.println("Employee Salary: "+r.getInt("emp_salary"));
				System.out.println("Employee Age: "+r.getInt("emp_age"));
				
				
				System.out.println("----------------------------------------------------");
				//or
				
				
				System.out.println("Employee ID: "+r.getString(1));
				System.out.println("Employee Name: "+r.getString(2));
				System.out.println("Employee Adress: "+r.getString(3));
				System.out.println("Employee Salary: "+r.getInt(4));
				System.out.println("Employee Age: "+r.getInt(5));
			}
			else {
				System.out.println("NO Data Found");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
