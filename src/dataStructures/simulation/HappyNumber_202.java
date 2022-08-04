package dataStructures.simulation;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/happy-number/
public class HappyNumber_202 {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int sum = n;

        while(sum != 1 && !set.contains(sum)){
            set.add(sum);

            int sumTmp = 0;
            while(sum > 0){
                int digit = sum % 10;
                sumTmp += digit * digit;
                sum /= 10;
            }
            sum = sumTmp;
        }

        return sum == 1;
    }
}
