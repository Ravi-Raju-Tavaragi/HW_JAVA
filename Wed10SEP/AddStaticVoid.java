package Wed10SEP;

import java.util.Scanner;

public class AddStaticVoid 
{
    static void addTwoNum(int x, int y)
    {
        System.out.println("Sum ="+(x + y));

    }



    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();

        addTwoNum(a, b);
        sc.close();

    }
    
}
