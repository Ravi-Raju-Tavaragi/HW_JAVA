package Array25Quetions;

public class ArrayIncreasing
{
    public static boolean isIncrasingOrder(int[] array)
    {
        if(array == null || array.length == 0)
            return false;

        int count = 0;
        for(int i = 0; i < array.length-1; i++)
        {
            if(array[i] < array[i+1])
                count++;
        }

        if(count == array.length-1)
            return true;

        return false;
    }





    public static void main(String[] args) 
    {
        int[] array = {2, 5, 2, 14};

        boolean result = isIncrasingOrder(array);
        System.err.println(result);

        
    }
    
}
