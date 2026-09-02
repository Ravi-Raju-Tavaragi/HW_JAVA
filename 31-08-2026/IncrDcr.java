public class IncrDcr 
{
    public static void main(String[] args) 
    {
        int a = 5;
        int b = a++;

       /*  System.out.println(a++);
        System.out.println(a);

        int b = a++;

        System.out.println(a);
        System.out.println(b);
        
        b = a++ + ++a;
        System.out.println(a);
        System.out.println(b);
        
        b = ++a + a++;
        System.out.println(a);
        System.out.println(b);*/

        b = a++ + a++ + ++a;
        System.out.println(a);
        System.out.println(b);

        b = a++ + ++a + a++;
        System.out.println(a);
        System.out.println(b);

        b = a-- + --a;
        System.out.println(a);
        System.out.println(b);

        b = ++a + a++ + --a;
        System.out.println(a);
        System.out.println(b);

        b = a++ + ++a + a++ + ++a;
        System.out.println(a);
        System.out.println(b);

    }
    
}
