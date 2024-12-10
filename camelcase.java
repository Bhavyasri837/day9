import java.util.*;
public class camelcase {
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String res=" ";
        int n=str.length();
        for (int i=0;i<n;i++)
        {
            char s=str.charAt(i);
            s^=32;
            res+=s;
        }
        System.out.println(res);
    }
    
}


