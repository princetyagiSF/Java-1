import java.util.Scanner;
class SecondMinNo
{
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        int Min=32768,SecondMin=32768;
        int n=obj.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the value in array");
        for(int i=0;i<a.length;i++)
        {
         a[i]=obj.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<Min)
                Min=a[i];
        }
        for(int i=0;i<a.length;i++)
        {
        if(a[i]!=Min  &&  a[i]<SecondMin)
            SecondMin=a[i];
        }
        System.out.println("Second minimum number in an array="+SecondMin);
    }
}