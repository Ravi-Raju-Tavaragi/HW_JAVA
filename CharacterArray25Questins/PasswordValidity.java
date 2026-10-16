package CharacterArray25Questins;

public class PasswordValidity
{
    public static void validatePassword(char[] str)
    {
        if(str == null || str.length == 0)
            System.out.println("You Entered Nothing");

        boolean isUppercaseFound = false;
        boolean isLowercaseFound = false;
        boolean isDigitFound = false;
        boolean isSpecialCharacterFound = false;

        for(int i = 0; i < str.length; i++)
        {
            if(str[i] >= 'A' && str[i] <= 'Z')
                isUppercaseFound = true;
            else if(str[i] >= 'a' && str[i] <= 'z')
                isLowercaseFound = true;
            else if(str[i] >= '0' && str[i] <='9')
                isDigitFound = true;
            else if(str[i] >= '!' && str[i] <= '/' || str[i] >= ':' && str[i] <= '@' || str[i] >= '{' && str[i] <= '~')
                isSpecialCharacterFound = true;
                continue;
        }
        if(isUppercaseFound)
        {
            System.out.println("You Used Uppercase In Your Password");
        }
        else
        {
            System.out.println("You Missed to Enter atleast One Uppercase letter in Your Password");
        }

        if(isLowercaseFound)
        {
            System.out.println("You Used Lowercase In Your Password");
        }
        else
        {
            System.out.println("You Missed to Enter atleast One Lowercase letter in Your Password");
        }

        if(isDigitFound)
        {
            System.out.println("You Used Digit In Your Password");
        }
        else
        {
            System.out.println("You Missed to Enter atleast One Digit in Your Password");
        }

        if(isSpecialCharacterFound)
        {
            System.out.println("You Used SpecialCharacter In Your Password");
        }
        else
        {
            System.out.println("You Missed to Enter atleast One specialCharacter in Your Password");
        }
        
        if(str.length >= 8)
        {
            System.out.println("Password Length Matched Suceessfully");
        }
        else 
        {
            System.out.println("Password must contains atleast 8 characters");
        }

        if(isUppercaseFound && isLowercaseFound && isDigitFound && isSpecialCharacterFound && str.length >= 8)
        {
            System.out.println("Your Password is Valid");
        }
        else
        {
            System.out.println("Invalid Password");
        }


    }

    public static void main(String[] args) 
    {
        char[] str = {'R', 'a', 'v', 'i', '*', '2', '0', 'a', 'b'};
        validatePassword(str);

        System.out.println();
        char[] str1 = {'a', 'v', 'i', '*', '2', 'a', 'b'};
        validatePassword(str1);

        System.out.println();
        char[] str2 = {'=', '0', '0', '0', '0', '0', '0', '0'};
        validatePassword(str2);

        System.out.println();
        char[] str3 = {};
        validatePassword(str3);

        System.out.println();
        char[] str4 = {'a', 'v', 'i', '@', '2', '#', 'B'};
        validatePassword(str4);
        
    }
    
}
