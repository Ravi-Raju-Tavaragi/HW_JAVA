package Array25Quetions;

public class ArrayHalfDouble
{
    static void arrayEvenHalfOddDouble(int[] array)
    {
        if ( array == null || array.length == 0)
            System.out.println("array empty or null");

        for(int i = 0; i < array.length; i++)
        {
            if(array[i] % 2 == 0)
            {
                array[i] = array[i] / 2;
            }
            else
            {
                array[i] = array[i] * 2;
            }
        }
        
    }

    public static void printArray(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i]+",");
        }
    }



    public static void main(String[] args) 
    {
        int array[] = {4, 7, 10, 3};
        System.out.println("Before array");
        printArray(array);

        arrayEvenHalfOddDouble(array);
        System.out.println("After array");
        printArray(array);
        
    }
    
}
