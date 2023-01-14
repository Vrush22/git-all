import java.util.ArrayList;


class CollectionDemo
{
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		al.add("vrushali");
		al.add(101);
		System.out.println(al);

		ArrayList al2=new ArrayList();
		al2.add("aaa");
		al2.add("bb");
		
		al.addAll(al2);
		System.out.println(al);
	} 
} 