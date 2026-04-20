import java.util.*;
class dreverse
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int a[]=new int[5];
        int i=0;
        do
        {
            System.out.println("Enter a number");
            a[i]= in.nextInt();
            i++;
        }
            while(i<5);

        
        i=4;
        do 
        {
            System.out.println(a[i]);
            i--;
            
        }
        while(i>=0);
    }
}