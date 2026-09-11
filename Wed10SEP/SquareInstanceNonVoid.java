package Wed10SEP;

import java.util.Scanner;

public class SquareInstanceNonVoid 
{
    int square(int a)
    {
        return a = a * a;
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int a = sc.nextInt();

        SquareInstanceNonVoid obj = new SquareInstanceNonVoid();
        obj.square(a);
        sc.close();
    }
    
}
