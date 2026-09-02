import java.util.*;
public class ElecticBill
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total Consumed UITS :");
        int unit = sc.nextInt();
        int bill;

        if(unit >= 0 && unit <= 100)
        {
            bill = unit * 5;
            System.out.println("Total Electicity Bill Amount is :"+bill);
        }
        else if(unit >= 101 && unit <= 200)
        {
            bill = unit * 7;
            System.out.println("Total Electicity Bill Amount is :"+bill);
        }
        else if(unit >= 201 && unit <= 300)
        {
            bill = unit * 10;
            System.out.println("Total Electicity Bill Amount is :"+bill);
        }
        else if(unit > 300)
        {
            bill = unit * 15;
            System.out.println("Total Electicity Bill Amount is :"+bill);
        }
        else
        {
            System.out.println("Invalid Function");
        }
    sc.close();

    }
    
}
