import java.util.Scanner;
class OddNo
{
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        int flag=0;
        int a[]=new int[10];
        System.out.println("Enter 10 number");
        for(int i=0;i<10;i++)
        {
            a[i]=obj.nextInt();
        }
        for(int i=0;i<10;i++)
        {
            if(a[i]%2!=0)
            {
                System.out.println("Odd no="+a[i]);
                flag++;
            }
        }
        if(flag==0)
            System.out.println("Odd number not found");
        else
            System.out.println("Total odd number found="+flag);
    }
}
    