package dataStructures.pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum4_18 {
    /**
     * This method returns a list of all different combinations of 4 numbers, the sum of whom equals to target.
     * @param nums input int array
     * @param target input target number
     * @return
     * This method uses 2 nested loops and two pointers to find all the numbers that meet the requirement.
     */
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length == 0) return result;
        Arrays.sort(nums);

        for(int i = 0; i < nums.length-3; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            for(int j = i+1; j < nums.length-2; j++){
                if(j > i+1 && nums[j] == nums[j-1]) continue;
                int m = j+1, k = nums.length-1;
                while(m < k){
                    //if the average of target is smaller/bigger than the 1st/last element in the sorted array, there's no combination of 4 numbers equals to target
                    if(target / 4 < nums[i] || target / 4 > nums[k]) return result;
                    //incase the total of 4 numbers exceeds the range of int, double type is used here
                    double sum4 = (double) nums[i] + (double) nums[j] + (double) nums[m] + (double) nums[k];
                    if(sum4 == (double) target){
                        List<Integer> tmplist = Arrays.asList(nums[i], nums[j], nums[m++], nums[k--]);
                        result.add(tmplist);
                        while(nums[m] == nums[m-1] && m < k) m++;
                    }else if(sum4 > (double) target) {
                        k--;
                    }else {
                        m++;
                    }
                }
            }
        }
        return result;
    }

}
