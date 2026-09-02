import java.util.Scanner;

public class LargestOfTwoNUM
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number :");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number :");
        int num2 = sc.nextInt();

        if(num1 > num2)
        {
            System.out.println("First Number is Largest Number");
        }
        else
        {
            System.out.println("Second Number is Largest Number");
        }
    sc.close();


    }
    
}
