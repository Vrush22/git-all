import java.util.Scanner;
class test1
{
	public static void main(String[] args)
	{
		int z;
		Scanner std= new Scanner(System.in);
		System.out.println("Enter five number");
		int a=std.nextInt();
		int b=std.nextInt();	
		int c=std.nextInt();
		int d=std.nextInt();
		int e=std.nextInt();
		z=a*b*c*d*e;
		System.out.println("multiplaction is" +z);
	}
