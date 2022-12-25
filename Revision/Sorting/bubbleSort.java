package Revision.Sorting;

class bubbleSort {
    public void bubble(int[] arr) {
        boolean isSwap;
        for (int i = 0; i < arr.length; i++) {
            isSwap=false;
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j-1]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    isSwap = true;
                }
            }
            if(!isSwap){
                break;
            }
        }
    }

}
