package Functions;

import java.util.Scanner;

public class GradeLetterForStudent
{
    static char gradeForStudent(double percentage) 
    {
        if (percentage >= 90) 
        {
            return 'A';
        } 
        else if (percentage >= 75) 
        {
            return 'B';
        } 
        else if (percentage >= 60) 
        {
            return 'C';
        } 
        else if (percentage >= 40) 
        {
            return 'D';
        } 
        else 
        {
            return 'F';
        }
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Percentage Of Student :");
        double percentage = sc.nextDouble();

        char result = gradeForStudent(percentage);
        System.out.println("Grade obtained by Student : " + result);


        sc.close();
    }
    
}
