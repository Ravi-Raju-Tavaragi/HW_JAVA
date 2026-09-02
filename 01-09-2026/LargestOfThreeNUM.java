import java.util.*;
public class LargestOfThreeNUM
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number :");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number :");
        int num2 = sc.nextInt();
        System.out.println("Enter Third Number :");
        int num3 = sc.nextInt();

        if(num1 > num2)
        {
            System.out.println("First Number is Largest");
        }
        else if(num2 > num3)
        {
            System.out.println("Second Number is Largest");
        }
        else if(num3 > num1)
        {
            System.out.println("Third Number is Largest");
        }
        else
        {
            System.out.println("Invalid match");
        }
    sc.close();

    }
    
}
