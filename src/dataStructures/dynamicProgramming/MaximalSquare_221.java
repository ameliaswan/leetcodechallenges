package dataStructures.dynamicProgramming;

public class MaximalSquare_221 {
    public int maximalSquare(char[][] matrix) {
        int sqr = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(i == 0  || j == 0) sqr = Math.max(matrix[i][j]-'0', sqr) ;
                else if(matrix[i][j] == '1'){
                    int tmp = Math.min(matrix[i-1][j]-'0', Math.min(matrix[i-1][j-1]-'0', matrix[i][j-1]-'0'))+1;
                    sqr = Math.max(sqr, tmp);
                    matrix[i][j] = (char)('0' + tmp);
                }

            }
        }
        return (int)Math.pow(sqr, 2);
    }
}
