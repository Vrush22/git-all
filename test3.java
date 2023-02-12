import java.util.Scanner;
class test2
{
	public static void main(String[] args)
	{
		int total , avg;
		Scanner std= new Scanner(System.in);
		System.out.println("Enter the marks odf 6 sub");
		int a=std.nextInt();
		int b=std.nextInt();
		int c=std.nextInt();
		int d=std.nextInt();
		int e=std.nextInt();
		int f=std.nextInt();
		total=a+b+c+d+e+f;
		System.out.println("total of marks is:" +total);
		avg=total/6;
		System.out.println("average is:" +avg);
	}
}