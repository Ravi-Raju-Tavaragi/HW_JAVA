package CharacterArray25Questins;

public class StudentGrade
{
    static int countAGrade(char[] grades)
    {
        if (grades == null)
            return 0;

        int count = 0;

        for (int i = 0; i < grades.length; i++)
        {
            if (grades[i] == 'A')
                count++;
        }

        return count;
    }



    public static void main(String[] args) 
    {
        char[] str = {'A','B','A','C','A','B'};

        System.out.println(countAGrade(str));
        
    }
    
}
