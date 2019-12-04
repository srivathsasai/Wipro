import java.util.*;
public class p15
{
    public static void main(String[] args)
   {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int n=sc.nextInt();
        int a=n;
        int s=0,sum=0;
        for(;n!=0;)
        {
              s=n%10;
              sum+=s;
             n/=10;
        }
         System.out.println("Sum of all the digits of "+a+" is "+sum);
   }
}