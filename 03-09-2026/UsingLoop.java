public class UsingLoop
{
    public static void main(String[]args)
    {
        System.out.println("Increment By 3 Numbers");
        for(int num = 1; num <= 50; num+=3)
        {
            System.out.println(num);
        }

        System.out.println("Decrement By 5 Numbers");
        for(int num1 = 100; num1 >= 0; num1-=5)
        {
            System.out.println(num1);
        }

        System.out.println("Printing numbers 1 to 100");
        for(int num3 = 1; num3 <= 100; num3++)
        {
            System.out.println(num3);
        }

        System.out.println("Print Squres of Number -->10");
        for(int num4 = 1; num4 <= 10; num4++)
        {
            int result = num4 * num4;
            System.out.println("Square of Number :"+result);
        }

        System.out.println("Print Cubes of Number -->10");
        for(int num5 = 1; num5 <= 10; num5++)
        {
            int result1 = num5 * num5 *num5;
            System.out.println("Cube of Number :"+result1);
        }

        System.out.println("Print Multiple of 5");
        for(int num6 = 1; num6 <=10; num6++)
        {
            int result3 = 5 * num6;
            System.out.println("5 multiple :"+result3);
        }

        System.out.println("Reverse Alphabet");
        for(char ch = 'Z'; ch >= 'A'; ch--)
        {
            System.out.println(ch);
        }

        System.out.println("Sum of N numbers");
        int result4 = 0;
        for(int num7 = 1; num7 <= 10; num7++)
        {
            result4 = result4 + num7;
            System.out.println("Sum of Numbers :"+result4);
        }

    }
    
}
