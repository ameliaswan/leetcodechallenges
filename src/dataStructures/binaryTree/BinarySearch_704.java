package dataStructures.binaryTree;

public class BinarySearch_704 {

    public int search(int[] nums, int target) {
        int begin = 0;
        int end = nums.length - 1;
        int mid = (begin + end) / 2;

        while(begin <= end){
            if(nums[mid] == target){
                return mid;
            }

            if(nums[mid] < target){
                begin = mid + 1;
            }else{
                end = mid - 1;
            }
            mid = (begin + end) / 2;
        }

        return -1;
    }

}
