import java.util.*;

public class SimpleCalc 
{
    public static void main(String[]args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("This is simple calculator for airhmatic operators only on Two Numbers");
        System.out.println("Select operator +,-,*,/,% :");
        char operator = sc.next().charAt(0);
        System.out.println("Enter First Number :");
        double num1 = sc.nextDouble();
        System.out.println("Enter Second Number :");
        double num2 = sc.nextDouble();
        double result;

        switch (operator) 
        {
            case '+':
                result = num1 + num2;
                System.out.println("Addition ="+result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Subtraction ="+result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Multiplication ="+result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println("Division ="+result);
                break;
            case '%':
                result = num1 % num2;
                System.out.println("Moulus ="+result);
                break;
        
            default:
                System.out.println("This operation is not possible");
        }
    sc.close();
    }
    
}
