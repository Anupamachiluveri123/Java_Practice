package JDBCcrudOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class insertValues {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_Anu","root","Anu@sql123");
			Statement st = con.createStatement();
			int updatecount = st.executeUpdate("insert into users values(10,'madhu','hyd')");
			int updatecount1 = st.executeUpdate("insert into users values(11,'suma','knr')");
			System.out.println("no.of rows inserted"+updatecount);
			System.out.println("no.of rows inserted"+updatecount1);
			
			con.close();	
		}
		catch(Exception e)
		{
			System.out.println( e);
		}

	}

}