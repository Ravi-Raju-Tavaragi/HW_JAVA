package Tue29SEP;

public class Task
{
    public static void numberRelation(int [] array, int num)
    {

        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == 0)
            {
                System.out.println("Array is empty");
                break;
            }

            if(num < 0)
            {
                System.out.println("Enter positive integer");
                break;
            }

            if(num > array[i])
            {
                System.out.println(num +" > "+ array[i]);
            }
            if(num == array[i])
            {
                System.out.println(num +" == "+ array[i]);
            }
            if(num < array[i])
            {
                System.out.println(num +" < "+ array[i]);
            }
        }
    }






    public static void main(String[] args) 
    {
        int [] array = {100, 50, 50, 50, 10, 20, 30, 40, 50};
        //int [] array = {0};
        //int [] array = {10};
        int num = 30;

        numberRelation(array, num);
        
    }
    
}
