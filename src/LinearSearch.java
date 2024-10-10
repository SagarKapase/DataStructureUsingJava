public class LinearSearch {
    public static void ElementFound(int[] arr,int element)
    {
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i] == element)
            {
                System.out.println(element+" found at index "+i);
            }
        }
        System.out.println("Element Not Found");
    }
    public static void main(String[] args) {
        int[] arr = {12, 5, 18, 25, -3, 19};
        int item = 25;
        ElementFound(arr,item);
    }
}
