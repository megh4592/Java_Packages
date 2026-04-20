import java.util.*;
class otd
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,d,k,q=0,l,m;
        double n,f,x=0.0,c;
        String s,e;
        char p;
        System.out.println("Enter a octal number");
        n=in.nextDouble();
         s=n+"";
        m=s.indexOf('.');
         e=s.substring(m+1);
         l=e.length();
        while(n>=1)
        {
         d=(int)n%10;
         c=(int)(Math.pow(8,q))*d;
         q++;
         x=c+x;
         n=n/10;
        }
        q=-1;
        if(l>0)
        {
        for(i=0;i<l;i++)
         {
 
           p=e.charAt(i);
           k=(int)p-48;
         c=(Math.pow(8,q))*k;
         x=c+x;
         q--;
        }
        }
        System.out.println("Octal equivalent ="+x);
    }
}
