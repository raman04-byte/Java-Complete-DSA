package DSA_Questions;

public class LinearSearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,45,3,2,21,3,4};
        System.out.println(findIndex(arr, 45, 0));
    }

    public static int findIndex(int[] arr, int target, int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else{
            return findIndex(arr, target, index+1);
        }
    }
}
