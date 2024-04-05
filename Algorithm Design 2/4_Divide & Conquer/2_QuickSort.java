//Implement quick sort using either 1st or last element as pivot.

import java.util.Arrays;

class QuickSort
{
    public static void main(String args[])
    {
        int arr[] = { 7, 6, 10, 5, 9, 2, 1, 15, 7 };
        int n = arr.length;

        QuickSort ob = new QuickSort();
        ob.quickSort(arr, 0, n - 1);
                                                                                                                                                                                                                  
        System.out.print("Sorted array: ");
        ob.printArray(arr, n);
    }

    int partition(int arr[], int low, int high)
    {
        int pivot = arr[low];
        int k = high;
        for (int i = high; i > low; i--)
            if (arr[i] > pivot)
                swap(arr, i, k--);
        
        swap(arr, low, k);
        return k;
    }

    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void quickSort(int arr[], int low, int high)
    {
        if (low < high)
        {
            int idx = partition(arr, low, high);
            quickSort(arr, low, idx - 1);
            quickSort(arr, idx + 1, high);
        }
    }

    void printArray(int arr[], int size)
    {
        int i;
        System.out.print("{ ");
        for (i = 0; i < size-1; i++)
            System.out.print(arr[i] + ", ");
        System.out.print(arr[size-1] + " }");
        System.out.println();
    }

}

/*Sorted array: { 1, 2, 5, 6, 7, 7, 9, 10, 15 } */