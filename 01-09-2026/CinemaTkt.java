import java.util.*;

public class CinemaTkt
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age :");
        int age = sc.nextInt();
        System.out.println("Select Movie Type 2D/3D/IMAX :");
        String mov_type = sc.next();

        if(age >= 4 && age <= 12)
        {
            System.out.println("User comes under CHILD catlog Ticket");
        }
        else if(age >= 13 && age <= 19)
        {
            System.out.println("User comes under TEEN catlog Ticket");
        }
        else if(age >= 20 && age <= 59)
        {
            System.out.println("User comes under ADULT catlog Ticket");
        }
        else
        {
            System.out.println("User Not Eligible to Watch Cinema");
        }

        switch (mov_type)
        {
            case "2D":
                System.out.println("2D movie type selected price per ticket is 200");
                break;
            
            case "3D":
                System.out.println("2D movie type selected price per ticket is 600");
                break;
        
            case "IMAX":
                System.out.println("2D movie type selected price per ticket is 1200");
                break;

            default:
                System.out.println("we don't have your choice");
        }
        sc.close();
    }
    
}
