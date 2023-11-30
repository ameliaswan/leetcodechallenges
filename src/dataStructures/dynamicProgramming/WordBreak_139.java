package dataStructures.dynamicProgramming;

import java.util.List;

public class WordBreak_139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        if(s.length() == 0) return true;
        for(int i = 0; i <= s.length(); i++){
            String left = s.substring(0, i);
            if(wordDict.contains(left) && wordBreak(s.substring(i), wordDict)){
                return true;
            }
        }
        return false;

    }
}
