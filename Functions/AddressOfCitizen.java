package Functions;

import java.util.Scanner;

public class AddressOfCitizen
{
    String name;
    String houseNumber;
    String street;
    int wardNumber;
    int pinCode;

    AddressOfCitizen(String name, String houseNumber, String street, int wardNumber, int pinCode)
    {
        this.name = name;
        this.houseNumber = houseNumber;
        this.street = street;
        this.wardNumber = wardNumber;
        this.pinCode = pinCode;
    }

    String addressLabel()
    {
        return name + ", #" + houseNumber + ", " + street
                + ", Ward " + wardNumber + ", Bengaluru - " + pinCode;
    }



    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter House Number: ");
        String houseNumber = sc.nextLine();

        System.out.print("Enter Street: ");
        String street = sc.nextLine();

        System.out.print("Enter Ward Number: ");
        int wardNumber = sc.nextInt();

        System.out.print("Enter PIN Code: ");
        int pinCode = sc.nextInt();

        AddressOfCitizen c = new AddressOfCitizen(name, houseNumber, street, wardNumber, pinCode);

        System.out.println("\nAddress:");
        System.out.println(c.addressLabel());

        sc.close();
        
    }
    
}
