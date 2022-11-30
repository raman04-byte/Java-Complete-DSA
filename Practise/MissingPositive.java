package Practise;

public class MissingPositive {
    public static void main(String[] args) {
        
    }
    public int firstMissingPositive(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i]-1;
            if (arr[i]>0&&arr[i]<=arr.length &&arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index+1){
                return index+1;
            }
        }
        return arr.length+1;
    }

    void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}