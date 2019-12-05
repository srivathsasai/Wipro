public  class Box {
	double width,height,depth; 
	public static void main(String arg[])
	{
		Box p=new Box(5,10,2.3);
		System.out.println("Volume of the Box = "+p.volume());
	}
	Box(double a,double b,double c)
	{
		width=a;
		height=b;
		depth=c;
	}
	double volume()
	{
		return (width*height*depth);
	}
}
