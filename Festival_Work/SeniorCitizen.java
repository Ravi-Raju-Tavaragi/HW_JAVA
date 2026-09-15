package Festival_Work;

import java.util.Scanner;

public class SeniorCitizen 
{
    static String checkSeniorCitizen(int age) 
    {        
        if (age > 60) 
        {            
            return "Senior Citizen";        
        } 
        else 
        {            
            return "Not a Senior Citizen";        
        }    
    }




    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);        
        System.out.print("Enter age: ");        
        int age = sc.nextInt();       
        System.out.println(checkSeniorCitizen(age));        
        sc.close();

    }

    
}