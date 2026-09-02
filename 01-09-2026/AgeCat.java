import java.util.*;

public class AgeCat
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age :");
        int age = sc.nextInt();

        if(age >= 4 && age <= 12)
        {
            System.out.println("User comes under CHILD catlog");
        }
        else if(age >= 13 && age <= 19)
        {
            System.out.println("User comes under TEEN catlog");
        }
        else if(age >= 20 && age <= 59)
        {
            System.out.println("User comes under ADULT catlog");
        }
        else if(age >= 60 && age <= 70)
        {
            System.out.println("User comes under SENIOR CITIZEN catlog");
        }
        else
        {
            System.out.println("Age limit Exeded or Your Not Eligible");
        }
    sc.close();
    }
    
}
