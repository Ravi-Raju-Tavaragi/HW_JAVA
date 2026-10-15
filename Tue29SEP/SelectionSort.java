package Tue29SEP;

public class SelectionSort 
{
    public static void selectionSort(int[] array)
    {

        for(int i = 0; i < array.length - 1; i++)
        {
            int minValue = array[i];
            int minIndex = i;
            
            for(int j = i+1; j < array.length; j++)
            {
                if(array[j] < minValue)
                {
                    minValue = array[j];
                    minIndex = j;
                }
            }

        int temp = array[i];
        array[i] = array[minIndex];
        array[minIndex] = temp;
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
        int[] array = {9, 2, 16, 6, 13};
        System.out.println("Before selection sort");
        printArray(array);

        System.err.println("After selection sort");
        selectionSort(array);
        printArray(array);
        
    }
    
}
