import java.util.Scanner;
class pen
{
	public static void main(String[] args)
	{
		Scanner std=new Scanner(System.in);
		System.out.println("Enter number:");
		int a=std.nextInt();
		int b=std.nextInt();
		int c;
		c=a<b?a:b;
		System.out.println("Smallest number is:"+c);
	}
}