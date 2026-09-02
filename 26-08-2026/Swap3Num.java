public class Swap3Num {

    public static void main(String[]args)
    {
        float a = -10.3f;
        float b = 20.3f;
        float c = 30.33f;

        System.out.println("Numbers Before Swap");
        System.out.println(" a : "+a+" b : "+b+" c : "+c);

        a = a + b + c;
        c = a - b - c;
        b = a - b - c;
        a = a - b - c;

        System.out.println("Numbers After Swap");
        System.out.println("a : "+a+" b : "+b+" c : "+c);


    }
}