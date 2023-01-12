class Ac
{
	public static void main(String[] args)
	{
		int a=100 , b=0 , c;
		System.out.println("1");
		
		System.out.println("2");
		try
		{
			c=a/b;
			System.out.println("c");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("3");
	}
}