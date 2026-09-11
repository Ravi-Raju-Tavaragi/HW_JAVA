package Wed10SEP;

import java.util.Scanner;

public class CountInstanceNonVoid
{

    int countOfNum(int num)
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

       CountInstanceNonVoid obj = new CountInstanceNonVoid();
       int result = obj.countOfNum(num);
       System.out.println(result);

       sc.close();
    }
    
    
}
