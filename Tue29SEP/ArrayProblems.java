package Tue29SEP;

public class ArrayProblems
{
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






    public static void main(String[] args) 
    {
        int nums[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int key = 50;

        searchKey(nums, key);

        

        
        
    }

    
}
