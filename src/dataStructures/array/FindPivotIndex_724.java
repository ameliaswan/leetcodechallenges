package dataStructures.array;

//https://leetcode.com/problems/find-pivot-index/
public class FindPivotIndex_724 {

    public int pivotIndex(int[] nums) {
        int sumL = 0, sumR = 0;

        for(int e : nums){ sumR += e;}
        for(int j = 0; j < nums.length; j++){
            sumR -= nums[j];
            sumL += nums[j];
            if(sumL - nums[j] == sumR){
                return j;
            }
        }
        return -1;

    }
}
