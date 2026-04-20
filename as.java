   import java.util.*;//inclusion of java package
class as//declaring class
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int a[]=new int[20];
        int i,j,t,k=1;
        System.out.println("Enter 20 elements");
        for(i=0;i<20;i++)
        a[i]=in.nextInt();//accepting input
        for(i=0;i<20;i++)
        {
            for(j=0;j<19-i;j++)
            {
                if(a[j]>a[j+1])//ascending order
                {
                    t=a[j];//holding
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        System.out.println("Ascending order");
        for(i=0;i<20;i++)
        System.out.print(a[i]+",");
        System.out.println();//changing line
        System.out.println("Series");
        for(i=a[0]+1;i<a[19];i++)
        {
            if(a[k]==i)
            {
                k++;
                continue;
            }
            else
            System.out.print(i+" ");
        }
    }
}