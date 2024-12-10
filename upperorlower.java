import java.util.*;
public class upperorlower {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char b=sc.next().charAt(0);
        if((b&32)==0)
    {
        System.out.println("upper case");
    }
    else{
        System.out.println("lowe case");
    }
    }
    
}
