class Example13
{
    public static void main(String[]args)
    {
        byte a=(byte)5.0;
        short b=25;
        int c=3;
        float d=1.0f;
        double e=2.0;
        short f=(short)(e*d+c+b/a);
        System.out.println(f);           
    }
}