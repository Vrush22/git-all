import java.util.Scanner;
class demo1
{
	public static void main(String[] args)
	{
		Scanner std=new Scanner(System.in);
		System.out.println("Enter a no.");
		int a=std.nextInt();
		int sum=1;
		for(int i=1;i<=a;i++)
		{
			sum=sum*i;
		}
		System.out.println("factorial of +a is:"+sum);
	}
}