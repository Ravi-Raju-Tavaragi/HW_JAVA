package Festival_Work;

import java.util.Scanner;

public class CubeCallsSquare
{
    static int square(int n) 
    {
        return n * n;
    }
    
    
    static int cube(int n) 
    {
        return square(n) * n;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.println(cube(n));

        sc.close();
        
    }
    
}
