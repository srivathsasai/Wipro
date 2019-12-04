public class p3
{
      public static void main(String s[])
      {
            int l;
            if(s.length>0)
            {           
                    for(l=0;l<s.length-1;l++)
                           System.out.print(s[l]+", ");
                    System.out.print(s[l]+".");
            }    
            else
                     System.out.print("No Value");  
       }
}