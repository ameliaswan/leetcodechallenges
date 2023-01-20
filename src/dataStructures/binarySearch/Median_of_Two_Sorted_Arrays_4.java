package dataStructures.binarySearch;

import java.util.Arrays;
import java.util.PriorityQueue;


public class Median_of_Two_Sorted_Arrays_4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0.0;
        int totalLen = nums1.length + nums2.length;
//        check if either or both nums1 and nums2 are null
        if(nums1.length == 0 && nums2.length == 0){
            return median;
        }
        if(nums1.length ==0 || nums2.length ==0){
            int midIdx = (totalLen - 1) / 2;
            if(nums2.length > 0){
                nums1 = nums2;
            }
            median = totalLen % 2 == 0 ? ((double) (nums1[midIdx]) + (double) (nums1[midIdx + 1])) / 2 : nums1[midIdx];
            return median;
        }

//        if both arrays are not null
        // the index of the last element of left part in nums1
        int ALf = (nums1.length - 1) / 2;
        int BLf = totalLen / 2 - ALf - 2;

        while(ALf >= -1 && BLf >= -1){
            int ARt = ALf + 1;
            int BRt = BLf + 1;
            int Al = ALf < 0 ? Integer.MIN_VALUE : nums1[ALf];
            int Bl = BLf < 0 ? Integer.MIN_VALUE : nums2[BLf];
            int A = ARt > nums1.length - 1 ? Integer.MAX_VALUE : nums1[ARt];
            int B = BRt > nums2.length - 1 ? Integer.MAX_VALUE : nums2[BRt];
            if(Al <= B && Bl <= A){
                median = totalLen % 2 == 0 ? (double) (Math.max(Al, Bl) + Math.min(A, B)) / 2 : (double) (Math.min(A, B));
                break;
            }else if(Al > B){
                ALf--;
                BLf++;
            }else{
                ALf++;
                BLf--;
            }
        }
        return median;
    }


    //complexity is O(nlogn + m)
    public double findMedianSortedArrays_merge(int[] nums1, int[] nums2) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int size = 0;
        double median;

        //insert elements of nums1 and nums2 into minHeap
        if(nums1 != null){
            size += nums1.length;
            Arrays.stream(nums1).forEach(minHeap::add);
        }
        if(nums2 != null){
            size += nums2.length;
            Arrays.stream(nums2).forEach(minHeap::add);
        }
        if(size == 0){
            return -1;
        }

        //n represents the number of items that are before median
        int n = (size - 1)/2;
        while(n > 0){
            minHeap.remove();
            n--;
        }

        //after remove all the elements before median, now the 1st item of minHeap is median;
        //unless size is even number, which means median is the sum of 1st and 2nd smallest items of minHeap divided by 2
        median = Double.valueOf(minHeap.remove());
        median = size % 2 == 0 ? (median + Double.valueOf(minHeap.remove())) / 2 : median;

        return median;
    }
}
