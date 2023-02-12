import java.util.Scanner;
class test3
{
	public static void main(String[] args)
	{
		
		double A;
		Scanner std=new Scanner(System.in);
		System.out.println("Enter the radius");
		int r=std.nextInt();
		A=3.14*r*r;
		System.out.println("Area of circle is:" +A);
	}
}