import java.util.Scanner;

public class gretestofthree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int frist=sc.nextInt();
        int second=sc.nextInt();
        int third=sc.nextInt();

        if(frist>second && frist>third)
        {
            System.out.println("Frist one is greater");
        }
       else if(second>third )
       {
           System.out.println("second is greater");
       }
       else if (third>frist ){
             System.out.println("thire is greater");
       }
       else{
           System.out.println("all are equal");}

    }
}
