package CharacterArray25Questins;

public class VowelandConsonenetCount
{
    static int[] countVowelConsonent(char[] str)
    {
        if(str == null || str.length == 0)
            return new int[] {0, 0};

        int vowelCount = 0;
        int consonentCount = 0;
        for(int i = 0; i < str.length; i++)
        {
            if(str[i] >= 'a' || str[i] >= 'A' && str[i] <= 'z' || str[i] <= 'Z')
            {
                if(str[i] == 'a' || str[i] == 'e' ||str[i] == 'i' || str[i] == 'o' || str[i] == 'u'
                    || str[i] == 'A' || str[i] == 'E' ||str[i] == 'I' || str[i] == 'O' || str[i] == 'U')
                    vowelCount++;
                else
                    consonentCount++;
            }
        }
        return new int[] {vowelCount, consonentCount};
    }

    public static void main(String[] args) 
    {
        char[] str = {'a', 'p', 'p', 'l', 'e'};

        int[] result =countVowelConsonent(str);
        System.out.println("["+result[0]+","+result[1]+"]");   
    }
}
