import java.util.*;
public class lastword {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1[]=s.split(" ");
        int d=s1.length;
        String h=s1[d-1];
        int l=h.length();
        System.out.println(l);
    }
    
}
