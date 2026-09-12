package Sat12SEP;

public class MethodOverLoadingAdd
{
    // Method with 2 parameters
    static int add(int a, int b)
    {
        return a + b;
    }

    // Method with 3 parameters
    static int add(int a, int b, int c)
    {
        return a + b + c;
    }

    public static void main(String[] args)
    {
        System.out.println(add(10, 20));
        System.out.println(add(10, 20, 30));
    }
}