public class BubbleSort {
    public static void bubbleSorting(int[] arr)
    {
        for (int i=0;i<arr.length-1;i++)
        {
            for (int j=1;j<arr.length-i;j++)
            {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        //printing the array
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {12, 5, 18, 25, -3, 19};
        bubbleSorting(arr);
    }
}
