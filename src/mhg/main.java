package mhg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class main {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/admins", "root", "");
			// here sonoo is database name, root is username and password
			Statement stmt = con.createStatement();
			ResultSet rs = stmt
					.executeQuery("SELECT * FROM  admins  WHERE username = mohammad ");
			boolean userfound = false;
			while (rs.next()) {
				userfound = true;
				System.out.println(rs.getString(2));
			}

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
