
import java.util.Scanner;

public class reversenum {
    public static void main(String[] args) {
        
         Scanner sc=new Scanner(System.in);
         int num=sc.nextInt();
          int mod=0;
         String s="";
         while(num!=0)
         {
             mod=num%10;
             s=s+Integer.toString(mod);
             num=num/10;
            
         }

         System.out.println("Reverse of number is"+s);
    }
}
