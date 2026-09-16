package Festival_Work;

import java.util.Scanner;

public class StudentResultSystem
{
    static int totalMarks(int[] marks) 
    {
        int total = 0;
        for (int m : marks) 
        {
            total += m;
        }
        return total;
    }
    
    
    static double percentage(int total, int maxTotal) 
    {
        return (double) total / maxTotal * 100;
    }
    
    
    static char grade(double percent) 
    {
        if (percent >= 90) return 'A';
        else if (percent >= 75) return 'B';
        else if (percent >= 60) return 'C';
        else if (percent >= 35) return 'D';
        else return 'F';
    }
    
    
    static void displayResultCard(String name, int total, double percent, char grd) 
    {
        System.out.println("---- Result Card ----");
        System.out.println("Name: " + name);
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percent + "%");
        System.out.println("Grade: " + grd);
    }



    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        int[] marks = new int[n];

        System.out.println("Enter marks (out of 100 each):");

        for (int i = 0; i < n; i++) 
        {
            marks[i] = sc.nextInt();
        }

        int total = totalMarks(marks);

        double percent = percentage(total, n * 100);

        char grd = grade(percent);

        displayResultCard(name, total, percent, grd);
        
        sc.close();
    }
    
}
