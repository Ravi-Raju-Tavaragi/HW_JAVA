public class Swap3Xor
{
    public static void main(String[]args)
    {
         float a = 10.3f;
        float b = -20.3f;
        float c = 30.33f;
        float temp;

        System.out.println("Numbers Before Swap");
        System.out.println(" a : "+a+" b : "+b+" c : "+c);
        temp = a;
        a = b;
        b = c;
        c = temp;
        

        System.out.println("Numbers After Swap");
        System.out.println("a : "+a+" b : "+b+" c : "+c);

    }
    
}
