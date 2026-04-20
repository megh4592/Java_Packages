/**
 * Name: Megha Roy Chowdhury
 * Unique ID: 7783754
 */
// Objective : Addition and subtraction using 1's compliment
// Implementation
import java.util.*;
class o1s
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int n,n1,m,f1=0,i,j=0,l,p=0,d,s=0,c=0,f=0,f2=0,z,y;
        String t="",e="";
        System.out.println("Enter numbers ");
        n=in.nextInt();
        n1=in.nextInt();
        if(n<0)
        {
        n=Math.abs(n);
        f1=1;
       }
        if (n1<0)
        {
        n1=Math.abs(n1);
         f2=1;
        }
         while(n>0)
        {
            d=(int)n%2;
            s=(int)(d*Math.pow(10,f)+s);
            n=(int)n/2;
            f++;
         }
         while(n1>0)
        {
            d=(int)n1%2;
            p=(int)(d*Math.pow(10,c)+p);
            n1=(int)n1/2;
            c++;
         }
         if(f>c)
         m=f;
         else 
         m=c;
         int a[]=new int[m+2];
         int b[]=new int[m+2];
         for(i=m+1;i>1;i--,s=s/10)
         {
         a[i]=s%10;
        }
        for(i=m+1;i>1;i--,p=p/10)
         {
         b[i]=p%10;
        }
        if(f1==1)
        {
            a[1]=1;
            for(i=2;i<=m+1;i++)
            {
                if(a[i]==0)
                a[i]=1;
                else
                a[i]=0;
            }
        }
        else
        {
        a[1]=0;
        b[1]=0;
      }
       if(f2==1)
        {
            b[1]=1;
            for(i=2;i<=m+1;i++)
            {
                if(b[i]==0)
                b[i]=1;
                else
                b[i]=0;
            }
        }
        f=0;
        System.out.println("Enter 1 for addition and 2 for subtraction");
        int ch=in.nextInt();
        if((f1!=f2 && )
        ch=
        switch(ch)
        {
        case 1:
            for(i=m+1;i<=0;i--)
            {
                z=a[i]+b[i]+f;
                if(z==2)
                {
                    f=1;
                    t=t+0;
                }
                else if(z==3)
                {
                    f=1;
                    t=t+1;
                }
                else
                t=t+z;
            }
        case 2:
            
        }
        for(i=1;i<=m+1;i++)
        System.out.print(a[i]);
        System.out.println();
        for(i=1;i<=m+1;i++)
        System.out.print(b[i]);
    }
}