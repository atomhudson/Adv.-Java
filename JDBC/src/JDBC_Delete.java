import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_Delete {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","Warning@09@");
			Statement st = con.createStatement();
			int r = st.executeUpdate("Delete from emp_info where emp_id = 'e1'");
			if(r==0) {
				System.out.println("Data not found");
			}else{
				System.out.println("row deleted successfully");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
