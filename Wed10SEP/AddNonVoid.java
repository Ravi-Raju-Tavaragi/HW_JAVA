package Wed10SEP;

import java.util.Scanner;

public class AddNonVoid 
{
    static int addTwoNum(int x, int y)
    {
        return x = x + y;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = addTwoNum(a, b);
        System.out.println(result);
        sc.close();

        
    }
    
}
