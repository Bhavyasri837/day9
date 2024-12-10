import java.util.*;
public class palindrome {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String res="";
        int n=str.length();
        for(int i=0;i<n;i++)
        {
            res=str.charAt(i)+res;
        }
        if(res.equals(str))
        System.out.println("it is a palindrome");
        else
        System.out.println("not a palindrome");
    }
    
}
