import java.util.Scanner;


class stand
{
   public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a number for table print");
       int a=sc.nextInt();
       for(int i=1;i<=10;i++)
       {
           System.out.print(a);
           System.out.print(" * "+i+" = ");  
           System.out.print(a*i);
           System.out.println(); 
       }
    }
}