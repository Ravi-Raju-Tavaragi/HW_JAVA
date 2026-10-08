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


    // Calaculata Average of set of integer numbers in an array
    static double findAverage(int[] nums)
    {
        if ( nums == null || nums.length == 0 )
            return -1;

        int sum = 0;
        double average = 0;

        for(int i = 0; i < nums.length; i++)
        {
            sum = sum + nums[i];
        }
        average = sum / nums.length;
        return average;
    }



    static void swapElements(int[] nums)
    {
        if ( nums == null || nums.length == 0 || nums.length == 1 )
            return;

        int leftIndex = 0;
        int rightIndex = nums.length-1;

        while (leftIndex <= rightIndex) 
        {
            int temp = nums[leftIndex];
            nums[leftIndex] = nums[rightIndex];
            nums[rightIndex] = temp;
            leftIndex++;
            rightIndex--;
        }

    }

    // Even and Odd Count in array
    static int[] countEvenOddNumbers(int[] nums)
    {
        if ( nums == null || nums.length == 0)
            return new int[] {0,0};

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
        return new int[] {evenCount, oddCount};
    }





    public static void main(String[] args) 
    {
        int nums[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int key = 50;

        boolean result1 = searchKey(nums, key);
        System.out.println(result1);

        int result2 = countEvenNumbers(nums);
        System.out.println(result2);

        double result3 = findAverage(nums);
        System.err.println(result3);

        swapElements(nums);
        for (int i = 0; i < nums.length; i++)
        {
            System.out.print(nums[i] + " ");
        }

        int[] result4 = countEvenOddNumbers(nums);
        System.out.print(result4[0]);
        System.out.print(result4[1]);


        
    }

    
}
