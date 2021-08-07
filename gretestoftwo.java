import java.util.Scanner;

public class gretestoftwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int frist=sc.nextInt();
        int second=sc.nextInt();
        if(frist>second){
            System.out.println("Frist number is gretest");
        }
        else if(frist==second){
                    System.out.println("num are equal");
            }
            else{
               
                System.out.println("Second is gretest");
            }
    }
}
