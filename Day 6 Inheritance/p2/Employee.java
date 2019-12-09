public class Employee extends Person
{
	double salary;
	int year;
	String nin;
	Employee(String a,double b,int c,String d)
	{
		name=a;
		salary=b;
		year=c;
		nin=d;
	}
	void display()
	{
		System.out.println("Employee Name : "+name);
		System.out.println("Employee Salary : "+salary);
		System.out.println("Employee Joining Year : "+year);
		System.out.println("Employee National Insurance Number : "+nin);
	}
}