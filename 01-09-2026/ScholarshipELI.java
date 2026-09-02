import java.util.*;

public class ScholarshipELI
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Marks :");
        int marks = sc.nextInt();
        System.out.println("Is your family Income is less than 1Lackh true/false :");
        boolean income = sc.nextBoolean();

        if(marks >= 85)
        {
            if(income)
            {
                System.out.println("Your in Eligible catlog");
            }
            else
            {
                System.out.println("Sorry, your! eligible for Scholarship");
            }
            if(marks >= 85)
            {
                System.out.println("But, Your Eligible for admission");
            }
            else
            {
                System.out.println("Yor not eligible for both admission and scholarsip");
            }
        }
        else
        {
            System.out.println("Your credentials not match");
        }
    sc.close();
    }
    
}
