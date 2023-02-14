import java.util.Scanner;
class book4
{
	public static void main(String[] args)
	{
		Scanner std=new Scanner(System.in);
		System.out.println("enter the number:");
		int p=std.nextInt();
		int n=std.nextInt();
		double r=std.nextDouble();
		double SI;
		SI=p*r*n;
		System.out.println("The simple interset is:" +SI);
	}
}