import java.util.Scanner;
class book1
{
	public static void main(String[] args)
	{
		Scanner std= new Scanner(System.in);
		System.out.println("Enter the no.");
		int a=std.nextInt();
		int b=a%10;
		a=a/10;
		int c=a%10;
		a=a/10;
		System.out.println(a+" "+c+" "+b);
		int z=a+b+c;
		System.out.println("total sum of the digit is:" +z);
	}
}