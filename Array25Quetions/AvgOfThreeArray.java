package Array25Quetions;

public class AvgOfThreeArray
{
    static int[] averageOfArrays(int[] array1, int[] array2, int[] array3)
    {
        if (array1 == null || array2 == null || array3 == null ||
            array1.length == 0 || array2.length == 0 || array3.length == 0)
                return new int[] {-1};

        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;

        for (int i = 0; i < array1.length; i++)
            sum1 = sum1 + array1[i];

        for (int i = 0; i < array2.length; i++)
            sum2 = sum2 + array2[i];

        for (int i = 0; i < array3.length; i++)
            sum3 = sum3 + array3[i];

        int average1 = sum1 / array1.length;
        int average2 = sum2 / array2.length;
        int average3 = sum3 / array3.length;

        return new int[] {average1, average2, average3};
    }

    public static void main(String[] args) 
    {
        int array1[] = {10, 20, 30};
        int array2[] = {5, 15};
        int array3[] = {8, 8, 8, 8};

        int result[] = averageOfArrays(array1, array2, array3);
        for(int i = 0; i < result.length; i++)
        {
            System.out.print(result[i]+" ");
        }
    }
    
}
