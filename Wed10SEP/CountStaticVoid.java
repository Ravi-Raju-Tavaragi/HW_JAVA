package Wed10SEP;

import java.util.Scanner;

public class CountStaticVoid 
{
    static void countOfNum(int num)
    {
      int count = 0;
       
      while (num > 0) 
      {
        num = num / 10;
        count++;
      }
      System.out.println(count);

    }


    public static void main(String[]args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Number you want to count :");
       int num = sc.nextInt();

       countOfNum(num);

       sc.close();
    }
    
}
