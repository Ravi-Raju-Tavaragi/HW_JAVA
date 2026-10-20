package CharacterArray25Questins;

public class MoveElement
{
    static char[] nextLetters(char[] chars)
    {
        if (chars == null)
            return new char[0];

        char[] result = new char[chars.length];

        for (int i = 0; i < chars.length; i++)
        {
            if (chars[i] == 'z')
                result[i] = 'a';
            else
                result[i] = (char)(chars[i] + 1);
        }

        return result;
    }


    public static void main(String[] args) 
    {
        char[] str = {'c','a','t','z'};

        char[] result = nextLetters(str);

        for(int i = 0; i < result.length; i++)
        {
            System.out.print(result[i]+", ");
        }
        
    }
    
}
