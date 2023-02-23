package dataStructures.backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses_22 {
    /**
     * This method generate all combinations of parenthesis
     * @param n the pair of parenthsis
     * @return a list of String
     */
    public List<String> generateParenthesis(int n) {
        //The remaining number of left and right parenthesis are nL and nR
        //nL should always be not bigger than nR && when nL = nR = 0, it's the right answer
        List<String> result = new ArrayList<>();
        helper(n, n, new StringBuilder(), result);
        return result;
    }

    //backtracking method
    void helper(int nL, int nR, StringBuilder sb, List<String> list){
        //success condition
        if(nL == 0 && nR == 0){
            list.add(sb.toString());
            return;
        }
        //fail condition
        if(nL > nR){
            return;
        }

        //recursion
        if(nL > 0){
            helper(--nL, nR, sb.append("("), list);
            sb.deleteCharAt(sb.length()-1);
            //if delete "(", nL should increase by 1.
            nL++;
        }
        if(nR > 0){
            helper(nL, --nR, sb.append(")"), list);
            sb.deleteCharAt(sb.length()-1);
            //There's no need for nR to increase by 1, because this line will return and automatically increase 1 to nR
        }

    }
}
