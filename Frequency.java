import java.util.*;
class Frequency
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int n,i,j,c,t;
        System.out.println("Enter no of terms");
        n=in.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(i=0;i<n-1;i++)
        {
            System.out.println("Enter any number");
            a[i]=in.nextInt();            
        }
        for(i=0;i<n-1;i++)
        {
            c=1;
            for(j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    c++;
                    for(t=j;t<n-1;t++)
                    {
                        a[t]=a[t+1];
                    }
                    n--;
                    j--;
                }          
            }
            b[i]=c;
        }
        for(i=0;i<n-1;i++)
        {
            System.out.println("Frequency of"+a[i]+" = "+b[i]);
        }
    }
}