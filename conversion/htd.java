import java.util.*;
class htd
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,d,k,q=0,l=0,m,l1;
        double x=0.0,c,y;
        String s,e="",n;
        char p,p1;
        System.out.println("Enter a hexadecimal number");
        n=in.nextLine();
        m=n.indexOf('.');
        if(m<0)
        s=n.substring(0);
        else
        {
         s=n.substring(0,m);
         e=n.substring(m+1);
         l=e.length();
        }
        l1=s.length();
            for(i=l1-1;i>=0;i--)
            {
                p1=s.charAt(i);
                System.out.println(" p1 "+p1);
               y=(int)p1;
               if(y<65)
                y=y-48;
                else
                y=y-55;
         c=(int)(Math.pow(16,q))*y;
         q++;
         x=c+x;
          }
        q=-1;
        if(l>0)
        {
        for(i=0;i<l;i++)
         {
 
           p=e.charAt(i);
           k=(int)p;
           if(p<65)
           k=k-48;
           else
           k=k-55;
         c=(Math.pow(16,q))*k;
         x=c+x;
         q--;
        }
        }
        System.out.println("Decimal equivalent ="+x);
    }
}