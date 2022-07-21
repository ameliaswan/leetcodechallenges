package dataStructures.slidingWindow;


//https://leetcode.com/problems/longest-repeating-character-replacement/
public class LongestRepeatingCharacterReplacement_424_M {

    public int characterReplacement(String s, int k) {
        if(s.length() < 1){
            return 0;
        }
        int max = 1;
        int pivot = 0;
        int tk = k;
        int tmp = 1;

        // for(int i = 1; i < s.length(); i++){
        int i = pivot + 1;
        while(i < s.length()){
            if(s.charAt(i) != s.charAt(pivot)){
                if(tk > 0){
                    tk--;
                    tmp++;
                    max = Math.max(max, tmp);
                }else{
                    tmp = 1;
                    pivot++;
                    if(s.length() - pivot <= max){
                        break;
                    }
                    i = pivot + 1;
                    tk = k;
                    continue;
                }
            }else{
                tmp++;
                max = Math.max(max, tmp);

            }
            i++;
        }

        return max;
    }
}
