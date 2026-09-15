package Festival_Work;

import java.util.Scanner;

public class PowerUsingMethod
{
    static int power(int base, int exponent) 
    {
        int result = 1;
        while (exponent > 0) 
        {
            result *= base;
            exponent--;
        }
        return result;
    }


    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = sc.nextInt();
        System.out.print("Enter exponent: ");
        int exponent = sc.nextInt();
        
        System.out.println(power(base, exponent));
        
        sc.close();
        
    }
    
}
