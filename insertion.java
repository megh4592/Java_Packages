import java.util.*;
class insertion//Sorting using insertion sort(in asc)
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter size");
        int n=in.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements");
        int i,j,t;
        for(i=0;i<n;i++)
        a[i]=in.nextInt();
        
        for(i=1;i<n;i++)
        {
            t=a[i];
            j=i-1;
            while(j>=0 &&a[j]>t)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=t;
        }
        System.out.println("Sorted");
        for(i=0;i<n;i++)
        System.out.println(a[i]);
    }
}
