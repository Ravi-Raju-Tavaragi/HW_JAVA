package Functions;

import java.util.Scanner;

public class ShopReceipt
{
    static void printReceiptLine(String customerName, String itemName, int quantity, double unitPrice) 
    {
        double total = quantity * unitPrice;

        System.out.println(customerName + " | " + itemName + " | " + quantity + " x Rs " + unitPrice + " = Rs " + total);
    }



    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String customerName = sc.nextLine();

        System.out.print("Enter item name: ");
        String itemName = sc.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter unit price: ");
        double unitPrice = sc.nextDouble();

        printReceiptLine(customerName, itemName, quantity, unitPrice);

        sc.close();
    }
    
}
