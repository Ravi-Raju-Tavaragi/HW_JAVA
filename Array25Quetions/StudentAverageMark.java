package Array25Quetions;

public class StudentAverageMark
{
    static double studentAverage(int[] nums)
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






    public static void main(String[] args) 
    {
        int nums[] = {70, 85, 90, 55};

        double result = studentAverage(nums);
        System.out.println(result);
        
    }
    
}
