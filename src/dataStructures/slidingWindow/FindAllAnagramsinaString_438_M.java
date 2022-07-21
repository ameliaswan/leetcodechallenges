package dataStructures.slidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/find-all-anagrams-in-a-string/

public class FindAllAnagramsinaString_438_M {

    //         -------------------clean-- without range check------------------
    public List<Integer> findAnagrams(String s, String p) {
        int[] base = new int[26];
        int[] window = new int[26];
        List<Integer> result = new ArrayList<>();


        for(int i = 0; i < p.length(); i++){
            window[p.charAt(i) - 'a']++;
        }

        int k = 0;
        for(int j = 0; j < s.length(); j++){
            base[s.charAt(j) - 'a']++;

            if(j - k + 1 > p.length()){
                base[s.charAt(k++) - 'a']--;
            }
            if(Arrays.equals(base, window)){
                result.add(j - p.length() + 1);
            }
        }
        return result;

    }

    //         -----------------easy to understand--------------
    public List<Integer> findAnagrams2(String s, String p) {
        int[] base = new int[26];
        int[] window = new int[26];
        List<Integer> result = new ArrayList<>();

        if(s.length() < p.length()){
            return result;
        }

        for(int i = 0; i < p.length(); i++){
            base[s.charAt(i) - 'a']++;
            window[p.charAt(i) - 'a']++;
        }
        if(Arrays.equals(base, window)){
            result.add(0);
        }

        for(int j = 1; j < s.length() - p.length() + 1; j++){
            base[s.charAt(j-1) - 'a']--;
            base[s.charAt(j + p.length() - 1) - 'a']++;
            if(Arrays.equals(base, window)){
                result.add(j);
            }
        }
        return result;

    }
}
