package dataStructures.stack;

//https://leetcode.com/problems/backspace-string-compare/
public class BackspaceStringCompare_844 {
    public boolean backspaceCompare(String s, String t) {

        return decodeString(s).equals(decodeString(t));


    }

    public String decodeString(String x){
        StringBuilder tmp = new StringBuilder();
        for(int i = 0; i < x.length(); i++){
            char c = x.charAt(i);
            if(c == '#'){
                if(tmp.length() > 0){
                    tmp.deleteCharAt(tmp.length()-1);
                }
            }else{
                tmp.append(c);
            }
        }
        return tmp.toString();
    }
}
