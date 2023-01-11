class bunny
{
	int i;
	void setValue(int i)
	{
		this.i=i;
	}
	void show()
	{
		System.out.println(i);
	}
}
class tunny
{
	public static void main(String[] args)
	{
		bunny b=new bunny();
		b.setValue(10);
		b.show();
	}
}