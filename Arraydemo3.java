class ArrayDemo3
{
	public static void main(String[] args)
	{
		int[][] a=new int[2][3];
		a[0][0]=20;
		a[0][1]=30;
		a[1][0]=40;
		a[1][1]=50;
		for(int i=0;i<a.lenght;i++)
		{
			for(int j=0;j<a[i].lenght;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
}