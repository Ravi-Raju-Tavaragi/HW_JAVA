package ArrayPractice;

public class StudentMarks
{
    static int studentsPassedinExam(int[] array, int key)
    {
        if(array == null || array.length == 0)
            return -1;

        int count = 0;
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] >= key)
                count++;
        }
        return count;
    }
    




    public static void main(String[] args) 
    {
        int[] array = {40, 38, 35, 80, 18, 36};
        int passMark = 35;

        int result = studentsPassedinExam(array, passMark);
        System.out.println(("Number Of Students Passed in Exam - "+result));


        
    }
    
}
