package Array25Quetions;

public class OverRun
{
    static int maxRunsOver(int[] runs)
{
    if (runs == null || runs.length == 0)
        return -1;

    int max = runs[0];
    int over = 1;

    for (int i = 1; i < runs.length; i++)
    {
        if (runs[i] > max)
        {
            max = runs[i];
            over = i + 1;
        }
    }

    return over;
}




    public static void main(String[] args) 
    {
        int runs[] = {6, 12, 4, 15, 9};

        System.out.println(maxRunsOver(runs));
    }
    
}
