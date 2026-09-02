public class Swap4Num
{
    public static void main(String[]args)
    {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        System.out.println("Numbers Before Swap");
        System.out.println(" a:"+a+" b:"+b+" c:"+c+" d:"+d);

        a = a + b + c + d;
        d = a - b - c - d;
        c = a - b - c - d;
        b = a - b - c - d;
        a = a - b - c - d;

        System.out.println("Numbers After Swap");
        System.out.println("a:"+a+" b:"+b+" c:"+c+" d:"+d);

    }
    
}
