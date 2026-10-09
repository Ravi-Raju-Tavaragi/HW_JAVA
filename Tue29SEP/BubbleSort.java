package Tue29SEP;

public class BubbleSort
{
    static void bubbleSort(int[] array)
    {
        if(array == null || array.length == 0)
            System.out.println("array null or empty");

        for(int i = 0; i < array.length - 1; i++)
        {
            for(int j = 0; j < array.length - 1; j++)
            {
                if(array[j] > array[j + 1])
                {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
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
        int[] array = {5, 4, 3, 2, 1};
        System.out.println("Before Sorting");
        printArray(array);
        bubbleSort(array);
        System.out.println("After Bubble sort");
        printArray(array);

        int[] array1 = {};
        System.out.println("Before Sorting");
        printArray(array1);
        bubbleSort(array1);
        System.out.println("After Bubble sort");
        printArray(array1);
        
        int[] array2 = {5, -4, -3, -2, 1};
        System.out.println("Before Sorting");
        printArray(array2);
        bubbleSort(array2);
        System.out.println("After Bubble sort");
        printArray(array2);

        int[] array3 = {5, -4, 3, 2, -1};
        System.out.println("Before Sorting");
        printArray(array3);
        bubbleSort(array3);
        System.out.println("After Bubble sort");
        printArray(array3);

        int[] array4 = {5};
        System.out.println("Before Sorting");
        printArray(array4);
        bubbleSort(array4);
        System.out.println("After Bubble sort");
        printArray(array4);

        int[] array5 = {-11, 5, 0, 5, 0};
        System.out.println("Before Sorting");
        printArray(array5);
        bubbleSort(array5);
        System.out.println("After Bubble sort");
        printArray(array5);

        


    }
    
}
