package JDBCcrudOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args)  {
		String DriverName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/db_Anu";
		String userName ="root";
		String Passward = "Anu@sql123";
		String sql_Query = "create table users(userId int,userName varchar(20),userAdd varchar(20))";
		try {
			Class.forName(DriverName);
			Connection con= DriverManager.getConnection(url,userName ,Passward);
			Statement st = con.createStatement();
			int updatecount  = st.executeUpdate(sql_Query);
			System.out.println("table is created"+updatecount);
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}


}