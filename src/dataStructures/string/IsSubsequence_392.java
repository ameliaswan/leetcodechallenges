package dataStructures.string;

public class IsSubsequence_392 {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0){
            return true;
        }

        int idS = 0, idT = 0;

        for(; idT < t.length(); idT++){
            if(t.charAt(idT) == s.charAt(idS)){
                idS++;
            }
            if(idS == s.length()){
                return true;
            }
        }
        return false;
    }
}
