public class p2
{
     public static void main(String arg[])
     {
            int sum=0,i,j,t;
            int a[]=new int[]{11,20,12,9,2};
            for(i=0;i<5;i++)
            {
                  for(j=i;j<5;j++)
                  {
                       if(a[i]>=a[j])
                       {
                            t=a[i];
                            a[i]=a[j];
                            a[j]=t;
                       }
                  }
            }
            System.out.println("Minimum = "+a[0]+"\nMaximum = "+a[4]);
       }
}