import java.util.Scanner;
class pen3
{
	public static void main(String[] args)
	{
		Scanner std=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=std.nextInt();
		String x;
		x=a%3==0||a%5==0?"yes":"no";
		System.out.println("the number is divisible by 3 and 5" +x);
	}