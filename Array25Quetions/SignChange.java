package Array25Quetions;

public class SignChange
{
    static int countSignChanges(int[] nums)
    {
        if (nums == null || nums.length < 2)
            return 0;

        int count = 0;

        for (int i = 1; i < nums.length; i++)
        {
            if ((nums[i - 1] > 0 && nums[i] < 0) ||
                (nums[i - 1] < 0 && nums[i] > 0))
            {
                count++;
            }
        }

        return count;
    }



    public static void main(String[] args) 
    {
        int[] nums ={3, -2, -5, 4, 6, -1};
        System.out.println(countSignChanges(nums));
        
    }
    
}
