package Festival_Work;

import java.util.Scanner;

public class ElectricBill
{
    static double calculateBill(int units) 
    { 
        if(units <= 100) 
        {
            return units * 3; 
        } 
        else if(units <= 200) 
        { 
            return 100 * 3 + (units - 100) * 5; 
        } 
        else if(units <= 300) 
        { 
            return 100 * 3 + 100 * 5 + (units - 200) * 7; 
        } 
        else 
        { 
            return 100 * 3 + 100 * 5 + 100 * 7 + (units - 300) * 10; 
        } 
    }




    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Enter units: "); 
        int units = sc.nextInt(); 
        
        double bill = calculateBill(units); 
        System.out.println("Bill Amount: " + bill); 
        
        sc.close();
        
    }
    
}
