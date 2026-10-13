
package StringDSAProblems;

public class ExpandStringInPlace
{
    public int calculateWriteIndex(char[] str)
    {
        int count = str.length;

        for (int i = 0; i < str.length; i++)
        {
            if (str[i] >= '2' && str[i] <= '9')
            {
                count = count + (str[i] - '0') - 2;
            }
        }

        return count - 1;
    }

    public int copyCharFromRightToLeft(
            char[] str, char ch, int count, int writeIndex)
    {
        while (count > 0)
        {
            str[writeIndex] = ch;
            writeIndex--;
            count--;
        }

        return writeIndex;
    }

    public void expandString(char[] str)
    {
        int writeIndex = calculateWriteIndex(str);
        int readIndex = str.length-1;

        while (writeIndex >= 0) 
        {
            if (str[readIndex] >= '2' && str[readIndex] <= '9') 
            {
                int count = str[readIndex] - '0';
                char ch = str[readIndex - 1];
                writeIndex = copyCharFromRightToLeft(str, ch, count, writeIndex);
            }

            else
            {
                str[writeIndex] = str[readIndex];
                writeIndex--;
            }
            readIndex--;
        }
    }


    public static void main(String[] args)
    {
        // Six positions are required for the expanded output.
        char[] str = {'a', '3', 'b', '2', 'c', '\0'};

        ExpandStringInPlace obj = new ExpandStringInPlace();

        obj.expandString(str);

        for (int i = 0; i < str.length; i++)
        {
            if (str[i] != '\0')
            {
                System.out.print(str[i]);
            }
        }
    }
}
