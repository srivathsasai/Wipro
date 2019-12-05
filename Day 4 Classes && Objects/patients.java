import java.lang.*;
class patient
{
	String name;
	double weight,height;
	double BMI()
	{
		return ((weight/(height*height))*703);
	}
	patient(String a,double b,double c)
	{
		name=a;
		weight=b;
		height=c;
	}
} 
public class patients
{
	public static void main(String arg[])
	{
		patient a=new patient("Sri",60,6);
		patient p=new patient("chai",60,5.11);
		System.out.println("BMI of Patient is : "p.BMI());
	}
}