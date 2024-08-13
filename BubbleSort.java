public class BubbleSort {
    //Creating the function to perform the bubble sort
    public static void bubblesort(int[] arr, int n) {
        //Iterating through all elements in the array
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                //Comparing adjacent elements
                if (arr[j] > arr[j + 1]) {
                    //Swapping if they are in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //Examples from the assignment:
    public static void main(String[] args) {
        //Example 1:
        int[] arr1 = {4, 1, 3, 9, 7};
        int n1 = arr1.length;
        bubblesort(arr1, n1);
        //Printing the sorted array
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println();

        //Example 2:
        int[] arr2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int n2 = arr2.length;
        bubblesort(arr2, n2);
        //Printing the sorted array
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

