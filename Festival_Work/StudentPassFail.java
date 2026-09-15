package Festival_Work;

import java.util.Scanner;

public class StudentPassFail
{
    static String checkResult(int marks) 
    {        
        if (marks >= 35) 
        {            
            return "Pass";        
        } 
        else 
        {            
            return "Fail";        
        }    
    }

    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);        
        System.out.print("Enter marks: ");        
        int marks = sc.nextInt();        
        
        System.out.println(checkResult(marks));        
        
        sc.close();

    }
    
}
