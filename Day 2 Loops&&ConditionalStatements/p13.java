import java.util.*;
public class p13
{
  public static void main(String[] args)
  {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter The Starting Number : ");
      int low=sc.nextInt();
     System.out.print("Enter The Ending Number : ");
      int high=sc.nextInt();
        for(;low < high;) {
            boolean flag = false;
            for(int i = 2; i <= low/2; ++i) {
                if(low % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.print(low + " ");
            ++low;
        }
  }
}