import java.sql.*;

public class con3 {
	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","Vrush22");
			String q="insert into table1(tName,tCity) values (?,?)";
			PreparedStatement pstmt=con.prepareStatement(q);
			pstmt.setString(1,"nikhil" );
			pstmt.setString(2, "hydrabad");
			pstmt.executeUpdate();
			
			System.out.println("inserted ..");
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
