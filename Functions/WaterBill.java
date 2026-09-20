package Functions;

import java.util.Scanner;

public class WaterBill
{
    static double standardWaterBill()
    {
        return 7.00;
    }



    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter water quantity: ");
        double quantity = sc.nextDouble();

        double bill = quantity * standardWaterBill();

        System.out.println("Water Bill = " + bill);

        sc.close();
    }
    
}
