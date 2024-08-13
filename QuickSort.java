public class QuickSort {
    //Creating the function to perform a partition
    public static int partition(int[] arr, int low, int high) {
        //Choosing the last element as the pivot
        int pivot = arr[high];
        int i = (low - 1);

        //Iterating through all elements
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                //Swapping arr[i] and arr[j] if element i is smaller than element j
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        //Swapping the pivot element with the element at i + 1
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        //Returning the partition index
        return i + 1;
    }

    //Creating the function to perform the quicksort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            //Recursively sorting elements before and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    //Examples from the assignment:
    public static void main(String[] args) {
        //Example 1:
        int[] arr1 = {4, 1, 3, 9, 7};
        quickSort(arr1, 0, arr1.length - 1);
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println();

        //Example 2:
        int[] arr2 = {2, 1, 6, 10, 4, 1, 3, 9, 7};
        quickSort(arr2, 0, arr2.length - 1);
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

