import java.util.Scanner;

public class Radixhexa
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        String num = sc.next();
        boolean Hexa_decimal = true;
        for(int i = 0; i <= num.length()-1; i++)
        {
            char ch = num.charAt(i);
            if((ch >= '0' && ch <= '9') && (ch >= 'A' && ch <= 'F') && (ch >= 'a' && ch <= 'f'))
            {
                Hexa_decimal = false;
                break;
            }
        }
            if(Hexa_decimal)
            {
                System.out.println("Yes it is hexa-decimal and Radix, Base is 16");
            }
            else
            {
                System.out.println("No This is not hexa-decimal Number");
            }
        sc.close();
    }
    
}
