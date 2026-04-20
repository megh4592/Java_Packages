/**
 * Name: Megha Roy Chowdhury
 * Unique ID: 7783754
 */
// Objective : Addition and subtraction using 2's compliment
// Implementation
import java.util.*;//inclusion of java util package
class o2s//declaring class
{
    void c1(String n1,String n2,int m)//function for calculation
    {
        int c=0,s,i,p1,p2;//declaring variables
        String o="";//declaring variables
        for(i=m-1;i>=0;i--)
        {
            if(Character.isDigit(n1.charAt(i))==true)
            {
            p1=(int)n1.charAt(i)-48;//extracting character
            p2=(int)n2.charAt(i)-48;//extracting character
            s=p1+p2+c;//calculating
            if(s==2)
            {
                s=0;//sum
                c=1;//carry
            }
            else if(s==3)
            {
                s=1;//sum
                c=1;//carry
            }
            else
            c=0;//carry
             o=s+o;//storing result
            }
            else
            o="."+o;//storing result
        }
        System.out.println("Answer = "+o);
    }
    String comp(String n,String t)//function for finding 2's compliment
    {
        char p;//declaring variables
        int i,c=1,s,k;//declaring variables
        
        for(i=0;i<n.length();i++)
        {
            p=n.charAt(i);
            if(p=='0')
            t=t+'1';
            else if(p=='1')
            t=t+'0';
            else
            t=t+p;
        }
        n=t;
        t="";
        for(i=n.length()-1;i>=0;i--)
        {
            if(Character.isDigit(n.charAt(i))==true)//condition
            {
            k=n.charAt(i)-48;//extracting character
            s=k+c;//add
            if(s==2)
            {
                s=0;//sum
                c=1;//carry
            }
            else if(s==3)
            {
                s=1;//sum
                c=1;//carry
            }
            else
            c=0;//carry
            t=s+t;//result
            }
            else
            t="."+t;//result
        }
        
        return t;//returning as required
        }
       String dtb(double n)//function for conversion
       {
        int d,s,r,i,j;//declaring variables
        double a;//declaring variables
        String z, y,t="";//declaring variables
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
                a=a-s;
            }
         }
         return t;//returning as required
        }
        public static void main()
    {
        Scanner in=new Scanner(System.in);
        double n1,n2;//declaring variables
        int f1=0,f2=0,i,j,m,l1,l2;//declaring variables
        String e,l;//declaring variables
        System.out.println("Enter two decimal numbers");
        n1=in.nextDouble();//accepting input
        n2=in.nextDouble();//accepting input
        o2s obj=new o2s();//creating object
        if(n1<0)
        {
            f1=1;
            n1=Math.abs(n1);
            e=obj.dtb(n1);//calling function
            e=obj.comp(e,"1");//calling function
        }
        else
        e="0"+obj.dtb(n1);//calling function
        l1=e.length();//storing length
        if(n2<0)
        {
            f2=1;
            n2=Math.abs(n2);
            l=obj.dtb(n2);//calling function
            l=obj.comp(l,"1");//calling function
        }
        else
        l="0"+obj.dtb(n2);//calling function
        l2=l.length();//storing length
        if(l1>l2)
        {
        m=l1;
        j=l1-l2;//differnce of length
        for(i=0;i<j;i++)
        l=l.charAt(0)+l;//filling spaces
        }
        else
        {
        m=l.length();//storing length
        j=l2-l1;
        for(i=0;i<j;i++)
        e=e.charAt(0)+e;//filling spaces
        }
        System.out.println("Binary forms of "+n1+" is = "+e);//printing as required
        System.out.println("Binary forms "+n2+" is = "+l);//printing as required
        System.out.println("Enter 1 for addition and 2 for subtraction");//printing statement
        int ch=in.nextInt();//accepting choice
        if(ch==2 && f2==0)
        l=obj.comp(l,"");//calling function
        obj.c1(e,l,m);
    }//main close
}//class close
/**
 * Variable description
 * Name of the variable  Datatype      Purpose
 *       n1               double     to accept number from user
 *       n2               double       to accept number from user
 *       ch                int       to accept choice from user
 *       f1                int       to find if no is negative
 *       f2                int       to find if no is negative
 *       i                 int       for loop
 *       s                 int       to store the sum
 *       j                 int       to store difference in length
 *       m                 int       to store the max length
 *       e                String     to store the number in required form
 *       l                String     to store the number in required form
 *       l1                int       to store the length
 *       l2                int       to store the length
 *       o                String     to calculate the operation of the two
 *       c                 int       to store he carry
 *       r                 int       to get the index value
 *       n                double     to get number from user
 *       s                 int       to store the number
 *       d                 int       to get the remaining numbers
 *       a                double     conversion to string
 *       t                String     to store the binary equivalent
 *       y                String     to store the remaining value
 *       z                String     to convert to string
 *       i                 int       for loop
 **/
/*
Enter two decimal numbers
-7
3
Binary forms of 7.0 is = 1001
Binary forms 3.0 is = 0011
Enter 1 for addition and 2 for subtraction
1
Answer = 1100
Enter two decimal numbers
-7
3
Binary forms of 7.0 is = 1001
Binary forms 3.0 is = 0011
Enter 1 for addition and 2 for subtraction
2
Answer = 0110
Enter two decimal numbers
2.5
3.5
Binary forms of 2.5 is = 010.10000
Binary forms 3.5 is = 011.10000
Enter 1 for addition and 2 for subtraction
2
Answer = 111.00000

 */