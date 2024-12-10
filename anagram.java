import java.util.*;
public class anagram {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int c1[]=new int[256];
        int c2[]=new int[256];
        int n1=s1.length();
        int n2=s2.length();
        for(int i=0;i<n1;i++)
        {
            c1[s1.charAt(i)]++;
        }
        System.out.println(Arrays.toString(c1));
        for(int i=0;i<n2;i++)
        {
            c2[s2.charAt(i)]++;
        }
        System.out.println(Arrays.toString(c2));
        boolean ans=true;
        for(int i=0;i<256;i++)
        {
            if(c1[i]!=c2[i])
            {
               ans=false;
                break;
            }
        }
        String res=(ans?"is an anagram":"is not an anagram");
      System.out.println(res);

    }
    
}
