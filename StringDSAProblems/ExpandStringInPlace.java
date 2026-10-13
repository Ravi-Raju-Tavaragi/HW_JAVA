package StringDSAProblems;

public class ExpandStringInPlace
{
    public int calculateWriteIndex(char[] str)
    {
        int count = 0;
        for(int i = 0; i < str.length; i++)
        {
            if(str[i] >= 2 && str[i] <= 9)
            {
                count = count + (str[i] - '0') - 1;
            }
            else
            {
                count = count++;
            }
        }

        return count;
    }


    



    public static void main(String[] args) 
    {
        char[] str = {'a', '3', 'b', '2', 'c'};
        
    }
    
}
