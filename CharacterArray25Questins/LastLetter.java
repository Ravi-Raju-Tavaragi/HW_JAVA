package CharacterArray25Questins;

public class LastLetter
{
    static char lastAlphabetically(char[] chars)
    {
        if (chars == null || chars.length == 0)
            return '0';

        char largest = chars[0];

        for (int i = 1; i < chars.length; i++)
        {
            if (chars[i] > largest)
                largest = chars[i];
        }

        return largest;
    }


    public static void main(String[] args) 
    {
        char[] str = {'d','o','g','s'};

        System.out.println(lastAlphabetically(str));
        
    }
    
}
