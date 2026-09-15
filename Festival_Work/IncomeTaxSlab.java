package Festival_Work;

import java.util.Scanner;

public class IncomeTaxSlab
{   
    static String getTaxSlab(double income) 
    {
        if (income <= 25000) 
        {
            return "No Tax";
        } 
        else if (income <= 50000) 
        {
            return "5% Tax";
        } 
        else if (income <= 100000) 
        {
            return "20% Tax";
        } else 
        {
            return "30% Tax";
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter annual income: ");
        double income = sc.nextDouble();


        System.out.println(getTaxSlab(income));
        
        sc.close();
        
    }
    
}
