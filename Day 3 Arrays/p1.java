public class p1
{
     public static void main(String arg[])
     {
            int sum=0;
            int a[]=new int[]{1,2,3,4,5};
            for(int i=0;i<5;i++)
                 sum=sum+a[i];
            System.out.println("sum = "+sum+"\nAverage = "+(sum/5));
     }
}