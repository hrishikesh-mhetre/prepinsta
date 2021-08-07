import java.util.Scanner;
public class araminrange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int from=sc.nextInt();
        int to=sc.nextInt();
        for(int i=from;i<=to;i++)
        {
            int n=i;
            int sum=0;
            int    pick=0;
            while(n!=0)
            {
              pick=n%10;
              sum=sum+(pick*pick*pick);
              n=n/10;
        
            }
            if (sum==i){
                  System.out.println(i);
            }
        }


    }
}
