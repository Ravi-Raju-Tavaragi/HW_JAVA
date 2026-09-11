package Wed10SEP;

import java.util.Scanner;

public class CountStaticNonVoid
{
    static int countOfNum(int num)
    {
      int count = 0;
       
      while (num > 0) 
      {
        num = num / 10;
        count++;
      }
      return count;

    }



    public static void main(String[]args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Number you want to count :");
       int num = sc.nextInt();

       int result = countOfNum(num);
       System.out.println(result);

       sc.close();

    }
    
}
