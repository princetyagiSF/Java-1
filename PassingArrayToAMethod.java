class PassingArrayToAMethod 
{
    public static void main(String[]args)
    {
        int a[]={45,76,10,43,54};
        min(a);
    }
    static void min(int a[])
    {
    int Min=a[0];
    for(int i=0;i<a.length;i++)
    {
        if(a[i]<Min)
            Min=a[i];
    }
    System.out.println(Min);
    }
}

            
 
