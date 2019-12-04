import java.util.*;
public class p8
{
    public static void main(String arg[])
    {
        char ch=arg[0].charAt(0);
        switch(ch)
        {
             case 'R': System.out.println("R-->Red");
                            break;
             case 'B': System.out.println("B-->Blue");
                            break;
             case 'G': System.out.println("G-->Green");
                            break;
             case 'Y': System.out.println("Y-->Yellow");
                            break;
             case 'O': System.out.println("O-->Orange");
                            break;
             case 'W': System.out.println("W-->White");
                            break;
             default: System.out.println("invalid");
                            break;
        }
    }
}
