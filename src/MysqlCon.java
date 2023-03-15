import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/university","root","root");   
			System.out.println("DB Connected");
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	
	}

}
