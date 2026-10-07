package Tue29SEP;

public class BinarySearch
{
    public static int binarySearch(int arr[], int target)
    {
        // 1) If array is null
        if(arr == null)
        {
            System.out.println("Array is null");
            return -1;
        }

        // 2) If array is empty
        if(arr.length == 0)
        {
            System.out.println("Array is empty");
            return -1;
        }

        // 3) If array has elements
        int left = 0;
        int right = arr.length - 1;

        while(left <= right)
        {
            int mid = left + (right - left) / 2;

            if(arr[mid] > target)
                right = mid - 1;

            else if(arr[mid] < target)
                left = mid + 1;

            else
            {
                System.out.println("Element is found at index : ");
                return mid;
            }
        }

        System.out.println("Element is not found");
        return -1; // If element is not found;
    }




    public static void main(String[] args) 
    {
        int arr[] = {10, 20, 30, 40, 50};
        int target = 5;

        int index = binarySearch(arr, target);
        System.out.println(index);
        
    }
    
}
