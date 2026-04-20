import java.util.*;
class dth
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int d,s,r,i,j;
        double a,n;
        String z, y,t="";
        char p;
        n=in.nextDouble();
        z=n+"";
        r=z.indexOf('.');
        y=z.substring(r);
        a=Double.valueOf(y);
        System.out.println(a);
        while(n>0)
        {
            d=(int)n%16;
             if(d>9)
                {
                 p=(char)(64+(d-9));
                 t=t+p;
                }
                else
            t=d+t;
            n=(int)n/16;
        }
        if(a>0.0)
        {
            t=t+'.';
            System.out.println(t);
            for(i=1;i<=5;i++)
            {
                a=a*16;
                s=(int)a;
                if(s>9)
                {
                 p=(char)(64+(s-9));
                 t=t+p;
                }
                else
                t=t+s;
                System.out.println("s="+s);
                if(a==1.00)
                break;
                a=a-s;
            }
        }
        System.out.println("Equivalent hexadecimal = "+t);
    }
}