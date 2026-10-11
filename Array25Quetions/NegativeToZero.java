package Array25Quetions;

public class NegativeToZero
{
    static void converNegativeToZeoElement(int[] array)
    {
        if(array == null || array.length == 0)
            System.out.println("Array Empty or Null");

        for(int i = 0; i < array.length; i++)
        {
            if(array[i] < 0)
                array[i] = 0;
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
        int[] array = {5, -3, 8, -1, 0};
        System.out.println("Before");
        printArray(array);

        converNegativeToZeoElement(array);
        System.out.println("After");
        printArray(array);



        
    }
    
}
