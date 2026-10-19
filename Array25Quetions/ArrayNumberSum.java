package Array25Quetions;

public class ArrayNumberSum
{
    public static int[] numberSum(int[] array)
    {
        if (array == null || array.length == 0)
            return new int[] {-1};

        int[] result = new int[array.length];

        for (int i = 0; i < array.length; i++)
        {
            int number = array[i];
            int sum = 0;

            while (number > 0)
            {
                int digit = number % 10;
                sum = sum + digit;
                number = number / 10;
            }

            result[i] = sum;
        }

        return result;
    }

    public static void main(String[] args)
    {
        int[] array = {123, 45, 9};

        int[] result = numberSum(array);

        for(int i = 0; i < result.length; i++)
        {
            System.out.print(result[i] + ",");
        }
    }
}