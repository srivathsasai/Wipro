public class Encapsulation {
	public static void main(String arg[])
	{
		Book b=new Book("One Piece",1000,90,"Oda","oda@gmail.com",'M');
		System.out.println("Name of The Book : "+b.getName());
		System.out.println("Price of The Book : "+b.getPrice());
		System.out.println("Number of Books in Stock : "+b.getgtyInStock());
		Author a=b.getAuthor();
		System.out.println("Name of The Author : "+a.getName());
		System.out.println("Email : "+a.getEmail());
		System.out.println("Gender : "+a.getGender());
	}
}
class Author
{
	private String name,email;
	private char gender;
	Author(String a,String b,char c)
	{
		name=a;
		email=b;
		gender=c;
	}
	String getName()
	{
		return name;
	}
	String getEmail()
	{
		return email;
	}
	char getGender()
	{
		return gender;
	}
	
}
class Book
{
	private String name;
	private Author a;
	private double price;
	private int gtyInStock;
	Book(String a,double c,int d,String b,String e,char f)
	{
		name=a;
		this.a=new Author(b,e,f);
		price=c;
		gtyInStock=d;
	}
	String getName()
	{
		return name;
	}
	Author getAuthor()
	{
		return a;
	}
	double getPrice()
	{
		return price;
	}
	int getgtyInStock()
	{
		return gtyInStock;
	}
	void setPrice(int p)
	{
		price=p;
	}
	void setgtyInStock(int g)
	{
		gtyInStock=g;
	}
}