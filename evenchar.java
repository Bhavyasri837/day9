import java.util.*;
public class evenchar {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.length();
        String ans="";
        for(int i=0;i<n;i+=2)
        {
            ans+=str.charAt(i);
        }
        System.out.println(ans);
    }
    
}
