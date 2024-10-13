public class QuickSort {
    public static void quickSorting(int[] arr,int low,int high)
    {
        if (low < high)
        {
            int indexPI = partition(arr,low,high);
            quickSorting(arr, low, indexPI  - 1);  //left partition
            quickSorting(arr, indexPI  + 1, high); //right partition
        }
    }
    static int partition(int[] arr,int low,int high)
    {
        int pivot = arr[high];
        int swapIndex = (low-1);
        for (int j=low;j<=high-1;j++)
        {
            if (arr[j] < pivot)
            {
                swapIndex++;
                swap(arr,swapIndex,j);
            }
        }
        swap(arr, swapIndex + 1, high);

        return (swapIndex + 1);
    }
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void display(int[] arr, int size)
    {
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {12, 5, 18, 25, -3, 19};
        quickSorting(arr,0,arr.length-1);
        display(arr,arr.length);
    }
}
