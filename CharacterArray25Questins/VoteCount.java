package CharacterArray25Questins;

public class VoteCount
{
    static char mostVotes(char[] booth1, char[] booth2, char[] booth3)
{
    if (booth1 == null || booth2 == null || booth3 == null)
        return '0';

    int votesA = 0;
    int votesB = 0;

    for (int i = 0; i < booth1.length; i++)
    {
        if (booth1[i] == 'A')
            votesA++;
        else if (booth1[i] == 'B')
            votesB++;
    }

    for (int i = 0; i < booth2.length; i++)
    {
        if (booth2[i] == 'A')
            votesA++;
        else if (booth2[i] == 'B')
            votesB++;
    }

    for (int i = 0; i < booth3.length; i++)
    {
        if (booth3[i] == 'A')
            votesA++;
        else if (booth3[i] == 'B')
            votesB++;
    }

    if (votesA >= votesB)
        return 'A';
    else
        return 'B';
}



    public static void main(String[] args) 
    {
        char[] booth1 = {'A','B','A'};
        char[] booth2 = {'B','B','A','B'};
        char[] booth3 = {'A','A'};

        System.out.println(mostVotes(booth1, booth2, booth3));
    }
    
}
