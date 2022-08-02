package dataStructures.graph;

//https://leetcode.com/problems/flood-fill/

public class FloodFill_733 {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] != color){
            dsf(image, sr, sc, image[sr][sc], color);
        }
        return image;
    }

    public void dsf(int[][] image, int sr, int sc, int oriColor, int newColor){
        if(sr >= 0 && sr < image.length && sc >= 0 && sc < image[0].length && image[sr][sc] == oriColor){
            image[sr][sc] = newColor;
            dsf(image, sr - 1, sc, oriColor, newColor);
            dsf(image, sr + 1, sc, oriColor, newColor);
            dsf(image, sr, sc - 1, oriColor, newColor);
            dsf(image, sr, sc + 1, oriColor, newColor);
        }
    }
}
