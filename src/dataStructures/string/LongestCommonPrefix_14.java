package dataStructures.string;

public class LongestCommonPrefix_14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        StringBuffer sb = new StringBuffer();
        int len = strs[0].length();
        for(int i = 0; i < len ; i++){
            char ch = strs[0].charAt(i);
            int j = 1;
            while(j < strs.length){
                if(i > strs[j].length()-1 || ch != strs[j].charAt(i)){
                    return sb.toString();
                }
                j++;
            }
            sb.append(String.valueOf(ch));
        }

        return sb.toString();
    }
}
