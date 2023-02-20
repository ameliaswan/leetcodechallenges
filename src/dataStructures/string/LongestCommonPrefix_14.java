package dataStructures.string;

public class LongestCommonPrefix_14 {
    /**
     * This method uses the substring of 1st element to check if it's common prefix of rest of elements in input param.
     * @param strs
     * the input array of String
     * @return the longestCommonPrefix
     */
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        StringBuilder sb = new StringBuilder();
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
            sb.append(ch);
        }

        return sb.toString();
    }

    /**
     * This method uses binary search to find the longest common prefix.
     * Based on the shortest String (since the minlen is the upper limit length of common prefix).
     * @param strs
     * the input array of String
     * @return the longestCommonPrefix
     * begin: the beginning index of common prefix
     * end: the end index of common prefix
     * The convertable str will be strs[0].substring(0, mid+1)
     * loop each elements in strs to check if current substring is common then change begin/end
     * Time complexity is O(n * log(minlen))
     * Space complexity is O(1)
     */

    public String longestCommonPrefix_binarysearch(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        String sb = strs[0];
        int minlen = Integer.MAX_VALUE;
        for(String str : strs){
            minlen = Math.min(str.length(), minlen);
        }
        int begin = 0, end = minlen-1, mid = begin + (end-begin)/2;
        while(begin <= end){
            if(isCommonPrefix(mid, strs)){
                begin = mid + 1;
            }else{
                end = mid - 1;
            }
            mid = begin + (end-begin)/2;
        }
        return sb.substring(0, begin);
    }

    /**
     * This method checks if strs[0].substring(0, mid+1) is common prefix for the rest of elements in strs
     * @param mid
     * The middle index
     * @param strs
     * the input array of String
     * @return true/false
     */
    private boolean isCommonPrefix(int mid, String[] strs){
        String commonstr = strs[0].substring(0, mid+1);
        int j = 1;
        while(j < strs.length){
            if(strs[j].indexOf(commonstr) != 0){
                return false;
            }
            j++;
        }
        return true;
    }
}
