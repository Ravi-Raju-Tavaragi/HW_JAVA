package Festival_Work;

import java.util.Scanner;

public class EmployeeSalary
{
    static double grossSalary(double basic, double hra, double da) 
    {
        return basic + hra + da;
    }



    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic: ");
        double basic = sc.nextDouble();

        System.out.print("Enter HRA: ");
        double hra = sc.nextDouble();

        System.out.print("Enter DA: ");
        double da = sc.nextDouble();

        System.out.println("Gross Salary: " + grossSalary(basic, hra, da));


        sc.close();

        
    }
    
}
