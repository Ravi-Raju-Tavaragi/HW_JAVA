package Array25Quetions;

public class ShopingCart
{
    static double dicountOnTotal(int[] array, int total)
    {
        if(array == null || array.length == 0)
            return 0;

        double sum = 0;

        for(int i = 0; i < array.length; i++)
        {
            sum = sum + array[i];
        }

        double target = sum;
        double Afterdiscount = 0;
        double Amount = 0;
        if(target >= 1000)
        {
            Afterdiscount = ((10.0 / 100) * target);
            Amount = target - Afterdiscount; 
        }

        return Amount;
    }



    public static void main(String[] args) 
    {
        int[] array = {400, 350, 450};
        int total = 1000;

        double result = dicountOnTotal(array, total);
        System.out.println(result);
        
    }
    
}
