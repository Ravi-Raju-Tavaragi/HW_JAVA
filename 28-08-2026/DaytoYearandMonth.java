public class DaytoYearandMonth 
{

    public static void main(String[]args)
    {
        int days = 550;
        int year;
        int month, month1;
        int a;
        System.out.println("Given days to convert :"+days);
        year = days / 365;
        a = 550 - 365;
        month = a / 30;
        days = a - (month * 30);
        System.out.println("Converted 550 days in YY/MM/DD : "+year+"Year"+month+"Month"+days+"Days");
        System.out.println("Another day for this in put by taking 31 days per month");

        int days1 = 550;
        year = days1 / 365;
        a = 550 - 365;
        month1 = a / 31;
        days1 = a - (month1 * 31);
        System.out.println("Converted 550 days in YY/MM/DD : "+year+"Year"+month1+"Month"+days1+"Days");
    }
    
}