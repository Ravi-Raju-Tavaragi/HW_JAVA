package Array25Quetions;

public class ThreePlayers
{
    static int highestScoringPlayer(int[] player1, int[] player2, int[] player3)                          
    {
        if (player1 == null || player2 == null || player3 == null)
            return -1;

        int total1 = 0;
        int total2 = 0;
        int total3 = 0;

        for (int i = 0; i < player1.length; i++)
            total1 = total1 + player1[i];

        for (int i = 0; i < player2.length; i++)
            total2 = total2 + player2[i];

        for (int i = 0; i < player3.length; i++)
            total3 = total3 + player3[i];

        if (total1 >= total2 && total1 >= total3)
            return 1;

        else if (total2 >= total1 && total2 >= total3)
            return 2;
        else
            return 3;
    }



    public static void main(String[] args) 
    {
        int player1[] = {30, 45, 20};
        int player2[] = {50, 10, 40};
        int player3[] = {25, 35, 30};

        System.out.println(highestScoringPlayer(player1, player2, player3));
    }
    
}
