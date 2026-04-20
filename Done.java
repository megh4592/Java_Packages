import java.util.*;
class Done
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int a[]=new int[5];
        int i,d,f=0,k;
        for(i=0;i<5;i++)
        {
            System.out.println("Enter a number");
            a[i]=in.nextInt();           
        }
        for(i=0;i<5;i++)
        {
            f=0;
            k=a[i];
            while(a[i]>0)
            {
              d=a[i]%10;
              f++;
              a[i]=a[i]/10;
            }
            if(f%2!=0)
            {
                if(k%2==0)
                System.out.println(k);
            }
        }
        
    }
}