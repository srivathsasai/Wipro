import java.util.*;
public class p9 {
	public static void main(String arg[])
	{
		int n,i,sum=0,k=0,k2=0,j;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		boolean flag=false;
		int a[]=new int[n];
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==6)
				k=i;
			if(a[i]==7)
				k2=i;
		}
		if(k<k2)
		{
			for(i=0,j=k2+1;i<k||j<n;i++,j++)
			{
				if(i<k)
					sum=sum+a[i];
				if(j<n) {
					sum=sum+a[j];
				}
				
			}
		}
		else
			for(i=0;i<n;i++)
				sum=sum+a[i];
		System.out.println(sum);
	}
}
