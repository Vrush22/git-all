import java.sql.*;
import java.io.*;
public class conupdate {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","Vrush22");
			String q="update table1 set tName=? , tCity=? where tId=?";
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter new name:");
			String name=br.readLine();
			System.out.println("Enter new city:");
			String city=br.readLine();
			System.out.println("Enter the student id:");
			int id=Integer.parseInt(br.readLine());
			PreparedStatement pstmt=con.prepareStatement(q);
			pstmt.setString(1, name);
			pstmt.setString(2, city);
			pstmt.setInt(3, id);
			pstmt.executeUpdate();
			con.close();
			
			 
			System.out.println("table is update..");
			
			
			}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
