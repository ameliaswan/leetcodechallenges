package dataStructures.hashMap;

import java.util.HashMap;
import java.util.List;

public class BullsandCows_299_M {

    public String getHint(String secret, String guess) {

        HashMap<Character, Integer> map = new HashMap<>();
        int bulls =  0, cows = 0;

        for(int i = 0; i < guess.length(); i++){
            char a = secret.charAt(i);
            char b = guess.charAt(i);
            if(a == b){
                bulls++;
            }else{
                map.put(a, map.getOrDefault(a, 0) + 1);
            }
        }

        for(int j = 0; j < secret.length(); j++){
            char a = secret.charAt(j);
            char b = guess.charAt(j);
            if(a != b && map.getOrDefault(b, 0) > 0){
                cows++;
                map.put(b, map.get(b)-1);
            }
        }

        return bulls + "A" + cows + "B";

    }

//----------------------- must faster

    public String getHint2(String secret, String guess) {

        int[] s = new int[10];
        int[] g = new int[10];

        int bulls =  0, cows = 0;

        for(int i = 0; i < guess.length(); i++){
            char a = secret.charAt(i);
            char b = guess.charAt(i);
            if(a == b){
                bulls++;
            }else{
                s[a - '0']++;
                g[b - '0']++;
            }
        }

        for(int j = 0; j < 10; j++){
            cows += Math.min(s[j], g[j]);
        }
        return bulls + "A" + cows + "B";

    }
}
