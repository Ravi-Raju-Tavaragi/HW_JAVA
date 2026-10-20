package CharacterArray25Questins;

public class ReplaceUnderscore
{
    static char[] emptyToUnderscore(char[] str)
    {
        if(str == null || str.length == 0)
            return new char[] {0};

        for(int i = 0; i < str.length; i++)
        {
            if(str[i] == ' ')
                str[i] = '_';
        }

        return str;

    }



    public static void main(String[] args) 
    {
        char[] str = {'h','i',' ','t','h','e','r','e'};

        char[] result = emptyToUnderscore(str);

        for(int i = 0; i < result.length; i++)
        {
            System.out.print(result[i]+", ");
        }
        
    }
    
}
