import java.util.Scanner;
class SubtractionOfTwoOneDimensionalArray 
{
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        int a[]=new int[10];
        int b[]=new int[10];
        int c[]=new int[10];
        System.out.println("Enter the value in first array");
        for(int i=0;i<10;i++)
        {
            a[i]=obj.nextInt();
        }
        System.out.println("Enter the value in second array");
        for(int i=0;i<10;i++)
        {
            b[i]=obj.nextInt();
        }
        System.out.println("Value in new array");
        for(int i=0;i<10;i++)
        {
         c[i]=a[i]-b[i];   
          System.out.println("c["+i+"]="+c[i]);
        }
    }
}
