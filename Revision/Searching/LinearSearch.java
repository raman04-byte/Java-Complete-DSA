package Revision.Searching;

// LinearSearch implementation using function in java language
public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = { 23, 5, 7, 9, 85, 84, 6, 654, 89, 7, 97, 8, 479, 6, 4 };
        int target = 89;
        int ans = linearSearch(nums, target);
        System.out.println("Index of the number is " + ans);
        String str="Raman";
        char ch='a';
        System.out.println(searchString(str, ch));
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
    static boolean searchString(String str, char ch){
        if(str.isEmpty()){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(ch==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
