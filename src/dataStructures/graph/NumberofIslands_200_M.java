package dataStructures.graph;

//https://leetcode.com/problems/number-of-islands/
public class NumberofIslands_200_M {
    public int numIslands(char[][] grid) {
        int num = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    num++;
                    drawIsland(grid, i, j);
                }
            }
        }
        return num;
    }

    public void drawIsland(char[][] grid, int r, int c){
        if(r >= 0 && r < grid.length && c >= 0 && c < grid[0].length && grid[r][c] == '1'){
            grid[r][c] = '0';
            drawIsland(grid, r-1, c);
            drawIsland(grid, r+1, c);
            drawIsland(grid, r, c-1);
            drawIsland(grid, r, c+1);
        }
    }
}
