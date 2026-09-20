package Functions;

import java.util.Scanner;

public class ValidMobileNumber
{
    static boolean isValidMobile(String number) 
    {
        return number.length() == 10 && number.charAt(0) >= '6' && number.charAt(0) <= '9';
    }




    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mobile number: ");
        String number = sc.nextLine();

        if (isValidMobile(number))
        {
            System.out.println("Valid mobile number");
        }
        else
        {
            System.out.println("Invalid mobile number");
        }

        sc.close();

    }
    
}
