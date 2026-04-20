import java.util.*;
class HCF
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int n,i,j=0,b,c=0,d;
        System.out.println("Enter no of terms");
        n=in.nextInt();
        int a[]=new int[n];
        int p[]=new int[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter any number");
            a[i]=in.nextInt();            
        }
        for(i=0,j=i+1;i<n;i++,j++)
        {
          if(a[i]<a[j])
         {
          while(a[j]>0)
          {
            d=a[i]%a[j]; 
            c=a[j];
            a[j]=d;
          }           
         }
         else
         {
          while(a[i]>0)
          {
            d=a[j]%a[i];
            c=a[i];
            a[i]=d;
          }
         }
         p[i]=c;
        }
    }
}