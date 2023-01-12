import java.io.FileInputStream;
class Testt1
{
	public static void main(String[] args)
	{	
		try
		{
			FileInputStream fis=new FileInputStream("d:/abc.txt");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}