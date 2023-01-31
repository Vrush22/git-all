import java.sql.*;

public class con2 {
	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","Vrush22");
			
			String q="create table table1(tId int(20) primary key auto_increment , tName varchar(200) not null , tCity varchar(400))";
			
			Statement stmt=con.createStatement();
			stmt.executeUpdate(q);
			System.out.println("table created in database..");
			con.close();
			}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
