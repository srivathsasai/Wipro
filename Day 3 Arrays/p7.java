import java.util.*;
public class p7
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
                       int n=sc.nextInt();
                       int i,j,k=0,c=0;
                       int a[]=new int[n];
                       int b[]=new int[n];
                       for(i=0;i<n;i++)
                            a[i]=sc.nextInt();
                       for(i=0;i<n;i++){
                            for(j=0;j<n;j++)
                            {
                                    if(a[i]==b[j])
                                           c++;
                             }
                             if(c==0)
                                 b[k++]=a[i];
                             c=0;
                       }
                       System.out.println();
                       for(i=0;i<k;i++)
                            System.out.println(b[i]);
	}
}
