import java.util.Scanner;
class test4
{
	public static void main(String[] args)
	{
		int A;
		Scanner std= new Scanner(System.in);
		System.out.println("enter values");
		int l=std.nextInt();
		int b=std.nextInt();
		A=l*b;
		System.out.println("Area of rectangle is:" +A);
	}
}