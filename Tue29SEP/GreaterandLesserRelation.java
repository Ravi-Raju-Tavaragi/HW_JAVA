package Tue29SEP;

public class GreaterandLesserRelation
{
    static int[] countRelation(int[] nums)
    {
        if ( nums == null || nums.length == 0)
            return new int[] {-1};
    
        int[] count = new int[nums.length];
        int j = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > 50 && nums[i] < 100)
                {
                    count[j] = nums[i];
                    j++;
                }   
        }

        int[] result = new int[j];

        for (int i = 0; i < j; i++)
        {
            result[i] = count[i];
        }

        return result;
    }




    public static void main(String[] args) 
    {
        int array[] = {45, 67, 100, 52, 99, 120, 50};

        int[] result = countRelation(array);

        for (int i = 0; i < result.length; i++)
        {
            System.out.print(result[i] + " ");
        }

        
    }
    
}
