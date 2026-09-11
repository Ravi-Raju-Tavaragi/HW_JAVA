package Wed10SEP;

import java.util.Scanner;

public class SquareNonVoid 
{
    static int square(int a)
    {
        return a = a * a;
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
