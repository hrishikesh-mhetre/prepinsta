import java.util.Scanner;

public class sumofrange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int from=sc.nextInt();
        int to=sc.nextInt();
        int sum=0;
        for(int i=from;i<=to;i++)
        {
                    sum=i+sum;
        }      
        System.out.println("sum is "+sum);
     }
}
