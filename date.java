import java.util.*;
class date
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int a[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        int d,m,y,f=0;
        System.out.println("Enter date of birth in mm,dd,yyyy form");
        m=in.nextInt();
        d=in.nextInt();
        y=in.nextInt();
        if(a[m]>=d && m<=12)
        {
          f=1;
        }
        else if(m%4==0 && d==29)
        {
            f=1;
        }
        if(f==0)
        System.out.println("Invalid date");
        else
        {
        System.out.println("Valid date");
        System.out.print(d);
        }
    }
}