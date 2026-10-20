package CharacterArray25Questins;

public class QuizAnswe
{
    static int quizScore(char[] answers, char[] key)
    {
        if (answers == null || key == null ||
            answers.length != key.length)
            return -1;

        int score = 0;

        for (int i = 0; i < answers.length; i++)
        {
            if (answers[i] == key[i])
                score++;
        }

        return score;
        }



    public static void main(String[] args) 
    {
        char[] Answer = {'A','C','B','D','A'};
        char[] KeyAnser = {'A','B','B','D','C'};

        System.out.println(quizScore(Answer, KeyAnser));
    }
    
}
