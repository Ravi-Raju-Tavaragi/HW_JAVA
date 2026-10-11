package Array25Quetions;

public class DiffLargestSmallest
{
    public static int diferenceOfLargestAndSmallest(int array[])
    {
        if ( array == null || array.length == 0)
            return -1;

        int largest = 0;
        int smalest = array[0];

        for(int i = 0; i < array.length; i++)
        {
            if(largest < array[i])
                largest = array[i];
        }

        for(int j = 0; j < array.length; j++)
        {
             if(smalest > array[j])
                smalest = array[j];
        }

        int result;
        result = largest - smalest;
        return result;

    }



    public static void main(String[] args)
    {
        int array[] = {14, 3, 27, 9};
        int result = diferenceOfLargestAndSmallest(array);
        System.out.println(result);


        
    }
    
}
