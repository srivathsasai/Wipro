public class p14
{
    public static void main(String[] args)
   {
         boolean flag = false;
         try{
             int n=Integer.parseInt(args[0]);
             if(n==0||n==1)
                 System.out.println(n+" is neither a prime nor a composite.");
             else{
                        for(int i = 2; i <= n/2; ++i)
                        {
                             if(n % i == 0)
                             {
                                  flag = true;
                                  break;
                             }
                        }
                  if(!flag)
                          System.out.println(n+ " is a prime number.");
                  else
                          System.out.println(n + " is not a prime number.");
             }
         }
        catch(Exception e)
        {
              System.out.println("Please enter an integer number"); 
        }
    }
}