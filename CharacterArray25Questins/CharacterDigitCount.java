package CharacterArray25Questins;

public class CharacterDigitCount
{
    static boolean isContainsDigit(char[] str)
    {
        if(str == null || str.length == 0)
            return false;

        boolean digitFound = false;
        for(int i = 0; i < str.length; i++)
        {
            if(str[i] >= '0' && str[i] <= '9')
                digitFound = true;
        }

        if(digitFound)
            return true;
        else
            return false;
    }

    public static void main(String[] args) 
    {
        char[] str = {'p', 'a', 's', 's'};

        System.out.println(isContainsDigit(str));
        
    }
    
}
