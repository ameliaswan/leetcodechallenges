package dataStructures.binarySearchTree;

import dataStructures.greedy.LongestPalindrome_409;
import dataStructures.utilClasses.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_LowestCommonAncestorofaBinarySearchTree_235 {

    /*
    *       6
    *    2     8
    *  0   4  7 9
    *     3 5
    *
    * p = 2, q = 8
    * */
    @Test
    void testCase1(){
        TreeNode p = new TreeNode(2,
                                new TreeNode(0),
                                new TreeNode(4,
                                        new TreeNode(3),
                                        new TreeNode(5)));
        TreeNode q = new TreeNode(8,
                                new TreeNode(7),
                                new TreeNode(9));
        TreeNode root = new TreeNode(6,
                                        new TreeNode(2,
                                                new TreeNode(0),
                                                new TreeNode(4,
                                                        new TreeNode(3),
                                                        new TreeNode(5))),
                                        new TreeNode(8,
                                                    new TreeNode(7),
                                                    new TreeNode(9))
                );
        int result = 6;

        LowestCommonAncestorofaBinarySearchTree_235 var = new LowestCommonAncestorofaBinarySearchTree_235();
        TreeNode expect = var.lowestCommonAncestor(root, p, q);

        Assertions.assertEquals(result, expect.val);
    }


    /*
     *       6
     *    2     8
     *  0   4  7 9
     *     3 5
     *
     * p = 2, q = 4
     * */
    @Test
    void testCase2(){
                TreeNode p = new TreeNode(2,
                                        new TreeNode(0),
                                        new TreeNode(4,
                                                new TreeNode(3),
                                                new TreeNode(5)));
                TreeNode q = new TreeNode(4,
                                        new TreeNode(3),
                                        new TreeNode(5));


                TreeNode root = new TreeNode(6,
                        new TreeNode(2,
                                new TreeNode(0),
                                new TreeNode(4,
                                        new TreeNode(3),
                                        new TreeNode(5))),
                        new TreeNode(8,
                                new TreeNode(7),
                                new TreeNode(9))
                );
                int result = 2;

                LowestCommonAncestorofaBinarySearchTree_235 var = new LowestCommonAncestorofaBinarySearchTree_235();
                TreeNode expect = var.lowestCommonAncestor(root, p, q);

                Assertions.assertEquals(result, expect.val);
    }


    /*
    *    2
    *  1
    *
    * p = 2, q = 1
    * */
    @Test
    void testCase3(){

                TreeNode root = new TreeNode(2,
                                            new TreeNode(1),
                                     null);
                TreeNode p = root;
                TreeNode q = new TreeNode(1);


                int result = 2;
                LowestCommonAncestorofaBinarySearchTree_235 var = new LowestCommonAncestorofaBinarySearchTree_235();
                TreeNode expect = var.lowestCommonAncestor(root, p, q);

                Assertions.assertEquals(result, expect.val);


    }
}
