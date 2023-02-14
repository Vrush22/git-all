import java.util.Scanner;
class book3
{
	public static void main(String[] args)
	{
		Scanner std=new Scanner(System.in);
		System.out.println("Enter celcius");
		double c=std.nextDouble();
		double f;
		f=(c*1.8)+32;
		System.out.println(f);
	}
}