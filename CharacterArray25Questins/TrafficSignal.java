package CharacterArray25Questins;

public class TrafficSignal
{
    static int[] countColours(char[] signals)
    {
        if (signals == null)
            return new int[] {0, 0, 0};

        int red = 0;
        int green = 0;
        int yellow = 0;

        for (int i = 0; i < signals.length; i++)
        {
            if (signals[i] == 'R')
                red++;
            else if (signals[i] == 'G')
                green++;
            else if (signals[i] == 'Y')
                yellow++;
        }

        return new int[] {red, green, yellow};
    }




    public static void main(String[] args) 
    {
        char[] str = {'R','G','G','Y','R','G'};

        int[] result = countColours(str);

        for(int i = 0; i < result.length; i++)
        {
            System.out.print(result[i]+", ");
        }
        
    }
    
}
