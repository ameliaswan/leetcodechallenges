package pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOf3_15 {
    /**
     * This method returns a list of list of Integer, which are the unique combinations of 3 elements whose sum is 0
     * @param nums
     * input array
     * @return result
     * a list of list of Integer
     * The time complexity is O(n^2), space complexity is O(n)
     */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length == 0) return result;

        Arrays.sort(nums);
        //if the 1st element is bigger than 0 or the last element is smaller than 0, then no suitable combination exists
        if(nums[0] > 0 || nums[nums.length - 1] < 0){
            return result;
        }

        for(int i = 0; i < nums.length - 2; i++){
            //jump over duplicate element
            if(i > 0 && nums[i-1]==nums[i]) continue;
            int j = i + 1, k = nums.length - 1;
            while(j < k){
                int sum3 = Integer.sum(Integer.sum(nums[i], nums[j]), nums[k]);
                if(sum3 == 0){
                    result.add(Arrays.asList(nums[i], nums[j++], nums[k]));
                    //jump over duplicate element
                    while(nums[j-1] == nums[j] && j < k) j++;
                }
                else if(sum3 > 0) k--;
                else j++;
            }

        }
        return result;
    }
}
