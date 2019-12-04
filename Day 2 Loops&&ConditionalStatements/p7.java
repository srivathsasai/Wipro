import java.util.*;
public class p7
{
    public static void main(String arg[])
    {
        char ch=arg[0].charAt(0);
        if(ch>=97)
             System.out.println(ch+"-->"+Character.toUpperCase(ch));
        else
             System.out.println(ch+"-->"+Character.toLowerCase(ch));
    }
}
