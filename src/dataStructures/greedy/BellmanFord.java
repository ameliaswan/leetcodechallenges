package dataStructures.greedy;

import java.util.Arrays;

//@author Kooni Wang 1322454
public class BellmanFord {
    static class Edge{
        int source, destination, weight;
        public Edge(int source, int destination, int weight){
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    public void findShortestDistance(int vertexNum, int edgeNum, Edge[] edges){
        int[] distance = new int[vertexNum];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[0] = 0;
        //1. Run the relaxation for (vertexNum - 1) times
        for(int i = 1; i < vertexNum; i++){
            for(int j = 0; j < edgeNum; j++){
                Edge tmp = edges[j];
                if(distance[tmp.source] != Integer.MAX_VALUE
                        && distance[tmp.source] + tmp.weight < distance[tmp.destination]){
                    distance[tmp.destination] = distance[tmp.source] + tmp.weight;
                }
            }
        }

        //2. Run the relaxation 1 time again to check if the cycle exist;
            //If no cycle then print the shortest distance for each vertex; else there's no result
        for(int k = 0; k < edgeNum; k++){
            Edge tmp = edges[k];
            if(distance[tmp.source] != Integer.MAX_VALUE
                    && distance[tmp.source] + tmp.weight < distance[tmp.destination]){
                System.out.println("The graph has negative-weighted cycle!");
                return;
            }
        }

        System.out.println("Kooni Wang 1322454");
        for(int m = 0; m < distance.length; m++){
            System.out.println(m + ":" + distance[m]);
        }
    }
    public static void main(String[] args) {
        int vertexNum = 7;
        int edgeNum = 10;

        Edge[] edges = new Edge[edgeNum];
        edges[0] = new Edge(0, 1, 6);
        edges[1] = new Edge(1, 4, -1);
        edges[2] = new Edge(4, 6, 3);
        edges[3] = new Edge(0, 2, 5);
        edges[4] = new Edge(2, 1, -2);
        edges[5] = new Edge(2, 4, 1);
        edges[6] = new Edge(0, 3, 5);
        edges[7] = new Edge(3, 2, -2);
        edges[8] = new Edge(3, 5, -1);
        edges[9] = new Edge(5, 6, 3);

        BellmanFord var = new BellmanFord();
        var.findShortestDistance(vertexNum, edgeNum, edges);
    }
}
