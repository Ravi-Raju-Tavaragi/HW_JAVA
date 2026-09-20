package Functions;

import java.util.Scanner;

class BusiestandQuietest 
{
    static int[] highestAndLowest(int[] dailyCounts) 
    {
        int highest = 0;
       
        for (int i = 0; i < dailyCounts.length; i++)
        {
        if (dailyCounts[i] > highest)
        {
            highest = dailyCounts[i];
        }
        }


        int lowest = highest;

        for (int i = 0; i < dailyCounts.length; i++)
        {
        if (dailyCounts[i] < lowest)
        {
            lowest = dailyCounts[i];
        }
        }
        
        return new int[]{highest, lowest};
    }




    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int[] counts = new int[5];

        System.out.println("Enter 5 daily counts:");
        for (int i = 0; i < 5; i++) {
            counts[i] = sc.nextInt();
        }

        int[] result = highestAndLowest(counts);

        System.out.println("Highest: " + result[0]);
        System.out.println("Lowest: " + result[1]);

        sc.close();
    }

    
}