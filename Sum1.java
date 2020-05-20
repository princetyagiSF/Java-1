import java.util.Scanner;
class Sum1
{
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        int Sum=0;
        int a[]=new int[10];
        System.out.println("Enter 10 number");
        for(int i:a)//for each style loop
        {
            a[i]=obj.nextInt();
        }
        for(int i:a)//for each style loop
        {
            Sum=Sum+a[i];
        }
        System.out.println("Sum of all no="+Sum);
    }
}