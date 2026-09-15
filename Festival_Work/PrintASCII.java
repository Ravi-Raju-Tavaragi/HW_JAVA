package Festival_Work;

public class PrintASCII 
{
    static void printASCII() 
    {
        for (char ch = 'A'; ch <= 'Z'; ch++) 
        {
            System.out.print(ch +" ");
        }
    }

    public static void main(String[] args) 
    {
        printASCII();
    }
}