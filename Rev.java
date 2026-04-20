import java.util.*;
class Rev
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int a[]=new int[5];
        int i,d,r=0,k;
        for(i=0;i<5;i++)
        {
            System.out.println("Enter a number");
            a[i]= in.nextInt();       
        }
        for(i=0;i<5;i++)
        {
            k=a[i];
            r=0;
            while(k>0)
            {
                d=k%10;
                r=(r*10)+d;
                k=k/10;
            }
            a[i]=r;
            System.out.println(a[i]);
        }
    }
}