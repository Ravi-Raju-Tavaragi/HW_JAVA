package Festival_Work;

import java.util.Scanner;

public class LibraryBookSearch
{
    static String[] getBooks() 
    {
        return new String[]{"Java", "Python", "C++", "DBMS", "Networking"};
    }
    
    
    static boolean searchBook(String[] books, String name) 
    {
    
    for (int i = 0; i < books.length; i++)
        {
        if(books[i].equalsIgnoreCase(name)) 
        {
           return true;
        }
        }
        return false;
    }


    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        String[] books = getBooks();
        System.out.print("Enter book name to search: ");
        String search = sc.nextLine();

        if (searchBook(books, search)) 
        {
            System.out.println("Book Found");
        } 
        else 
        {
            System.out.println("Book Not Found");
        }

        sc.close();
        
    }
    
}
