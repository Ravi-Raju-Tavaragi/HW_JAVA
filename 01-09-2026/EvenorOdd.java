import java.util.Scanner;

public class EvenorOdd
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Positive Number to Check :");
        int num = sc.nextInt();
        int result;

        result = num % 2;

        if(result == 0)
        {
            System.out.println("Number is Even Number");
        }
        else
        {
            System.out.println("Number is Odd Number");
        }
    sc.close();

    }
    
}
