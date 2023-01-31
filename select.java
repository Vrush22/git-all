import java.sql.*;
public class con6 {
	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","Vrush22");
			String q="select * from table1";
			Statement stmt=con.createStatement();
			ResultSet set=stmt.executeQuery(q);
			while(set.next())
			{
				int id = set.getInt(1);
				String name = set.getString(2);
				String city = set.getString(3);
				System.out.println("name , id , city");
				System.out.println("done");
				con.close();
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
