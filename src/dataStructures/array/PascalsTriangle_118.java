package dataStructures.array;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle_118 {

    /**
     * This method generate Pascal's Triangle, shown as below:
     *     1
     *    1 1
     *   1 2 1
     *  1 3 3 1
     * 1 4 6 4 1
     * @param numRows input number requires the number of rows
     * @return a List that contains numRows Lists
     * Time complexity: O(n^2), Space complexity: O(n^2)
     */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for(int i = 0; i < numRows; i++){
            List<Integer> row = new ArrayList<>();
            int k = 0;
            //for ith row, there are (i + 1) elements
            while(k < i+1){
                //the elements are both 1 at the 1st and last index of each row
                if(k == i || k == 0) {
                    row.add(k++, 1);
                    continue;
                }
                //each of the rest of the number at index k, equals to the sum of (k-1)th and kth number in the row above
                int insertNum = triangle.get(i - 1).get(k-1) + triangle.get(i - 1).get(k);
                row.add(k++, insertNum);
            }

            triangle.add(i, row);
        }
        return triangle;
    }
}
