import java.util.*;
class romdec
{
    String sym[]={"I","V","X","L","C","D","M"};
    String addsym(String a,int d,int i)
    {
        if(d<4)
        {
            while(d>1)
            {
            a=a+sym[i];
            d--;
            }
        }
        else if(d==4)
        a=sym[i-1]+a;
        else if(d>4 && d<9)
        {
            while(d>5)
            {
            a=a+sym[i-1];
            d--;
            }
        }
        else
        a=sym[i-2]+a;
        return a;
    }
    int putsym(int d,int a)
    {
        if(d<4)
        a=(a*2)-2;
        else if(d<9)
        a=(a*2)-1;
        else
        a=a*2;
        return a;
    }
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int n,d,i,k,c=0;
        String w="",s;
        System.out.println("Enter any number");
        n=in.nextInt();
        romdec ob=new romdec();
        for(i=n;i>0;i=i/10)
        c++;
        while(n>0)
        {
            s="";
            System.out.println("c"+c);
            d=n/(int)(Math.pow(10,c-1)); 
            System.out.println("d"+d);
            n=n%(int)(Math.pow(10,c-1));
            System.out.println("n"+n);
            if(d!=0)
            {
            k=ob.putsym(d,c);
            s=ob.addsym(ob.sym[k],d,k);
            }
            c--;
            w=w+s;
        }
        System.out.println(w);
    }
}