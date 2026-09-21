package Functions;

import java.util.Scanner;

public class CheckPositiveNum 
{
    static boolean isPositive(int number)
    {
        return number > 0;
    }


    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println(isPositive(number));

        sc.close();
        
    }

    
}