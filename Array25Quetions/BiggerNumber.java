package Array25Quetions;

public class BiggerNumber
{
    static int[] biggerNumbers(int[] array1, int[] array2)
    {
        if (array1 == null || array2 == null || array1.length != array2.length)
            return new int[0];

        int[] result = new int[array1.length];

        for (int i = 0; i < array1.length; i++)
        {
            if (array1[i] > array2[i])
                result[i] = array1[i];
            else
                result[i] = array2[i];
        }

        return result;
    }


    public static void main(String[] args) 
    {
        int[] array1 = {4, 9, 2, 7};
        int[] array2 = {6, 3, 8, 7};
        
        int[] result = biggerNumbers(array1, array2);

        for(int i = 0; i < result.length; i++)
        {
            System.out.print(result[i] + ",");
        }
    }
    
}
