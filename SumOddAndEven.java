import java.util.Scanner;
class SumOddAndEven
{
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        int Odd=0,Even=0;
        int a[]=new int[10];
        System.out.println("Enter 10 number");
        for(int i=0;i<a.length;i++)       
        {
            a[i]=obj.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
                Even=Even+a[i];
            else
                Odd=Odd+a[i];
        }
        System.out.println("Sum of all even no="+Even);
        System.out.println("Sum of all odd no="+Odd);
    }   
}
