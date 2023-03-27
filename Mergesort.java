public class Mergesort {
    // default function to print array
    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void mergesort(int arr[], int si, int ei) {
        if (si >= ei) { // base case: if the array has only one element, it is already sorted
            return;
        }

        int mid = si + (ei - si) / 2; // find the middle index of the array
        mergesort(arr, si, mid); // sort the left half of the array
        mergesort(arr, mid + 1, ei); // sort the right half of the array
        merge(arr, si, mid, ei); // merge the two sorted halves
    }
    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1]; // create a temporary array to store the sorted elements
        int i = si; // initialize an index for the left half of the array
        int j = mid + 1; // initialize an index for the right half of the array
        int k = 0; // initialize an index for the temporary array

        // while there are still elements in both halves of the array
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++]; // copy the smaller element from the left half of the array to the temporary array
            } else {
                temp[k++] = arr[j++]; // copy the smaller element from the right half of the array to the temporary array
            }
        }

        // if there are still elements in the left half of the array, copy them to the temporary array
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // if there are still elements in the right half of the array, copy them to the temporary array
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy the sorted elements from the temporary array back to the original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[] = { 9, 3, 2, 4, 39, 33, 22, 14, 29 };
        mergesort(arr, 0, arr.length - 1);
        printarr(arr);
    }
}
