import java.util.*;
class wreverse
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int a[]=new int[5];
        int i=0;
        while(i<5)
        {
            System.out.println("Enter a number");
            a[i]= in.nextInt();
            i++;

        }
        i=4;
        while(i>=0)
        {
            System.out.println(a[i]);
            i--;
            
        }
        
    }
}