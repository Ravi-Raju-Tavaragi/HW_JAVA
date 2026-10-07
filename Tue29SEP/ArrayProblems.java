package Tue29SEP;

public class ArrayProblems
{

    //Linear Search
    static boolean searchKey(int [] nums, int key)
    {
        if ( nums == null || nums.length == 0 )
            return false;

        for(int i = 0; i < nums.length; i++)
        {
            if ( key == nums[i] )
                return true;
        }
        return false;
    }



    //count even numbers
    static int countEvenNumbers(int[] nums)
    {
        if ( nums == null || nums.length == 0 )
            return 0;

        int count = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if ( nums[i] % 2 == 0 )
                count++;
        }
        return count;
    }






    public static void main(String[] args) 
    {
        int nums[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int key = 50;

        boolean result = searchKey(nums, key);
        System.out.println(result);
        int result1 = countEvenNumbers(nums);
        System.out.println(result1);

        

        
        
    }

    
}
