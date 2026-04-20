/**
 * Name: Megha Roy Chowdhury
 * Unique ID: 7783754
 */
// Objective : Decimal to binary conersion
// Implementation
import java.util.*;//inclusion to java util package
class dtb
{
    public static void main()
    {
    Scanner in=new Scanner(System.in);
        int d,s,r,i,j;
        double a,n;
        String z, y,t="";
        System.out.println("Enter a decimal number");
        n=in.nextDouble();//accepting a decimal number from the user
        z=n+"";//conversion to string
        r=z.indexOf('.');//index of decimal
        y=z.substring(r);//lenght of number after decimal
        a=Double.valueOf(y);//converting to decimal
        while(n>0)
        {
            d=(int)n%2;//conversion to binary
             t=d+t;//storing
            n=(int)n/2;
        }
        if(a>0.0)
        {
            t=t+'.';
            for(i=1;i<=5;i++)
            {
                a=a*2;//converting to decimal
                s=(int)a;
                t=t+s;//storing
                if(a==1.00)
                break;
                a=a-s;
            }
        }
        System.out.println("Equivalent binary = "+t);
    }
}
/**
 * Variable description
 * Name of the variable  Datatype      Purpose
 *       r                 int       to get the index value
 *       n                double     to accept a number from user
 *       s                 int       to store the number
 *       d                 int       to get the remaining numbers
 *       a                double     conversion to string
 *       t                String     to store the binary equivalent
 *       y                String     to store the remaining value
 *       z                String     to convert to string
 *       i                 int       for loop
 */
/*
 * Enter a decimal number
 * 35.35
 * Equivalent binary = 110001.01011
 * Enter a decimal number
 * 35
 * Equivalent binary = 110001
 */