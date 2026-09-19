package Functions;

import java.util.Scanner;

public class CityBusFare
{
     static double busFare(double distanceKm, boolean isSeniorCitizen) 
     {
        double fare = 10 + 2 * distanceKm;

        if (isSeniorCitizen) 
        {
            fare = fare / 2;
        }
        return fare;
    }
 


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Distance in KM :");
        double distancekm = sc.nextDouble();

        System.out.println("Are you a Senior Citizen? (true/false):");
        boolean isSeniorCitizen = sc.nextBoolean();


        double result = busFare(distancekm, isSeniorCitizen);
        System.out.println(result);

        sc.close();

    }
    
}
