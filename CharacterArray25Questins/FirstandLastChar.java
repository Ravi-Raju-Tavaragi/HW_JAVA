package CharacterArray25Questins;

public class FirstandLastChar
{
    static char[] returnFirstandLastChar(char[] str)
    {
        if(str == null || str.length == 0)
            return new char[] {0};

        char first = str[0];
        char last = str[str.length-1];

        return new char[] {first, last};
    }



    public static void main(String[] args) 
    {
        char[] str = {'m','a','n','g','o'};
        
        char[] result = returnFirstandLastChar(str);
       
        System.out.print("["+result[0]+","+result[1]+"]");
        
        
    }
    
}
