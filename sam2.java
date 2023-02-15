import java.util.Scanner;
class pen2
{
	public static void main(String[] args)
	{
		Scanner std= new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=std.nextInt();
		int b=std.nextInt();
		int c=std.nextInt();
		int d,e,g;
		d=a>b?a:b;
		e=b>c?b:c;
		g=d>e?d:e;
		System.out.println("Greatest number is:"+g);
	}
}