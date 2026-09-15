package Festival_Work;

import java.util.Scanner;

public class AverageCallSum
{
    static int sum(int a, int b, int c)
    {
        return a + b + c;
    }
   
    
    static double average(int a, int b, int c) 
    {
        return sum(a, b, c) / 3.0;
    }


    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(average(a, b, c));

        sc.close();
        
    }
    
}
