import java.util.Scanner;

public class AllRadix
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        String num = sc.next();
        boolean binary = true;
        boolean octal = true; 
        boolean decimal = true;
        boolean Hexa_decimal = true;

        //binary
        for(int i = 0; i <= num.length()-1; i++)
        {
            char ch = num.charAt(i);
            if((ch >= '0' && ch <= '1'))
            {
                binary = false;
                break;
            }
        }
        if(binary)
        {
            System.out.println("Yes it is Binary and Radix(Base) is 2");
        }
        else
        {
            System.out.println("No it is not Binary");
        }

        //octal
        for(int i = 0; i <= num.length()-1; i++)
        {
            char ch = num.charAt(i);
            if((ch >= '0' && ch <= '7'))
            {
                octal = false;
                break;
            }
        }
        if(octal)
        {
            System.out.println("Yes it is Octal and Radix, Base is 8");
        }
        else
        {
            System.out.println("No This is not Octal Number");
        }
        
        //decimal
        for(int i = 0; i <= num.length()-1; i++)
        {
            char ch = num.charAt(i);
            if((ch >= '0' && ch <= '9'))
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

        //hexadecimal
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
