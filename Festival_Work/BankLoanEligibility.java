package Festival_Work;

import java.util.Scanner;

public class BankLoanEligibility
{
    static boolean isEligible(int age, double salary) 
    {        
        return (age >= 21 && salary >= 30000);    
    }


    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);        
        System.out.print("Enter age: ");        
        int age = sc.nextInt();        
        
        System.out.print("Enter salary: ");        
        double salary = sc.nextDouble();        
        
        if(isEligible(age, salary)) 
        {            
            System.out.println("Loan Approved");        
        } 
        else 
        {            
            System.out.println("Loan Rejected");        
        }        
        
        sc.close();
    }
    
}
