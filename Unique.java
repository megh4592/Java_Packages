import java.util.*;
class Unique
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int n,i,k,f=0,d,b,j;
        System.out.println("Enter number of terms");
        n=in.nextInt();
        int a[]= new int[n];
        for(i=0;i<n;i++)
        {
           System.out.println("Enter any number");
           a[i]= in.nextInt();         
        }
        for(i=0;i<n;i++)
        {
            b=a[i];
            for(j=a[i];j>0;j=b/10)
            {
            f=0;
            d=j%10;
            while(b>0)
            {
                b=b/10;
                k=b%10;
                if(d==k)
                {
                    f=1;
                    break;
                }
            }
        }
            if(f==0)
            System.out.println(a[i]);          
        }
    }
}