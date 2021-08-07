import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int res=num;
        int pick=0;
        while(num!=0)
        {
            pick=num%10;
            sum=sum+(pick*pick*pick);
            num=num/10;

        }
        if(sum==res)
        {
             System.out.println("its an armstron number");
        }
        else{
            System.out.println("no its not an armstrong");
        }

    }
}
