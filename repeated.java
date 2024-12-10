import java.util.*;
public class repeated {
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
    int max=0;
    int index=0;
    for(int i=0;i<n;i++)
    {
        if(c[i]>max){
        max=c[i];
        index=i;
        }
    }
    System.out.println("most repeated="+(char)(index+65));
    System.out.println("most repeated="+(index));
    System.out.println("most repeated="+(max));
  } 
   } 
