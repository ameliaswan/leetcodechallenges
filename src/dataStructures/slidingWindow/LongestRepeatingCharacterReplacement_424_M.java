package dataStructures.slidingWindow;


import java.util.HashMap;

//https://leetcode.com/problems/longest-repeating-character-replacement/
public class LongestRepeatingCharacterReplacement_424_M {

    public int characterReplacement(String s, int k) {
        int left = 0, repeat = 0, max = Integer.MIN_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();

        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0) + 1);

            repeat = Math.max(repeat, map.get(c));
            if(right - left + 1 - repeat > k){
                char ch = s.charAt(left);
                map.put(ch, map.get(ch) - 1);
                left++;
            }
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}
