import java.util.*;
class Search
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int a[]=new int[5];
        int i,n,f=0;
        for(i=0;i<5;i++)
        {
            System.out.println("Enter a number");
            a[i]=in.nextInt();           
        }
        System.out.println("Enter a search element");
        n=in.nextInt();
        for(i=0;i<5;i++)
        {
            if(a[i]==n)
            {
            f=1;
            break;
        }
        }
        if(f==1)
        System.out.println("Number is present");
        else
        System.out.println("Number is not present");
    }
}