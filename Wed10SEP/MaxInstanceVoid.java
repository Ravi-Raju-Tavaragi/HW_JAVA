package Wed10SEP;

import java.util.Scanner;

public class MaxInstanceVoid
{
    void maxOf(int a, int b, int c)
    {
        if(a>b)
            System.out.println("a is max");
        else if(b>c)
            System.out.println("b is max");
        else if(c>a)
            System.out.println("c is max");
        else
            System.out.println("Invalid input");
    }



    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Three Numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        MaxInstanceVoid obj = new MaxInstanceVoid();
        obj.maxOf(a,b,c);
        sc.close();


    }
    
}
