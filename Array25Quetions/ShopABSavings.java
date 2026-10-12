package Array25Quetions;

public class ShopABSavings
{
    static int calculateSavings(int[] shopA, int[] shopB)
    {
        if(shopA == null || shopB == null || shopA.length != shopB.length)
            return -1;

        int minTotal = 0;
        int shopATotal = 0;

        for(int i = 0; i < shopA.length; i++)
        {
            if(shopA[i] < shopB[i])
                minTotal = minTotal + shopA[i];
            else
                minTotal = minTotal + shopB[i];

            shopATotal = shopATotal + shopA[i];
        }

        return shopATotal - minTotal;
    }





    public static void main(String[] args)
    {
        int[] shopA = {100, 250, 80, 40};
        int[] shopB = {90, 260, 70, 45};

        System.out.println(calculateSavings(shopA, shopB));
    }
    
}
