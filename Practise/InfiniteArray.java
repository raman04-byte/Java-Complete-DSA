package Practise;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,7,8,41};
        int target = 5;
        System.out.println(ans(arr, target));
    }
    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;
        while(target>arr[end]){
            int temp = end+1;
            end = end+(end-start+1)*2;
            start = temp;
        }
        return Binarysearch(arr, target, start, end);
    }
    static int Binarysearch(int[] arr, int target, int start, int end){

        while(start<=end){
            int mid = start + (end -start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}

