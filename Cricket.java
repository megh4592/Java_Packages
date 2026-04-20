import java.util.*;
class Cricket
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int a[]=new int[11];
        int i,t=0,hc=0,c=0,h,l;
        for(i=0;i<11;i++)
        {
            System.out.println("Enter runs scored by each");
            a[i]=in.nextInt();
        }
        h=a[0];
        l=a[0];
        for(i=0;i<11;i++)
        {
            if(l>a[i])
            l=a[i];
            if(h<a[i])
            h=a[i];
            t=t+a[i];
            if(a[i]>=100)
            c++;
            if(a[i]>=50)
            hc++;
        }
      double  avg=t/11;
      System.out.println("Highest run scored in an inning = "+h);
      System.out.println("Lowest run scored in an inning = "+l);
      System.out.println("Average run scored in an inning = "+avg);
      System.out.println("Total run scored in an inning = "+t);
      System.out.println("No of batsman scored century in an inning = "+c);
      System.out.println("No of batsman scored half century in an inning = "+hc);
    }
}
        