package dataStructures.heap;

import java.util.*;
import java.util.stream.Collectors;

public class LastStoneWeight_1046 {

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : stones){
            queue.add(i);
        }

        while(queue.size() > 1){
            int biggest = queue.poll();
            int bigger = queue.poll();
            int delta = biggest - bigger;
            queue.add(delta);
        }

        return queue.peek();

    }



    public int lastStoneWeight2(int[] stones) {
        List<Integer> list = Arrays.stream(stones).boxed()
                                    .collect(Collectors.toList());
        return smashAndReorder(list);
    }

    public int smashAndReorder(List<Integer> list){
        if(list.size() == 1){
            return list.get(0);
        }
        Collections.sort(list);
        Collections.reverse(list);

        int delta = Math.abs(list.get(0) - list.get(1));
        list.remove(0);
        list.remove(0);
        list.add(delta);
        return smashAndReorder(list);
    }
}
