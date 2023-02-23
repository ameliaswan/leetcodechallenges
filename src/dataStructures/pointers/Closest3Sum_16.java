package dataStructures.pointers;

import java.util.Arrays;

public class Closest3Sum_16 {
    /**
     * This method returns the sum of 3 numbers that is closest to the target number.
     * @param nums
     * input int array
     * @param target
     * target number
     * @return
     * the sum of 3 numbers that is closest to target number
     */
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum3 = 0;
        int min = Integer.MAX_VALUE;
        int result = sum3;
        for(int i = 0; i < nums.length-2; i++){
            int j = i+1, k = nums.length-1;
            while(j < k){
                int tmpsum3 = nums[i] + nums[j] + nums[k];
                int delta = Math.abs(target - tmpsum3);

                if(delta < min){
                    min = delta;
                    result = tmpsum3;
                }

                if(tmpsum3 > target){
                    k--;
                }else if(tmpsum3 < target){
                    j++;
                }else{
                    return target;
                }

            }
        }
        return result;
    }
}
