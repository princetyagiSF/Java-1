import java.util.Scanner;
class BreakForLoop1
{
    public static void main(String[]args)
    {
      Scanner obj=new Scanner(System.in);
      int i,Number;
      System.out.println("Enter the number");
      Number=obj.nextInt();
      for(i=2;i<Number;i++)
      {
          if(Number%i==0)
              break;
      }
      if(Number==i)
          System.out.println("Number is prime");
      else
          System.out.println("Number is not prime");
    }       
}