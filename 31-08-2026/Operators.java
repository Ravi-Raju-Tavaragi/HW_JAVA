public class Operators 
{
    public static void main(String[] args) 
    {
        System.out.println("Unary Operators");
        int a = 5;
        System.out.println(+a);
        System.out.println(-a);
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(--a);

        System.out.println("Assignment Operators");
        int b = 10;
        System.out.println(b += 5);
        System.out.println(b -= 5);
        System.out.println(b *= 2);
        System.out.println(b /= 2);
        System.out.println(b %= 3);
        System.out.println(b &= 1);
        System.out.println(b |= 1);
        System.out.println(b ^= 1);
        System.out.println(b <<= 1);
        System.out.println(b >>= 1);

        System.out.println("Logical Operators");
        boolean P = true, Q = false;
        System.out.println(P && Q);
        System.out.println(P || Q);
        System.out.println(!Q);
        System.out.println(P & Q);
        System.out.println(P | Q);

        System.out.println("Bitwise Operators");
        int m = 5, n = 3;
        System.out.println(m & n);
        System.out.println(m | n);
        System.out.println(m ^ n);
        System.out.println(~ m);
        System.out.println(m << 1);
        System.out.println(m >> 1);
        System.out.println(m >>> 1);

    }
    
}
