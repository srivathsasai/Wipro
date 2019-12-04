import java.util.*;
public class p10 {
	public static void main(String arg[])
	{
		int a[][]=new int[2][2];
		int b[][]=new int[2][2];
		int i,j;
		try {
			a[0][0]=Integer.parseInt(arg[0]);
			a[0][1]=Integer.parseInt(arg[1]);
			a[1][0]=Integer.parseInt(arg[2]);
			a[1][1]=Integer.parseInt(arg[3]);
			for(i=0;i<2;i++)
				for(j=0;j<2;j++)
					b[i][j]=a[2-1-j][2-1-i];
                                                        System.out.println("The Given of Array is : ");
			for(i=0;i<2;i++) {
				for(j=0;j<2;j++)
					System.out.print(a[i][j]+" ");
				System.out.println();
			}
                                                        System.out.println("The Reverse of Array is : ");
			for(i=0;i<2;i++) {
				for(j=0;j<2;j++)
					System.out.print(b[i][j]+" ");
				System.out.println();
			}
		}
		catch(Exception e)
		{
				System.out.println("Enter 4 Integer Values");
		}
	}
}
