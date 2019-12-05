import java.lang.*;
public class p2
{
	public static void main(String arg[])
	{
		System.out.println(calculator.powerInt(3,3));
		System.out.println(calculator.powerDouble(3,2));
	}
} 
class calculator
{
	static int powerInt(int num1,int num2)
	{
		return (int)Math.pow(num1, num2);
	}
	static double powerDouble(double num1,double num2)
	{
		return Math.pow(num1, num2);
	}
}