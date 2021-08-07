import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s=sc.next();
        String rev="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            rev=ch+rev;

        }
        //System.out.println(rev);
        if(s.equals(rev))
    {  
          System.out.println("is Palindrome");
    }
    else{
        System.out.println("not a plaindrome");
    }

    }
}
