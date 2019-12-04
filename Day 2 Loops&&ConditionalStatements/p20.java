import java.util.*;
public class p20
{
      public static void main(String arg[])
      {
            boolean flag=false;
            Scanner sc=new Scanner(System.in);
            do{
            System.out.println("1.Add\n2.Sub\n");
            int n=sc.nextInt();
            System.out.println("Enter The Values");
            int a=sc.nextInt();         
            int b=sc.nextInt();           
            if(n==1)
                 System.out.println("The Addition of "+a+" and "+b+" is "+(a+b)); 
            else if(n==2)
                 System.out.println("The Subtraction of "+a+" and "+b+" is "+(a-b));
            else  
                 System.out.println("Invalid Option");  
            System.out.println("If You Wish To Continue Press Y or y");
            String s=sc.next();
            if(s.equalsIgnoreCase("y"))
                     flag=true;
            else 
                     flag=false;
            }
            while(flag);
      }
}