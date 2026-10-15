package CharacterArray25Questins;

public class LowerCaseToUppercase
{
    static char[] convertToUppercase(char[] str)
    {
        
        if(str == null || str.length == 0)
            return new char[] {0};

        for(int i = 0; i < str.length; i++)
        {
            if(str[i] >= 'a' && str[i] <= 'z')
            {
                str[i] =(char)(str[i] - 32);
            }
        }
        return str;
    }

    public static void main(String[] args) 
    {
        char[] str = {'1', 'O', 'd', 'e'};
        for(int i = 0; i < str.length; i++)
        {
            System.out.print(str[i] +", ");
        }

        System.out.println();
        char[] result = convertToUppercase(str);
        for(int i = 0; i < result.length; i++)
        {
            System.out.print(result[i] +", ");
        }

        
    }
    
}
