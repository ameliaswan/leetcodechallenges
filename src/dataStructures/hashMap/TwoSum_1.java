package dataStructures.hashMap;

import java.util.*;

//https://leetcode.com/problems/two-sum/

public class TwoSum_1 {
    public int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            int key = target - nums[i];
            if(map.containsKey(key)){
                result[0] = map.get(key);
                result[1] = i;
            }else{
                map.put(nums[i], i);
            }
        }



        return result;
    }
}
