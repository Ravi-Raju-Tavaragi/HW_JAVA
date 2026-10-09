package Tue29SEP;

public class ArrayCompare
{
    static void compareElementWithArray(int[] array)
    {
        if(array == null || array.length == 0)
            System.out.println("array null or empty");

        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array.length; j++)
            {
                if(array[i] > array[j])
                {
                    System.out.println(array[i]+">"+array[j]);
                }
                else if(array[i] == array[j])
                {
                    System.out.println(array[i]+"=="+array[j]);
                }
                else if(array[i] < array[j])
                {
                    System.out.println(array[i]+"<"+array[j]);
                }
            }
        }
    }




    public static void main(String[] args) 
    {
        int[] array = {10, 20, 30, 40};
        compareElementWithArray(array);
        
    }
    
}
