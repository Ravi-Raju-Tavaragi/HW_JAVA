package CharacterArray25Questins;

public class ReturnPosition
{
    static int[] findIndexes(char[] chars, char target)
    {
        if (chars == null)
            return new int[0];

        int count = 0;

        for (int i = 0; i < chars.length; i++)
        {
            if (chars[i] == target)
                count++;
        }

        int[] result = new int[count];
        int index = 0;

        for (int i = 0; i < chars.length; i++)
        {
            if (chars[i] == target)
            {
                result[index] = i;
                index++;
            }
        }

        return result;
    }



    public static void main(String[] args) 
    {
        char[] str = {'h','e','l','l','o'};
        char target = 'l';

        int[] result = findIndexes(str, target);

        for(int i = 0; i < result.length; i++)
        {
            System.out.print(result[i]+", ");
        }

        
    }
    
}
