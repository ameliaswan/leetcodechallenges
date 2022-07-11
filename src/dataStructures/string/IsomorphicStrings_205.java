package dataStructures.string;


import java.util.Arrays;
import java.util.HashMap;

//https://leetcode.com/problems/isomorphic-strings/

public class IsomorphicStrings_205 {

    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] arrS = new int[256];
        Arrays.fill(arrS, -1);

        int[] arrT = new int[256];
        Arrays.fill(arrT, -1);

        for(int i = 0; i < s.length(); i++){
            char sEle = s.charAt(i);
            char tEle = t.charAt(i);

            if(arrS[sEle] == -1 && arrT[tEle] == -1) {
                arrS[sEle] = tEle;
                arrT[tEle] = sEle;
            }else{
                if(arrS[sEle] > -1 && arrS[sEle] != tEle){
                    return false;
                }
                if(arrT[tEle] > -1 && arrT[tEle] != sEle){
                    return false;
                }
            }
        }

        return true;
    }





    public boolean isIsomorphic2(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap mappingS = new HashMap<Character, Character>();
        HashMap mappingT = new HashMap<Character, Character>();
        for(int i = 0; i < s.length(); i++){
            Character sEle = s.charAt(i);
            Character tEle = t.charAt(i);

            if(mappingS.containsKey(sEle) || mappingT.containsKey(tEle)){
                if(mappingS.get(sEle) != null && !mappingS.get(sEle).equals(tEle) || mappingT.get(tEle) != null && !mappingT.get(tEle).equals(sEle)){
                    return false;
                }
            }else{
                mappingS.put(sEle, tEle);
                mappingT.put(tEle, sEle);
            }
        }
        return true;
    }

}
