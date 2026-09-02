public class Swap4NEM {
    public static void main(String[]args)
    {

    int a = 10;
    int b = 20;
    int c = 30;
    int d = 40;
    int temp;

    System.out.println("Numbers Before Swap");
    System.out.println("a = "+a);
    System.out.println("b = "+b);
    System.out.println("c = "+c);
    System.out.println("d = "+d);

    temp = a;
    a = b;
    b = c;
    c = d;
    d = temp;
    
    System.out.println("Numbers After Swap");
    System.out.println("a = "+a);
    System.out.println("b = "+b);
    System.out.println("c = "+c);
    System.out.println("d = "+d);

    }    
}
