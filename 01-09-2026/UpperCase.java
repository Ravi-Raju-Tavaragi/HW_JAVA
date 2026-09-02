import java.util.Scanner;

public class UpperCase
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter single Character :");
        char val = sc.next().charAt(0);
        if(val >= 'A' && val <= 'Z')
        {
            System.out.println("Character is in UPPER CASE");
        }
        else
        {
            System.out.println("Character is in lower case");
        }
        
       sc.close(); 
    }
    
}
