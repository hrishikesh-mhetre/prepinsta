import java.util.Scanner;

public class sumofdigit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int mod=0;
        int sum=0;
        while(num!=0)
        {
            mod=num%10;
            num=num/10;
            sum=sum+mod;
        }
        System.out.println(sum);
    }
}