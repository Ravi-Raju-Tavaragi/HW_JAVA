package Array25Quetions;

import java.util.Arrays;

public class CountEvenOdd
{
    static int[] countEvenOddNumbers(int[] nums)
    {
        if ( nums == null || nums.length == 0)
            return new int[] {-1};

        int evenCount = 0;
        int oddCount = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if ( nums[i] % 2 == 0)
            {
                evenCount++;
            }
            else
            {
                oddCount++;
            }
        }
        return new int[]{oddCount, evenCount};
    }




    public static void main(String[] args) 
    {
        int nums[] = {3, 8, 5, 12, 7};


        int result[] = countEvenOddNumbers(nums);
        System.out.println(Arrays.toString(result));
    }
    
}
