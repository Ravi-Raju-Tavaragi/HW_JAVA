package CharacterArray25Questins;

public class RemoveVowels 
{
    static char[] removeVowels(char[] chars)
    {
        if (chars == null)
            return new char[0];

        int count = 0;

        for (int i = 0; i < chars.length; i++)
        {
            if (chars[i] != 'a' && chars[i] != 'e' &&
                chars[i] != 'i' && chars[i] != 'o' &&
                chars[i] != 'u')
                count++;
        }

        char[] result = new char[count];
        int index = 0;

        for (int i = 0; i < chars.length; i++)
        {
            if (chars[i] != 'a' && chars[i] != 'e' &&
                chars[i] != 'i' && chars[i] != 'o' &&
                chars[i] != 'u')
            {
                result[index] = chars[i];
                index++;
            }
        }

        return result;
        }



    public static void main(String[] args) 
    {
        char[] str = {'p','r','o','g','r','a','m'};

        char[] result = removeVowels(str);
        for(int i = 0; i < result.length; i++)
        {
            System.out.print(result[i]+", ");
        }

        
    }
    
}
