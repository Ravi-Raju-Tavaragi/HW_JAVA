import java.util.Scanner;

public class ArmstrongNum
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int num = sc.nextInt();
        int temp = num;
        int reverse_1 = 0;
        while (num > 0)
        {
            int digit = num % 10;
            int reverse = digit * digit * digit;
            reverse_1 = reverse_1 + reverse;
            num = num / 10;
        }
        System.out.println(reverse_1);
        if(reverse_1 == temp)
        {
            System.out.println("Given number is Armstrong Number");
        }
        else
        {
            System.out.println("Not armstrong");
        }
        sc.close();

    }
    
}
