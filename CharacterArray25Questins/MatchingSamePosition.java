package CharacterArray25Questins;

public class MatchingSamePosition
{
    static int countMatchingPositions(char[] first, char[] second)
    {
        if (first == null || second == null ||
            first.length != second.length)
            return -1;

        int count = 0;

        for (int i = 0; i < first.length; i++)
        {
            if (first[i] == second[i])
                count++;
        }

        return count;
    }



    public static void main(String[] args) 
    {
        char[] str1 = {'c','a','r','d'};
        char[] str2 = {'c','o','r','e'};

        System.out.println(countMatchingPositions(str1, str2));
        
    }
    
}
