public class p3 {
	public static void main(String arg[])
	{
		Student s=new Student("Pooja",'F',15,3421);
		CollageStudent c=new CollageStudent("Srivathsa",'M',18,180030134,2,"Computer Science");
		Teacher t=new Teacher("Lavanya",'F',24,"Maths",97000);
		System.out.println("Details of Teacher");
		System.out.println("Name of The Teacher : "+t.name);
		System.out.println("Gender : "+t.gender);
		System.out.println("Age : "+t.age);
		System.out.println("Subject : "+t.subject);
		System.out.println("Salary : "+t.salary);
		System.out.println();
		System.out.println("Details of Student");
		System.out.println("Name of The Student : "+s.name);
		System.out.println("Gender : "+s.gender);
		System.out.println("Age : "+s.age);
		System.out.println("Student ID : "+s.id);
		System.out.println();
		System.out.println("Details of Collage Student");
		System.out.println("Name of The Student : "+c.name);
		System.out.println("Gender : "+c.gender);
		System.out.println("Age : "+c.age);
		System.out.println("Student ID : "+c.id);
		System.out.println("Year : "+c.year);
		System.out.println("Major : "+c.id);
	}
}
class Person
{
	String name;
                   char gender;
	int age;
	Person(String name,char gender,int age)
	{
		this.name=name;
		this.gender=gender;
		this.age=age;
	}

}
class Student extends Person 
{
	long id;
	Student(String name,char gender,int age,long id)
	{
		super(name,gender,age);
		this.id=id;
	}
}
class Teacher extends Person
{
	String subject;
	int salary;
	Teacher(String name,char gender,int age,String subject,int salary)
	{
		super(name,gender,age);
		this.subject=subject;
		this.salary=salary;
	}
}
class CollageStudent extends Student
{
	int year;
	String major;
	CollageStudent(String name,char gender,int age,long id,int year,String major)
	{
		super(name,gender,age,id);
		this.year=year;
		this.major=major;
	}
}