package Festival_Work;

import java.util.Scanner;

public class Countdown
{
    static void countdown(int n) 
    {
        for (int i = n; i >= 1; i--) 
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }   

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int n = sc.nextInt();

        countdown(n);

        sc.close();
        
    }
    
}
