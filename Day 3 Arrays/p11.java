import java.util.*;
public class p11 {
	public static void main(String arg[])
	{
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int i,j,k=0,max=0;
		try {
			for(i=0;i<3;i++)
				for(j=0;j<3;j++)
					a[i][j]=Integer.parseInt(arg[k++]);
			for(i=0;i<3;i++) {
				for(j=0;j<3;j++)
					if(max<a[i][j])
						max=a[i][j];
			}
                                                       System.out.println("The Given of Array is : ");
		                  for(i=0;i<3;i++){
			           for(j=0;j<3;j++)
				System.out.print(a[i][j]+" ");
			           System.out.println();
                                                        }
			System.out.println("The Biggest Number In Array is "+max);
		}
		catch(Exception e)
		{
				System.out.println("Enter 9 Integer Values");
		}
	}
}
