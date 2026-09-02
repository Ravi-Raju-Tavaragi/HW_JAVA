public class CinemaHall 
{
    public static void main(String[]args)
    {
        int people = 125;
        int rows;
        int last_row;
        int remaning_seats;
        System.out.println("Welcome to Algoriths365 Studio");
        System.out.println("Today attendence for the Show is : "+people);

        //complete rows
        System.out.println("Seating capacity per Row is 12");
        rows = people / 12;
        System.out.println("Completed Rows for Today Show is : "+rows);

        //people in last row
        last_row = people % 12;
        System.out.println("People Present in Lasr Row are : "+last_row);

        //remaining seats
        remaning_seats = (12 * 11) - people;
        System.out.println("Remaining seats in Hall : "+remaning_seats);
    }

    
}