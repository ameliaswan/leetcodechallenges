package dataStructures.heap;

import java.util.*;
import java.util.stream.Collectors;

public class TopKFrequentWords_692_M {

    public List<String> topKFrequent(String[] words, int k) {
        List<String> result = new ArrayList<>();
        Queue<Map.Entry<String, Integer>> queue = new PriorityQueue<>((a, b)
                                                                        -> a.getValue() == b.getValue() ? a.getKey().compareTo(b.getKey()) : Integer.compare(b.getValue(), a.getValue()));
        Map<String, Integer> map = new HashMap<>();
        for(String st : words){
            map.put(st, map.getOrDefault(st, 0) + 1);
        }
        for(Map.Entry<String, Integer> m : map.entrySet()){
            queue.add(m);
        }
        while(k > 0){
            result.add(queue.poll().getKey());
            k--;
        }
        return result;
    }




    public List<String> topKFrequent2(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        List<String> result = new ArrayList<>();
        for(String str : words){
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<String> queueStr = new PriorityQueue<>();
        for(Integer i : map.values()){
            queue.add(i);
        }

        int before = -1;
        while(!queue.isEmpty()){
            int current = queue.poll();
            while(current == before && queue.size() > 0){
                current = queue.poll();
            }
            if(current == before && queue.size() == 0){
                break;
            }
            for(String key : map.keySet()){
                if(map.get(key) == current){
                    queueStr.add(key);
                }
            }

            while(queueStr.size() > 0){
                result.add(queueStr.poll());
            }

            before = current;

        }

        return result.subList(0, k);

    }
}
