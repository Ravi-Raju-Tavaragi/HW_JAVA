package Array25Quetions;

public class StepCount
{
    static int[] stepBestDaysAndBest(int [] array, int avgStep)
    {
        if ( array == null || array.length == 0 )
            return new int[] {-1};

        int days = 0;
        int best = array[0];
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] > 10000)
                days++;
            
            if(array[i] > best)
                best = array[i];
        }
        return new int[] {days, best};

    }



    public static void main(String[] args) 
    {
        int array[] = {8000, 10500, 12000, 9000, 15000, 10900};
        int avgStep = 10000;

        int result[] = stepBestDaysAndBest(array, avgStep);
        System.err.println("["+result[0] +", " + result[1] +"]");

        
    }
    
}
