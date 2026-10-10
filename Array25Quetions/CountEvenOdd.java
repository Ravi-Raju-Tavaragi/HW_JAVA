package Array25Quetions;

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
        return new int[]{evenCount, oddCount};
    }




    public static void main(String[] args) 
    {
        
    }
    
}
