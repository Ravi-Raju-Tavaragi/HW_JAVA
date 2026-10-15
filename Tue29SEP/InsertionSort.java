package Tue29SEP;

public class InsertionSort
{
    public static void insertionSort(int[] array)
    {
        if(array == null || array.length == 0)
            System.out.println("array null or empty");

        for(int i = 1; i < array.length; i++)
        {
            int key = array[i];
            int j = i - 1;

            while(j >= 0 && array[j] > key)
            {
                array[j+1] = array[j];
                j--;
            }

            array[j+1] = key;
            
        }
    }

     public static void printArray(int[] array)
    {
        for(int value : array)
        {
            System.out.print(value+", ");
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
        //int[] array = {8, 7, 6, 5, 4};
        int[] array = {-1, -5, -3, 0, -4, -2, -2};

        System.out.println("Before Sorting");
        printArray(array);
        insertionSort(array);
        System.out.println("After Bubble sort");
        printArray(array);
        
    }
    
}
