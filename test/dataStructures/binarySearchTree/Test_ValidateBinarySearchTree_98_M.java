package dataStructures.binarySearchTree;

import dataStructures.utilClasses.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_ValidateBinarySearchTree_98_M {

    /*
    *       2
    *     1    3
    * */
    @Test
    void testCase1(){
        TreeNode root = new TreeNode(2,
                                    new TreeNode(1),
                                    new TreeNode(3));
        boolean result = true;
        ValidateBinarySearchTree_98_M var = new ValidateBinarySearchTree_98_M();
        boolean expect = var.isValidBST(root);

        Assertions.assertEquals(result, expect);
    }


    /*
     *       5
     *     1    4
     *         3 6
     * */
    @Test
    void testCase2(){
        TreeNode root = new TreeNode(5,
                new TreeNode(1),
                new TreeNode(4,
                            new TreeNode(3),
                            new TreeNode(6)));
        boolean result = false;
        ValidateBinarySearchTree_98_M var = new ValidateBinarySearchTree_98_M();
        boolean expect = var.isValidBST(root);

        Assertions.assertEquals(result, expect);
    }
}
