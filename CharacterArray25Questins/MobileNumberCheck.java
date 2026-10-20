package CharacterArray25Questins;

public class MobileNumberCheck
{
    static boolean isMobileNumber(char[] number)
    {
        if (number == null || number.length != 10)
            return false;

        for (int i = 0; i < number.length; i++)
        {
            if (number[i] < '0' || number[i] > '9')
                return false;
        }

        return true;
    }


    public static void main(String[] args) 
    {
        char[] str = {'9','8','4','5','0','1','2','3','4','5'};

        System.out.println(isMobileNumber(str));
        
    }
    
}
