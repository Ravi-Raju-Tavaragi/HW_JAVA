package Wed10SEP;

import java.util.Scanner;

public class SquareStaticVoid 
{
    static void square(int a)
    {
        System.out.println("Square of Number ="+(a*a));
    }


    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int a = sc.nextInt();

        square(a);
        sc.close();
        
    }
    
}
