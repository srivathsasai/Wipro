import java.util.*;
public class p3
{
     public static void main(String arg[])
     {
           Scanner sc=new Scanner(System.in);
           int a[]=new int[]{1,4,34,56,7};
           int n=sc.nextInt();
           int i;
           boolean flag=false;
           for(i=0;i<5;i++)
           {
                if(a[i]==n)
                {
                     flag=true;
                     break;
                }
           }
           if(flag==true)
               System.out.println(i+1);
           else
               System.out.println("-1"); 
    }
}