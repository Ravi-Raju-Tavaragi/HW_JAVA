package Festival_Work;

import java.util.Scanner;

public class BankingMenuSystem
{
    static double balance = 10000; 

    static void checkBalance() 
    { 
        System.out.println("Balance: " + balance); 
    } 
    
    static void deposit(double amount) 
    { 
        balance = balance + amount; 
        System.out.println("Deposit successful"); 
        System.out.println("Balance: " + balance); 
    } 
    
    static void withdraw(double amount) 
    { 
        if(amount <= balance) 
        { 
            balance = balance - amount; 
            System.out.println("Withdrawal successful"); 
            System.out.println("Balance: " + balance); 
        } 
        else 
        { 
            System.out.println("Insufficient balance"); 
        } 
    }




    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in); 
        int choice; 
        
        do 
        { 
            System.out.println("\n--- Banking Menu ---"); 
            System.out.println("1. Check Balance"); 
            System.out.println("2. Deposit"); 
            System.out.println("3. Withdraw"); 
            System.out.println("4. Exit"); 
            System.out.print("Enter choice: "); 
            
            choice = sc.nextInt(); 
            
            switch (choice) 
            { 
                case 1: 
                checkBalance(); 
                break; 
                
                case 2: 
                System.out.print("Enter amount: "); 
                double d = sc.nextDouble(); 
                deposit(d); 
                break; 
                
                case 3: 
                System.out.print("Enter amount: "); 
                double w = sc.nextDouble(); 
                withdraw(w); 
                break;
                
                case 4: 
                System.out.println("Thank you."); 
                break; 
                
                default: 
                System.out.println("Invalid choice."); 
            } 
        } while (choice != 4); 
        
        sc.close();


    }
    
}
