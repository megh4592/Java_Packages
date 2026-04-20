import java.util.*;
class high
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i=0,j,k,d,n,l;
        System.out.println("Enter a number");
        n=in.nextInt();
        String s=n+"";
        l=s.length();
        int a[]=new int[l];
        while(n>0)
        {
            d=n%10;
            a[i]=d;
            n=n/10;
        }
    }
}