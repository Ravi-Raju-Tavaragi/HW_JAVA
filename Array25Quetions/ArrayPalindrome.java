package Array25Quetions;

public class ArrayPalindrome
{
    static int countPalindromeNumber(int[] array)
    {
        if(array == null || array.length == 0)
            return 0;

        int count = 0;
        int reverse = 0;
        for(int i = 0; i < array.length; i++)
        {
             int temp = array[i];

            while (array[i] > 0) 
            {

                int digit = array[i] % 10;
                reverse = reverse * 10 + digit;
                array[i] = array[i] / 10;
            }

            if(temp == reverse)
                count++;
        }
        return count;
    }
    



    public static void main(String[] args) 
    {
        int[] array = {121, 45, 7, 1331, 80};
        System.out.println(countPalindromeNumber(array));
        
    }
    
}
