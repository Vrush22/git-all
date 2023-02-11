import java.util.Scanner;
class demo
{
	public static void main(String[] args)
	{
		Scanner std=new Scanner(System.in);
		System.out.println("Enter a no.");
		int a=std.nextInt();
		if(a%2==0)
		{
			System.out.println("No. is even");
		}
		else
		{
			System.out.println("No. is odd");
		}
	}
}