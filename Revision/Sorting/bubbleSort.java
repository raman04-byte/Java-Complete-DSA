package Revision.Sorting;
// bubble Sort method
class BubbleSort {
    public void bubble(int[] arr) {
        boolean isSwap;
        for (int i = 0; i < arr.length; i++) {
            isSwap=false;
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j-1]>arr[j]){
                    swap(arr, j-1, j);
                    isSwap = true;
                }
            }
            if(!isSwap){
                break;
            }
        }
    }
    // swap method in bubble sort
    static void swap(int arr[], int index1, int index2){
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
        
    }

}
