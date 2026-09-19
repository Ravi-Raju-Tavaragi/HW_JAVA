package Functions;

import java.util.Scanner;

public class VootingEligibility
{
    static boolean isEligibleToVote(int age) 
    {
        if(age >= 18)
            return true;
        else
            return false;
    }



    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Candidate Age to Check : ");
        int age = sc.nextInt();

        boolean result = isEligibleToVote(age);

        if(result)
        {
            System.out.println("Candidate is Eligible to Vote");
        }
        else
        {
            System.out.println("Candidate is not Eligible to Vote");
        }

        sc.close();

        

    }
    
}
