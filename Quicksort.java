//quick sort


//concept of pivot : depending and choosing on the element randomly and sort according to it.
//mostly take the last element as the pivot element
//after taking the pivot, take partition, smaller elements before pivot and larger after pivot
//call quick sort for the left part, and qs for the right part
//Make an iterator as -1,used for traversal, if its a smaller value inc i++,swaps IllegalAccessError
//swap code also is present by using i iterator

public class Main{
    public static void printArr(int arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }
       }
    
    public static void quicksort(int arr[] ,int si, int ei){
        if(si >= ei){
            return;
        } //Base case
        
        int pidx = partition(arr,si,ei);//specifying pivot index and calling func
        quicksort(arr, si, pidx-1);//quicksort for the smaller elements ie.left
        quicksort(arr, pidx+1, ei); //quicksort for the Larger elements ie.right
    }
    
    public static int partition(int arr[],int si, int ei){
    int pivot = arr[ei]; //specifying it to the last elements
    int i = si -1; //s[ecifying i to -1

    for(int j = si; j<ei; j++){
        if(arr[j] <= pivot) {
            i++;
            //swap
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
    }
    //to put pivot to the right Pos
    i++;
    int temp = pivot;
    arr[ei] = arr[i];
    arr[i] = temp;
    return i;
}
        public static void main(String args[]){
        int arr[] = {6,3,9,8,2,5};
        quicksort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
