import java.util.Arrays;

public class BinarySearch {
    public static int findElement(int[] arr,int element)
    {
        Arrays.sort(arr);
        int low = 0;int high = arr.length-1;

        while (low <= high)
        {
            int mid = low + (high-low)/2;
            if (arr[mid] == element)
            {
                return mid;
            }else if (element > arr[mid])
            {
                low = mid + 1;
            }else
            {
                high = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10,30,20,60,40,55,34,65,6,11};
        int element = 30;
        int result = findElement(arr,element);
        if (result == -1)
            System.out.println("Not found");
        else
            System.out.println("Element found at index " + result);
    }
}
