import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_Insert {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","Warning@09@");
			Statement st = con.createStatement();
			st.executeUpdate("Insert into emp_info(emp_id, emp_name, emp_address, emp_salary, emp_age) values ('e4','Harshita','Raipur',243524363,19)");
			st.executeUpdate("Insert into emp_info(emp_id, emp_name, emp_address, emp_salary, emp_age) values ('e5','Khan BABA','Kolkata',567880,35)");
			st.executeUpdate("Insert into emp_info(emp_id, emp_name, emp_address, emp_salary, emp_age) values ('e6','Raju Don','Janupur',456790,30)");
			st.executeUpdate("Insert into emp_info(emp_id, emp_name, emp_address, emp_salary, emp_age) values ('e7','KaKa DaDa','Mumbai',2034350,24)");
			st.executeUpdate("Insert into emp_info(emp_id, emp_name, emp_address, emp_salary, emp_age) values ('e8','Ryaaaa','Moradabad',245555,15)");
			System.out.println("Success");
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
