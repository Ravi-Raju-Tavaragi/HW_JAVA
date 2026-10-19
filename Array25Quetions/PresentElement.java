package Array25Quetions;

public class PresentElement
{
    static int[] notPresentNumber(int[] array1, int[] array2)
    {
        if (array1 == null || array2 == null)
            return new int[0];

        int[] temp = new int[array1.length];
        int j = 0;

        for (int i = 0; i < array1.length; i++)
        {
            boolean found = false;

            for (int k = 0; k < array2.length; k++)
            {
                if (array1[i] == array2[k])
                {
                    found = true;
                    break;
                }
            }

            if (found == false)
            {
                temp[j] = array1[i];
                j++;
            }
        }

        int[] result = new int[j];

        for (int i = 0; i < j; i++)
        {
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args)
    {
        int[] array1 = {1, 4, 6, 8, 10};
        int[] array2 = {4, 8, 12};

        int[] result = notPresentNumber(array1, array2);

        for (int i = 0; i < result.length; i++)
        {
            System.out.print(result[i] + " ");
        }
    }
}