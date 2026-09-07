public class Even
{
    public static void main(String[]args)
    {
        for(int i = 1; i <= 20; i++)
        {
        if(i % 2 != 0)
        {
            continue;
        }
        System.out.println(i);
        }


        for(int j = 1; j <= 20; j++)
        {
        if(j % 2 != 1)
        {
            continue;
        }
        System.out.println(j);
        }
    }
    
}
