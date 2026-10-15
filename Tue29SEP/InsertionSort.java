package Tue29SEP;

public class InsertionSort
{
    public static void insertionSort(int[] array)
    {
        if(array == null || array.length == 0)
            System.out.println("array null or empty");

        for(int i = 1; i < array.length - 1; i++)
        {
            int key = array[i];
            int j = i - 1;

            while(j >= 0 && array[i] > key)
            {
                array[j+1] = array[j];
                j--;
            }

            array[j] = key;
            
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
        int[] array = {8, 7, 6, 5, 4};
        
    }
    
}
