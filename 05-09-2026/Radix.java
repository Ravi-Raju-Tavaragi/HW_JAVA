import java.util.Scanner;

public class Radix
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        String num = sc.next();//"127"like word it is
        boolean decimal = true;//assume the nuber is decimal
        for(int i = 0; i <= num.length()-1; i++)
        {
            char ch = num.charAt(i);
            if(ch < '0' || ch > '9')
            {
                decimal = false;
                break;
            }
        }
            if(decimal)
            {
                System.out.println("Yes it is decimal and Radix, Base is 10");
            }
            else
            {
                System.out.println("No This is not decimal Number");
            }
        sc.close();
    }
    
}
