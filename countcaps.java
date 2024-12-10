import java.util.*;
public class countcaps {
  public static void main(String args[]) 
  {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    int c[]=new int[26];
    int n=str.length();
    for(int i=0;i<n;i++)
    {
        c[((int)(str.charAt(i)))-65]++;
    }
    System.out.println(Arrays.toString(c));
  } 
}
