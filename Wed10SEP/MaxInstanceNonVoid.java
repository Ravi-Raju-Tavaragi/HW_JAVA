package Wed10SEP;

import java.util.Scanner;

public class MaxInstanceNonVoid 
{
    int maxOf(int a, int b, int c)
    {
        if(a>b)
           return a;
        else if(b>c)
            return b;
        else if(c>a)
            return c;
        else
            return 0;
    }


    public static void main(String[]args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Three Numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        MaxInstanceNonVoid obj = new MaxInstanceNonVoid();
        int largest = obj.maxOf(a,b,c);
        System.out.println(largest +" is the max number");
        sc.close();
    }
    
}
