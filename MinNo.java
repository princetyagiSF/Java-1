import java.util.Scanner;
class MinNo
{
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        int Min=32768;
        int a[]=new int[10];
        System.out.println("Enter 10 number");
        for(int i=0;i<a.length;i++)
        {
            a[i]=obj.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<Min)
                Min=a[i];
        }
        System.out.println("Minimum no in an array="+Min);
    }
}