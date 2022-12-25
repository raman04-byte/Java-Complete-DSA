package DSA_Questions;

public class BinarySearch {
    public static void main(String[] args) {
        int[]  nums = {1,2,3,4,5,6,7,8,9};
        int target = 3;
        int ans = binarySearch(nums, target);
        System.out.println(ans);
        
    }
    static int binarySearch(int[] arr, int target){
        int start =0;
        int end = arr.length-1;
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
