import java.util.Scanner;
public class EqualityOfTwoArray
{
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        boolean var=true;
        System.out.println("Enter the size of first array");
        int n=in.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the value in array");
        for(int i=0;i<a.length;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println("Enter the size of second array");
        n=in.nextInt();
        int b[]=new int[n];
        System.out.println("Enter the value in array");
        for(int i=0;i<b.length;i++)
        {
            b[i]=in.nextInt();
        }
        if(a.length==b.length)
        {
            for(int i=0;i<a.length;i++)
            {
                if(a[i]!=b[i])
                    var=false;
            }
        }
        else
           var=false;
        if(var)
            System.out.println("Arrays are equals");
        else
            System.out.println("Arrays are not equals");
    }
}
