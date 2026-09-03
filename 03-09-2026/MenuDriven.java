import java.util.Scanner;

public class MenuDriven
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("This is simple calculator for airhmatic operators only on Two Numbers");
        System.out.println("The Menu of the Calculator is");
        System.out.println("===============================");
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("Select operator +,-,*,/ :");
        String operator = sc.next();
        operator = operator.toUpperCase();
        System.out.println("Enter First Number :");
        double num1 = sc.nextDouble();
        System.out.println("Enter Second Number :");
        double num2 = sc.nextDouble();
        double result;

        switch (operator) 
        {
            case "ADD":
                result = num1 + num2;
                System.out.println("Addition ="+result);
                break;
            case "SUB":
                result = num1 - num2;
                System.out.println("Subtraction ="+result);
                break;
            case "MUL":
                result = num1 * num2;
                System.out.println("Multiplication ="+result);
                break;
            case "DIV":
                result = num1 / num2;
                System.out.println("Division ="+result);
                break;
            
        
            default:
                System.out.println("This operation is not possible");
        }
    sc.close();
        
    }
    
}
