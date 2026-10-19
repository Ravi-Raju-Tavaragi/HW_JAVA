package Array25Quetions;

public class HotDayCount
{
    static int countHoterDay(int[] array)
    {
        if ( array == null || array.length == 0)
            return -1;

        int HoterDay = array[0];
        int HotDayCount = 0;

        for(int i = 0; i < array.length; i++)
        {
            if(HoterDay < array[i])
                HotDayCount++;
                HoterDay = array[i];
        }
        return HotDayCount;
    }





    public static void main(String[] args) 
    {
        int[] array = {30, 32, 31, 35, 36, 34, 37};

        System.out.println(countHoterDay(array));
        
    }
    
}
