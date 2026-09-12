package Sat12SEP;

public class MethodOverLoadingArea
{
    // Area of square
    static int area(int side)
    {
        return side * side;
    }

    // Area of rectangle
    static int area(int length, int breadth)
    {
        return length * breadth;
    }

    public static void main(String[] args)
    {
        System.out.println("Square Area = " + area(5));
        System.out.println("Rectangle Area = " + area(10, 5));
    }
}