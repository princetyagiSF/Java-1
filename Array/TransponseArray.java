import java.util.Scanner;
class TwoDimensionalArray9
{
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        System.out.println("Enter the value in array");
        for(int i=0;i<3;i++)
                
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=obj.nextInt();
            }
        }
        System.out.println("Transponse of  a array");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                b[i][j]=a[j][i];
                System.out.println("b["+i+"]["+j+"]="+b[i][j]);
            }
        }     
    }
}
