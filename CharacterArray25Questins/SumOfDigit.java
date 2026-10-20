package CharacterArray25Questins;

public class SumOfDigit
{
    static int sumDigits(char[] chars)
    {
        if (chars == null)
            return 0;

        int sum = 0;

        for (int i = 0; i < chars.length; i++)
        {
            if (chars[i] >= '0' && chars[i] <= '9')
                sum = sum + (chars[i] - '0');
        }

        return sum;
    }





    public static void main(String[] args) 
    {
        char[] str = {'a','3','b','7','2'};

        System.out.println(sumDigits(str));
        
    }
    
}
