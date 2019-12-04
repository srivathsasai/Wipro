public class p6
{
     public static void main(String arg[])
     { 
             String gender=arg[0];
             int age=Integer.parseInt(arg[1]);
             if((gender.equals("Male"))&&(age>=1&&age<=60))
                        System.out.println("Interest == 9.2%");
             else if((gender.equals("Male"))&&(age<=120&&age>60))
                        System.out.println("Interest == 8.3%");
             else if((gender.equals("Female"))&&(age>=1&&age<=58))
                        System.out.println("Interest == 8.2%");
             else if((gender.equals("Female"))&&(age<=120&&age>58))
                        System.out.println("Interest == 7.6%");
             else
                        System.out.println("Invalid");
     }
}