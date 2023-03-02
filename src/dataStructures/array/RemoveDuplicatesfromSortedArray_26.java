package dataStructures.array;

public class RemoveDuplicatesfromSortedArray_26 {
    /**
     * This method returns k indicating that the elements from 0 to k-1 will be non-duplicates.
     * @param nums input int array
     * @return the length of non-duplicates
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public int removeDuplicates(int[] nums) {
        //input array's length is longer than 1, so nums[0] can be regarded as the first non-duplicate
        //k means the index at which the element can be modified as next non-duplicate
        int k = 1;
        //nums[k-1] is the latest element that is non-duplicate, compare current element nums[i] with nums[k-1] to check if it's a duplicate
        for(int i = 0; i < nums.length; i++)
            if(nums[i] != nums[k-1]) nums[k++] = nums[i];
        return k;
    }
}
