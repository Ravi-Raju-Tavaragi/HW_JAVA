package Array25Quetions;

public class SumOfEvenPosition
{
    public static int somOfEvenPosition(int[] array)
    {
        if (array == null)
            return -1;

        if (array.length == 0)
            return 0;

        int sum = 0;
        for(int i = 0; i < array.length; i+=2)
        {
            sum = sum + array[i];
        }
        return sum;
        
    }





    public static void main(String[] args) 
    {
        int array[] = {10, 3, 20, 7, 30, 4, 5};

        int result = somOfEvenPosition(array);
        System.out.println(result);
    }
    
}
