package JdbcDemo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DemoJdbc {
	final public static void main(String[] args) {
		Connection conn = null;
		// set sslmode here.
		// with ssl certificate and path.
		String url = "jdbc:postgresql://localhost:5432/cms";

		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection(url, "cms", "cms");
			System.out.println("Database connected");

			Statement stmt = conn.createStatement();
			//ResultSet rs = stmt.executeQuery("SELECT * FROM mytable WHERE columnfoo = 500");
//			while (rs.next()) {
//				System.out.println(rs.getString(1));
//			}
//
//			//rs.close();
//			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Test failed");
		} finally {
			// release resource ....
		}
	}
}