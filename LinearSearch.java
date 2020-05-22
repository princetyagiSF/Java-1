import java.util.Scanner;
class LinearSearch 
{
    public static void main(String[]args)
   {
     Scanner obj=new Scanner(System.in);
     int Element,flag=0;
     int a[]=new int[10];
     System.out.println("Enter the value in array");
     for(int i=0;i<a.length;i++)
     {
      a[i]=obj.nextInt();   
     }
     System.out.println("Enter the element to be searched");
     Element=obj.nextInt();
     for(int i=0;i<a.length;i++)
     {
         if(a[i]==Element)
         {
                flag++;
         }
     }
     if(flag==0)
         System.out.println("Element is not found");
     else
         System.out.println("Element to be search="+flag);
     }
}
    
