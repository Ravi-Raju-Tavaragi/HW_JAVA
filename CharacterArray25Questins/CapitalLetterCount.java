package CharacterArray25Questins;

public class CapitalLetterCount
{
    static int countCapitalLetter(char[] str)
    {
        if(str == null || str.length == 0)
            return -1;

        int count = 0;
        for(int i = 0; i < str.length; i++)
        {
            if(str[i] >= 'A' && str[i] <= 'Z')
                count++;
        }
        return count;
    }




    public static void main(String[] args) 
    {
        char[] str = {'I','n','d','i','a','N','o','1'};

        System.out.println(countCapitalLetter(str));
        
    }
    
}
