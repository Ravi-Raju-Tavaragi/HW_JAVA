package Array25Quetions;

public class RaviandSitaMarks
{
    static int countHigherMarks(int[] ravi, int[] sita)
{
    if (ravi == null || sita == null ||
        ravi.length != sita.length)
        return -1;

    int count = 0;

    for (int i = 0; i < ravi.length; i++)
    {
        if (ravi[i] > sita[i])
        {
            count++;
        }
    }

    return count;
}



    public static void main(String[] args) 
    {
        int[] Ravi = {78, 65, 90, 55, 82};
        int[] Sita = {70, 80, 85, 60, 82};
        
        System.out.println(countHigherMarks(Ravi, Sita));
    }
    
}
