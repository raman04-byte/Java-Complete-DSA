package DSA_Questions;

public class LinerSearch {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8};
        int target=9;
        int ans = linearSeach(nums, target);
        System.out.println(ans + " answer in the index");
    }

    // Return the index of the element if the item is found at the
    // at the particular index
    static int linearSeach(int[] arr, int target) {

        if (arr.length == 0) {
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            int element = arr[i];
            if(target == element){
                return i;
            }
        }
        return -1;
    }
}