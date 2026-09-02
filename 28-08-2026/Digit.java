public class Digit
{
    public static void main(String[]args)
    {
        int a = 786;
        int Digit1;
        int Digit2;
        int Digit3;

        Digit1 = a % 10;
        a = a / 10;

        Digit2 = a % 10;
        a = a / 10;

        Digit3 = a % 10;
        System.out.println("Converted Number into Digits are : "+a);
        System.out.println("Digit1 = "+Digit3);
        System.out.println("Digit1 = "+Digit2);
        System.out.println("Digit1 = "+Digit1);


    }
    
}
