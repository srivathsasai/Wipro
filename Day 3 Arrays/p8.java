import java.util.*;
public class p8
{
	public static void main(String[] args) {
	    int a[]={10,20,10,30,40,100,90};
                       int b[]=new int[10];
                       int max=0;
                       for(int i=0;i<7;i++)
                            for(int j=0;j<7;j++)
                                 if(a[i]==a[j])
                                        b[i]++;
                       for(int j=0;j<7;j++)
                             if(max<=b[j])
                                  max=j;
	   System.out.println(a[max]);
	}
}
