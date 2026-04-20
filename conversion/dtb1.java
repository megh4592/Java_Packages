import java.util.*;
class dtb1
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter numbers");
        int d,s,r,i,c=0,f=0,l,f1=0;
        double a,p,q;
        String y,t="",k="";
        double n,n1;
        n=in.nextDouble();
        n1=in.nextDouble();
        if(n<0)
        {
        n=Math.abs(n);
        f1=1;
       }
        else if (n1<0)
        {
        n1=Math.abs(n1);
         f1=2;
        }
        while(c!=2)
        {
            k=t;
            t=""; 
        String z=n+"";
        r=z.indexOf('.');
        y=z.substring(r);
        a=Double.valueOf(y);
        while(n>0)
        {
            d=(int)n%2;
            t=d+t;
            n=(int)n/2;
        }
        if(a>0.0)
        {
            f++;
            t=t+'.';
            for(i=1;i<=5;i++)
            {
                a=a*2;
                s=(int)a;
                t=t+s;
                a=a-s;
            }
        }
        c++;
        n=n1;
        }
        if(f<2 && f!=0)
        {
           if( k.length()>t.length())
           {
               t=t+".";
           for(i=0;i<5;i++)
           t=t+'0';
           }
           else
           {
               k=k+".";
           for(i=0;i<5;i++)
           k=k+'0';
           }
        }
       
        if(k.length()>t.length())
        {
           while(t.length()!=k.length())
            t="0"+t;
    
        }
        else if(k.length()<t.length())
        {
             while(k.length()!=t.length())
            k="0"+k;
        } 
        l=t.length();
        while(l!=0)
        {
             c=0;
             p=Double.valueOf(t.charAt(l-1));
             q=Double.valueOf(k.charAt(l-1));
             p=t.charAt(l-1)+k.charAt(l-1)-96;
             p=p+f;
             if(p==2)
             {
             p=0;
             f=1;
             }
             else if(p==3)
             {
                 p=1;
                 f=1;
             }
             else
             f=0;
             System.out.println(p);
             l--;
        }
        System.out.println("Equivalent binary = "+k+"    "+t);
    }
}