package Array25Quetions;

public class DiffLargestSmallest
{
    public static int diferenceOfLargestAndSmallest(int array[])
    {
        if ( array == null || array.length == 0)
            return -1;

        int largest = array[0];
        int smalest = array[0];

        for(int i = 0; i < array.length; i++)
        {
            if(largest < array[i])
                largest = array[i];

            if(smalest > array[i])
                smalest = array[i];
        }

        int result;
        result = largest - smalest;
        return result;

    }



    public static void main(String[] args)
    {
        int array[] = {14, 3, 27, 9, 0};
        int result = diferenceOfLargestAndSmallest(array);
        System.out.println(result);


        
    }
    
}
