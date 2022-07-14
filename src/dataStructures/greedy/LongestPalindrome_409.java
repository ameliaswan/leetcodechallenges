package dataStructures.greedy;

//https://leetcode.com/problems/longest-palindrome/solution/
public class LongestPalindrome_409 {
    public int longestPalindrome(String s) {
        int[] arr = new int[128];

        int maxLen = 0;

        for(char c : s.toCharArray()){
            arr[c]++;
        }

        for(int i : arr){
            maxLen += i / 2 * 2;
            if(maxLen % 2 == 0 && i % 2 == 1){
                maxLen++;
            }
        }

        return maxLen;
    }
}
