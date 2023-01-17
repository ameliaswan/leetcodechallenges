package dataStructures.heap;

import java.util.Arrays;
import java.util.PriorityQueue;


public class Median_of_Two_Sorted_Arrays_4 {
    //complexity is O(nlogn + m)
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int size = 0;
        double median;

        //insert elements of nums1 and nums2 into minHeap
        if(nums1 != null){
            size += nums1.length;
            Arrays.stream(nums1).forEach(it -> minHeap.add(it));
        }
        if(nums2 != null){
            size += nums2.length;
            Arrays.stream(nums2).forEach(it -> minHeap.add(it));
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
