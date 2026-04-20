import java.util.*;
class sd
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int d,i,n=6,j;
        int a[]=new int[6];
        System.out.println("Enter 6 numbers");
        for(i=0;i<6;i++)
        a[i]=in.nextInt();
        for(i=0;i<n;i++)
        System.out.print(a[i]+" ");
        System.out.println();
        for(i=0;i<6;i++)
        {
            for(j=0;j<n-1;j++)
            {
            a[j]=Math.abs(a[j]-a[j+1]);
            System.out.print(a[j]+" ");
            }
            System.out.println();
            n--;
        }
    }
}