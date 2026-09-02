public class Swap3NumDir {
    public static void main(String[] args)
    {

        
    int a = 10;
    int b = 20;
    int c = 30;

    System.out.println("Numbers Before Swap");
    System.out.println("a = "+a);
    System.out.println("b = "+b);
    System.out.println("c = "+c);

   a = a + b + c;
   c = a - b - c;
   b = a - b - c;
   a = a - b - c;
    
    System.out.println("Numbers After Swap");
    System.out.println("a = "+a);
    System.out.println("b = "+b);
    System.out.println("c = "+c);
    }
}
