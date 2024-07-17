import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_Update {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","Warning@09@");
			Statement st=c.createStatement();
			int r=st.executeUpdate("update emp_info set emp_age=25, emp_salary=emp_salary+10000 where emp_id='e1'");
			if(r==0) {
				System.out.println("Data not found");
			}else {
				System.out.println("Success");
			}
			c.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
