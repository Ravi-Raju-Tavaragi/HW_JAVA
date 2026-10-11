package Array25Quetions;

public class DivisibleBy3and5
{
    public static int divisiblebyThreeandFiveCount(int[] array)
    {
        if ( array == null || array.length == 0)
            return -1;

        int count = 0;
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] % 3 == 0 && array[i] % 5 == 0)
                count++;
        }
        return count;
    }




    public static void main(String[] args) 
    {
        int[] array = {15, 9, 30, 10, 45, 7};

        int result = divisiblebyThreeandFiveCount(array);
        System.out.println(result);
        
    }
    
}
