package CharacterArray25Questins;

public class CountWords
{
    static int countWords(char[] chars)
    {
        if (chars == null || chars.length == 0)
            return 0;

        int count = 0;

        for (int i = 0; i < chars.length; i++)
        {
            if (chars[i] != ' ' && (i == 0 || chars[i - 1] == ' '))
                count++;
        }

        return count;
    }



    public static void main(String[] args) 
    {
        char[] str = {'I',' ','l','o','v','e',' ','J','a','v','a'};

        System.out.println(countWords(str));
    }
    
}
