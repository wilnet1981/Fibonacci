class Fibonacci
{
    public static void main(String[] args)
    {
        long number=1;
        long previousNumber=0;
        long actualNumber=0;
        System.out.println("0");
        System.out.println("1");
        for(int i=1;i<=45;i++)
        {
            actualNumber=number+previousNumber;
            System.out.println(actualNumber);
            previousNumber=number;
            number=actualNumber;
        }
    }
}