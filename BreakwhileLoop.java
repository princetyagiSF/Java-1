class BreakWhileLoop
{
    public static void main(String[]args)
    {
        int i=1;
        while(i<=5)
        {
            if(i==5)
            {
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}