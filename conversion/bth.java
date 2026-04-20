import java.util.*;
class bth
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,j,k,d,t,l,q=0,c,l1;
        double n,m,x=0.0;
        String s,e,w;
        char p,ch;
        System.out.println("Enter a binary number");
        n=in.nextInt();
        s=n+"";
        t=s.indexOf('.');
        e=s.substring(t);
        l=e.length();
        while(n>0)
        {
            d=(int)n%10000;
            w=Integer.toString(d);
            l1=w.length();
            if(l1!=4)
            {
                d=d+1;
         while(d>=1)
        {
         d=(int)n%10;
         c=(int)(Math.pow(2,q))*d;
         q++;
         x=c+x;
         d=d/10;
        }
        }
    }
    }
}
