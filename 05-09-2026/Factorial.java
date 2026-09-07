import java.util.Scanner;

public class Factorial
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int index = sc.nextInt();
        int fact = 1;
        int i = 1;
        
        //using for loop
        /*for(int i = 1; i <= index; i++)
        {
            fact = fact * i;
            System.out.println(fact);
        }


       //using while loop 
       while (i <= index)
        {
            fact = i * fact;
            System.out.println(fact);
            i++;
        } */


        //using do-while loop
        do
        {
            fact = i * fact;
            System.out.println(fact);
            i++;
        }
        while(i <= index);
        sc.close();

    }
    
}
