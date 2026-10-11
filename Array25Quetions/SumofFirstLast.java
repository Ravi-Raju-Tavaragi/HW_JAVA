package Array25Quetions;

public class SumofFirstLast
{
    static int sumOfFirstandLastNumber(int[] array)
    {
        if(array == null || array.length == 0)
            return 0;

        int sum = 0;
        int first = array[0];
        int last = array[array.length-1];

        sum = first + last;
        
        return sum;
    }



    public static void main(String[] args) 
    {
        int[] array = {7, 3, 9, 4};

        int result = sumOfFirstandLastNumber(array);
        System.out.println(result);

        
    }
    
}
