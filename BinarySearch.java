import java.util.Scanner;
class BinarySerach
{
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        int Element,beg,end,mid;
        beg=0;
        end=9;
        int a[]=new int[10];
        System.out.println("Enter the value in array");
        for(int i=0;i<a.length;i++)
        {
            a[i]=obj.nextInt();
        }
            System.out.println("Enter the element to be searched");
            Element=obj.nextInt();
        while(beg<=end)
                {
                     mid=(beg+end)/2;
                    if(Element>a[mid])
                        beg=mid+1;
                    else if(Element<a[mid])
                        end=mid-1;
                    else
                    {
                        System.out.println("Element is found at index="+mid);
                        break;
                    }
               }
        if(beg>end)
           System.out.println("Element is not found");
    }
}
