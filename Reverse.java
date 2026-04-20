import java.util.*;
class Reverse
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int a[]=new int[5];
        int i;
        for(i=0;i<5;i++)
        {
            System.out.println("Enter a number");
            a[i]= in.nextInt();
            

        }
        for(i=4;i>=0;i--)
        {
            System.out.println(a[i]);
            
        }
        
    }
}