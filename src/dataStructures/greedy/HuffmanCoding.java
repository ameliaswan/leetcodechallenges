package dataStructures.greedy;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

//author: Kooni Wang 1322454
public class HuffmanCoding {
    Map<String, Float> inputMap = new HashMap<>();
    Map<String, String> huffmanCodeMap = new HashMap<>();
    static class HuffmanNode implements Comparable<HuffmanNode>{
        String symbol;
        Float frequency;
        HuffmanNode left;
        HuffmanNode right;

        public HuffmanNode (String symbol, Float frequency, HuffmanNode left, HuffmanNode right){
            this.symbol = symbol;
            this.frequency = frequency;
            this.left = left;
            this.right = right;
        }

        public HuffmanNode (String symbol, Float frequency){
            this.symbol = symbol;
            this.frequency = frequency;
        }


        @Override
        public int compareTo(HuffmanNode node){
            float tmp = this.frequency - node.frequency;
            return tmp > 0 ?  1 : (tmp < 0 ?  -1 : this.symbol.compareTo(node.symbol) );
        }
    }

    public void buildHuffmanTree(Map<String, Float> input){
        this.inputMap = input;
        Queue<HuffmanNode> queue = new PriorityQueue<>();
        for(String s : inputMap.keySet()){
            queue.add(new HuffmanNode(s, inputMap.get(s)));
        }
        while(queue.size() > 1){
            HuffmanNode left = queue.poll();
            HuffmanNode right = queue.poll();
            HuffmanNode parent = new HuffmanNode("P", left.frequency + right.frequency, left, right);
            queue.add(parent);
        }
        HuffmanNode root = queue.poll();
        generateHuffmanCode(root, "");
    }

    private void generateHuffmanCode(HuffmanNode root, String code){
        if(root == null) return;
        if(root.symbol.equals("P")) huffmanCodeMap.put(root.symbol, code);
        generateHuffmanCode(root.left, code + "0");
        generateHuffmanCode(root.right, code + "1");
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Kooni Wang 1322454").append("\n");
        for(String s : huffmanCodeMap.keySet()){
            sb.append(s).append(" : ").append(huffmanCodeMap.get(s)).append("\n");
        }
        return sb.toString();
    }


    public static void main(String[] args){
        Map<String, Float> input = new HashMap<>();
        input.put("A", 0.35f);
        input.put("B", 0.1f);
        input.put("C", 0.2f);
        input.put("D", 0.2f);
        input.put("_", 0.15f);
        HuffmanCoding huffmanCoding = new HuffmanCoding();
        huffmanCoding.buildHuffmanTree(input);
        System.out.printf(huffmanCoding.toString());

    }

}
