package Functions;

import java.util.Scanner;

public class LargeNumber
{
    static int findLarger(int a, int b)
    {
        if (a > b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }




    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Larger number = " + findLarger(a, b));

        sc.close();
        
    }
    
}
