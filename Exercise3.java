class Testt2
{
	public static void main(String[] args)
	{
		try
		{
			Class.forName("com.sql.jdbc.Driver");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}