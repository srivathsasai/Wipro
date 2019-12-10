public class p1 {
	public static void main(String arg[])
	{
		fruit a=new apple("Apple","Sweet",50);
		fruit o=new orange("Orange","Sweet",43);
		a.eat();
		o.eat();
	}
}
class fruit
{
	String name,taste;
	int size;
	public void eat()
	{
		System.out.println("Name of The Fruit : "+name+"\nTaste : "+taste);
	}
}
class apple extends fruit
{
	apple(String name,String taste,int size)
	{
		super.name=name;
		super.taste=taste;
		super.size=size;
	}
	public void eat()
	{
		System.out.println("Name of The Fruit : "+name+"\nTaste : "+taste);
	}
}
class orange extends fruit
{
	orange(String name,String taste,int size)
	{
		super.name=name;
		super.taste=taste;
		super.size=size;
	}
	public void eat()
	{
		System.out.println("Name of The Fruit : "+name+"\nTaste : "+taste);
	}
}