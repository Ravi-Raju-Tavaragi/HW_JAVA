package Sat12SEP;

public class MethodOverLoading
{
    int max(int x, int y)
    {
        if(x>y)
            return x;
        else
            return y;
    }

   /*int max(int x, int y)
    {
        if(x>y)
            return x;
        else
            return y;
    }*/
    
    int max(byte x, byte y)
    {
        if(x>y)
            return x;
        else
            return y;
    }

    float max(float x, float y)
    {
        if(x>y)
            return x;
        else
            return y;
    }

    //max of three numbers
    int max(int x, int y, int z)
    {
        if(x>y && x >= z)
            return x;
        else if(y >= x && y >= z)
            return y;
        else
            return z;
    }




    public static void main(String[] args) 
    {
        MethodOverLoading obj = new MethodOverLoading();
        
        System.out.println(obj.max(10,20));

    }
    
}
