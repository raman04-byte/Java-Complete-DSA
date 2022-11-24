package DSA_Questions;

public class LinerSearch {
    public static void main(String[] args) {
        int[] nums = {3,5,23,4,34,54,25,2,45,346,4,656,7,345,73,46,2,42,6,4567,345,73,4567};
        int target=3;
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