package CharacterArray25Questins;

public class CharacterAppearance
{
    static int countSameCharacter(char[] str, char ch)
    {
        if(str == null || str.length == 0)
            return -1;

        int count = 0;
        for(int i = 0; i < str.length; i++)
        {
            if(str[i] >= 'a' || str[i] >= 'A' && str[i] <= 'z' || str[i] <= 'Z')
            {
                if(str[i] == ch)
                    count++;
            }   
        }     
        return count;
    }

    public static void main(String[] args) 
    {
        char[] str = {'b', 'a', 'n', 'a', 'n', 'a', 'n'};

        char ch = 'a';
        
        System.out.println(countSameCharacter(str, ch));
    }
    
}
