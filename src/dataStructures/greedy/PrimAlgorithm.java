package dataStructures.greedy;

import java.util.Arrays;

//@author Kooni Wang 1322454
public class PrimAlgorithm {
    public int getMinVertext(int[] valueSet, boolean[] mstSet){
        int min = Integer.MAX_VALUE;
        int minIdx = -1;
        for(int i = 0; i < valueSet.length; i++){
            if(!mstSet[i] && valueSet[i] < min){
                min = valueSet[i];
                minIdx = i;
            }
        }
        return minIdx;
    }

    public void constructMST(int[][] adjMtx){
        int vNum = adjMtx.length;
        //MST set
        boolean[] mstSet = new boolean[vNum];
        //key set
        int[] valueSet = new int[vNum];
        //parent set
        int[] parent = new int[vNum];

        Arrays.fill(valueSet, Integer.MAX_VALUE);
        valueSet[0] = 0;

        for (int count = 0; count < vNum - 1; count++) {
            //Step 1: find the vertex with the minimum value, add it to the MST. Make it the current vertex
            int idx = getMinVertext(valueSet, mstSet);
            mstSet[idx] = true;
            //Step 2: check each adjacent vertices of current vertex, update their values if they're not in the MST yet
            for(int j = 0; j < vNum; j++){
                if(adjMtx[idx][j] != 0 && !mstSet[j] && adjMtx[idx][j] < valueSet[j]){
                    valueSet[j] = adjMtx[idx][j];
                    parent[j] = idx;
                }
            }
        }
        printMST(parent, adjMtx);

    }

    public void printMST(int[] parent, int[][] adjacentMatrix){
        System.out.println("Kooni Wang 1322454");
        for(int i = 1; i < parent.length; i++){
            System.out.print(parent[i] + "-" + i + " : " + adjacentMatrix[parent[i]][i] + "\n");
        }
    }
    public static void main(String[] args) {
        int[][] adjacencyMatrix = {
                { 0, 2, 0, 6, 0 },
                { 2, 0, 3, 8, 5 },
                { 0, 3, 0, 0, 7 },
                { 6, 8, 0, 0, 9 },
                { 0, 5, 7, 9, 0 } };
        PrimAlgorithm var = new PrimAlgorithm();
        var.constructMST(adjacencyMatrix);

    }
}
