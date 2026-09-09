package LoopPractice;

import java.util.Scanner;

public class PositiveNegativeZero
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i <= 10; i++)
        {
            System.out.println("Enter Number :"+ i + ":");
            int num = sc.nextInt();

            if(num > 0)
            {
                System.out.println("Positive");
            }

            else if(num < 0)
            {
                System.out.println("Negative");
            }

            else
            {
                System.out.println("Zero");
            }
        }
        sc.close();
    }
    
}
