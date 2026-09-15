package Festival_Work;

import java.util.Scanner;

public class AreaOfSquareCallsSquare
{
    static int square(int n) 
    {
        return n * n;
    }
    static int areaOfSquare(int side) 
    {
        return square(side);
    }




    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side: ");
        int side = sc.nextInt();

        System.out.println(areaOfSquare(side));

        sc.close();
        
    }
    
}
