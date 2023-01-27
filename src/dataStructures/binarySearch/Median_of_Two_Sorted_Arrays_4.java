package dataStructures.binarySearch;

import java.util.Arrays;
import java.util.PriorityQueue;


public class Median_of_Two_Sorted_Arrays_4 {
    //log(n+m)
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0.0;
        //use the shorter array as the operable target, because then when searching index jump to the right partition, the index of longer array will not be less than 0

        if(nums1.length > nums2.length){
            int[] tmp = nums1;
            nums1 = nums2;
            nums2 = tmp;
        }
        int totalLen = nums1.length + nums2.length;
        int lf = -1, rt = nums1.length-1, mid = lf+(rt-lf)/2;

        while(lf <= rt){
            int idxB = totalLen/2 - mid - 2;
            int aL = mid < 0 ? Integer.MIN_VALUE: nums1[mid];
            int bL = idxB < 0 ? Integer.MIN_VALUE: nums2[idxB];
            int aR = mid+1 > nums1.length - 1 ? Integer.MAX_VALUE : nums1[mid+1];
            int bR = idxB+1 > nums2.length - 1 ? Integer.MAX_VALUE : nums2[idxB+1];

            if(aL <= bR && bL <= aR){
                median = totalLen % 2 == 0 ? (Math.max(aL, bL) + Math.min(aR, bR))/2.0: Math.min(aR, bR);
                break;
            }else if(aL > bR){
                rt = mid - 1;
            }else{
                lf = mid + 1;
            }

            mid = lf+(rt-lf)/2;
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
