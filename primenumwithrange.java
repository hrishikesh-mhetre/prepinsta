import java.util.Scanner;

public  class primenumwithrange {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int from=sc.nextInt();
        int to=sc.nextInt();
        int count;
        for(int i=from;i<=to;i++)
        {
            count=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    count=count+1;
                }
            }
            if(count==2){
                System.out.println(i);
            }

        }
    }
}
