import java.util.*;
public class reversestr2 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char a[]=str.toCharArray();
        System.out.println(Arrays.toString(a));
        int n=a.length;
        int l=0;
        int h=n-1;
        while(l<=h)
        {
            char temp=a[l];
            a[l]=a[h];
            a[h]=temp;
            l++;
            h--;
        }
        System.out.println(a);
        String res=new String(a);
        System.out.println(res);
    }
    
}
