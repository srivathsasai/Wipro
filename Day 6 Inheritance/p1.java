public class p1
{
	public static void main(String arg[])
	{
		Animal a=new Animal();
		a.eat();
		a.sleep();
		Bird b=new Bird();
	    b.eat();
	    b.sleep();
	    b.fly();
	}
} 
class Animal
{
	void eat()
	{
		System.out.println("Animal is Eating");
	}
	void sleep()
	{
		System.out.println("Animal is Sleeping");
	}
}
class Bird extends Animal
{
	void eat()
	{
		System.out.println("Bird is Eating");
	}
	void sleep()
	{
		System.out.println("Bird is Sleeping");
	}
	void fly()
	{
		System.out.println("Bird is Flying");
	}
}