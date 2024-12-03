package JDBCcrudOperations;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class DynamicInput {

	public static void main(String[] args)  {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_Anu","root","Anu@sql123");
			Statement st = con.createStatement();

			Scanner sc = new Scanner(System.in);
			while(true) {
				System.out.println("eneter user Id");
				int id = sc.nextInt();
				System.out.println("enter user Name");
				String Name = sc.next();
				System.out.println("enter user Address");
				String Address = sc.next();
				Object userId=0;
				Object userName=null;
				Object userAdd=null;
				String sql_Query = String.format("insert into users values(%d, '%s', '%s')", userId, userName, userAdd);
				st.executeUpdate(sql_Query);
				System.out.println("do you want insert another record");
				String option = sc.next();
				if(option.equalsIgnoreCase("no")) {
					break;
				}
			}
			con.close();
		} 
		catch (Exception e) {
			System.out.println(e);

		}

	}

}
