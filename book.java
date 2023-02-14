import java.util.Scanner;
class book
{
	public static void main(String[] args)
	{
		Scanner std=new Scanner(System.in);
		System.out.println("Enter a no.");
		int a=std.nextInt();
		int b=a%10;
		a=a/10;
		int c=a%10;
		a=a/10;
		int x=b*b;
		int y=a*a;
		int z=c*c;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
	