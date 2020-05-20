import java.util.Scanner;
class Sum
{
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        int a[]=new int[10];
        int Sum=0;
        System.out.println("Enter 10 number");
        for(int i=0;i<a.length;i++)
        {
            a[i]=obj.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            Sum=Sum+a[i];
        }
         System.out.println("Sum of all no="+Sum);
    }
}
        