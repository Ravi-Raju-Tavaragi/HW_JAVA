package Array25Quetions;

public class StudentPass
{
    public static int numberOfStudentPassed(int[] array, int marks)
    {
        if ( array == null || array.length == 0)
            return -1;

        int count = 0;
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] >= marks)
                count++;
        }
        return count;
        
    }




    public static void main(String[] args) 
    {
        int array[] = {40, 22, 90, 35, 18};
        int PassingMarks = 35;

        int result = numberOfStudentPassed(array, PassingMarks);
        System.out.println(result);
    }
    
}
