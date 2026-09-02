public class Time 
{
    public static void main (String[]args)
    {
        int seconds = 3600;
        int hours;
        int minutes;
        System.out.println("Convert This Input Seconds into Hours and minutes:"+seconds);

        hours = seconds / 3600;
        minutes = seconds / 60;

        System.out.println("Converted seconds in hours is:"+hours+"hour");
         System.out.println("Converted seconds in minutes is:"+minutes+"minute");
    }
    
}
