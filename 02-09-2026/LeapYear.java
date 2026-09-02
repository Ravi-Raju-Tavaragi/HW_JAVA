import java.util.Scanner;


public class LeapYear
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year to check :");
        int year = sc.nextInt();

        if(year % 4 == 0)
        {
            if(year % 100 == 0)
            {
                if(year % 400 == 0)
                {
                    System.out.println("Is leap Year");
                }
                else
                {
                    System.out.println("Is not a leap year");
                }
            }
            else
            {
                System.out.println("Is a leap year");
            }
        }
        else
        {
            System.out.println("Is not a leap year");
        }
        sc.close();

    }
}
