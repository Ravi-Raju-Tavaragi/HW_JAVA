package Festival_Work;

import java.util.Scanner;

public class PercentageCallsTotalMarks
{
    static int totalMarks(int m1, int m2, int m3, int m4, int m5) 
    {
        return m1 + m2 + m3 + m4 + m5;
    }


    static double percentage(int m1, int m2, int m3, int m4, int m5) 
    {
        return totalMarks(m1, m2, m3, m4, m5) / 500.0 * 100;
    }

    

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter five marks: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int m5 = sc.nextInt();

        System.out.println(percentage(m1, m2, m3, m4, m5) + "%");

        sc.close();
        
    }
    
}
