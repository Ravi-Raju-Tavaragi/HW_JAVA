package Array25Quetions;

public class ArrayClosestNumber
{
    public static  int arrayAverageClosestNumberinArray(int[] array)
    {
        if ( array == null || array.length == 0)
            return -1;

        int sum = 0;
        int average = 0;

        for(int i = 0; i < array.length; i++)
        {
            sum = sum + array[i];
        }
        average = sum / array.length;

        int closestNumber = array[0];
        for(int j = 0; j < array.length; j++)
        {
            if(average == array[j])
                closestNumber = array[j];
            else if(average > array[j])
                closestNumber = array[j];
        }
        return closestNumber;
        
    }





    public static void main(String[] args) 
    {
        int array[] = {2, 9, 4, 15};

        int result = arrayAverageClosestNumberinArray(array);
        System.out.println(result);
        
    }
    
}
