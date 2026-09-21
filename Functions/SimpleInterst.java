package Functions;

import java.util.Scanner;

public class SimpleInterst
{
    static double simpleInterest(double principal, double rate, double time)
    {
        return (principal * rate * time) / 100;
    }


    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal: ");
        double principal = sc.nextDouble();

        System.out.print("Enter rate: ");
        double rate = sc.nextDouble();

        System.out.print("Enter time: ");
        double time = sc.nextDouble();

        System.out.println("Simple Interest = " + simpleInterest(principal, rate, time));

        sc.close();
        
    }
    
}
