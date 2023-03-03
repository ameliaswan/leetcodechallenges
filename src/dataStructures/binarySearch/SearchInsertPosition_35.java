package dataStructures.binarySearch;

public class SearchInsertPosition_35 {
    /**
     * This method return the index of target in nums or the index it should be inserted at if doesn't exist
     * @param nums input int array
     * @param target input target number
     * @return the index in nums
     *
     * Time complexity: O(log(n))
     */
    public int searchInsert(int[] nums, int target) {
        int begin = 0, end = nums.length - 1, mid = begin + (end - begin)/2;
        return binarysearch(begin, end, mid, nums, target);
    }

    int binarysearch(int begin, int end, int mid, int[] nums, int target){
        //stop condition

        //if target number is found in nums, return begin
        if(begin > end) return begin;
        //if target number found, return mid
        if(nums[mid] == target) return mid;
        else if (nums[mid] < target) begin = mid + 1;
        else end = mid - 1;
        //recursion
        mid =  begin + (end - begin)/2;
        return binarysearch(begin, end, mid, nums, target);

    }
}
