/**
 * Name: Megha Roy Chowdhury
 * Unique ID: 7783754
 */
// Objective : Decimal to octal conversion
// Implementation
import java.util.*;//inclusion to java util package
class dto
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int d,s,r,i;
        double a,n;
        String z,y,t="";
        System.out.println("Enter a decimal number");
        n=in.nextDouble();//accepting a decimal number from the user
        z=n+"";//conversion to string
        r=z.indexOf('.');//index of decimal
        y=z.substring(r);//lenght of number after decimal
        a=Double.valueOf(y);//converting to decimal
        while(n>0)
        {
            d=(int)n%8;//conversion to octal
             t=t+d;//storing
            n=(int)n/8;
        }
        if(a>0.0)
        {
            t=t+'.';
            for(i=1;i<=5;i++)
            {
                a=a*8;//conversion to octal
                s=(int)a;
                t=t+s;//storing
                if(a==1.00)
                break;
                a=a-s;
            }
        }
        System.out.println("Equivalent octal = "+t);
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
 *       t                String     to store the octal equivalent
 *       y                String     to store the remaining value
 *       z                String     to convert to string
 *       i                 int       for loop
 */
/*
 * Enter a decimal number
 * 0.375
 * Equivalent octal = 0.30000
 * Enter a decimal number
 * 0.015625
 * Equivalent octal = 0.01
 */