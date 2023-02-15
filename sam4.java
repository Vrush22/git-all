import java.util.Scanner;
class pen4
{
	public static void main(String[] args)
	{
		Scanner std=new Scanner(System.in);
		System.out.println("Enter the two number");
		int a=std.nextInt();
		int b=std.nextInt();
		int c;
		c=a>b?a+b:a-b;
		System.out.println("The sum is"+c);
	}
}