package Functions;

import java.util.Scanner;

public class RectangleArea
{
    static double rectangleArea(double length, double width)
    {
        return length * width;
    }


    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter width: ");
        double width = sc.nextDouble();

        System.out.println("Area = " + rectangleArea(length, width));

        sc.close();
        
    }
    
}
