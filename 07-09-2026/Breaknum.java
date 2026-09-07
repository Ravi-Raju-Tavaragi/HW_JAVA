public class Breaknum
{
 public static void main(String[]args)
 {
    //print 1-10 stop at 5
  /*   for(int i = 1; i <= 10; i++)
    {
        if(i == 5)
            break;
        System.out.println(i);
    }*/

    for(int j = 1; j <= 10; j++)
    {
        if(j == 5)
         continue;
        System.out.println(j);
    }
 }   
}
