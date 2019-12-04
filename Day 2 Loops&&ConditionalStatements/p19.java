import java.util.*;
public class p19
{
public static void main(String[] args) {
  int n=2,f=0;
  while(true)
  {
      if((n%2==0)&&(n%3==0)&&(n%5==0))
      {
          if(f<=5){
            System.out.println(n);
            f++;
          }
          else
            break;
      }
      n++;
  }
}
}