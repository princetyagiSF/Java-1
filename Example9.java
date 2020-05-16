class Example9
{
    public static void main(String[]args)
    {
        int a=10;
        {
            int a=20;
            System.out.println(a);
        }
        System.out.println(a);
    }
}
