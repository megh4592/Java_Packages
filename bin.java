import java.util.*;
class bin
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int n,b,l,m,s,i,p=0;
        boolean f=false;
        System.out.println("Enter number of terms");
        n=in.nextInt();
        b=0;
        l=n-1;
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
        a[i]=i;
        }
        System.out.println("Enter element to be searched");
        s=in.nextInt();
        while(b<=l)
        {
            m=(b+l)/2;
            if(a[m]==s)
            {
                p=m;
                f=true;
                break;
            }
            else if(a[m]>s)
            {
                l=m-1;
            }
            else
            {
               b=m+1;
            }
        }
        if(f==true)
        System.out.println("Element found at index "+p+" at position "+(p+1));
        else
        System.out.println("Search unsuccessful");
    }
}