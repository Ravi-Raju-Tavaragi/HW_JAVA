package Festival_Work;

import java.util.Scanner;

public class UserLogin
{
    static boolean isValidLogin(String username, String password) 
    {
        return username.equals("admin") && password.equals("java123");
    }


    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (isValidLogin(username, password)) 
        {
            System.out.println("Login Successful");
        } 
        else 
        {
            System.out.println("Login Failed ");
        }
        
        sc.close();


    }
    
}
