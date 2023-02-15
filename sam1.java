import java.util.Scanner;
class pen1
{
	public static void main(String[] args)
	{
		Scanner std=new Scanner(System.in);
		System.out.println("Enter the no.");
		int a=std.nextInt();
		String x ;
		x=(a%2==0)?"even":"odd";
		System.out.println("The number is:"+x);
		
	}
}