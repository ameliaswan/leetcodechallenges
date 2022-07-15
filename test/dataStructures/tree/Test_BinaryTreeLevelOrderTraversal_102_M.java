package dataStructures.tree;

import dataStructures.utilClasses.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class Test_BinaryTreeLevelOrderTraversal_102_M {
    @Test
    void testCase1(){
        TreeNode root = new TreeNode(3,
                            new TreeNode(9),
                            new TreeNode(20,
                                    new TreeNode(15), new TreeNode(7)));

        List<List<Integer>> result = Arrays.asList(Arrays.asList(3), Arrays.asList(9,20),Arrays.asList(15,7));

        BinaryTreeLevelOrderTraversal_102_M var = new BinaryTreeLevelOrderTraversal_102_M();
        List<List<Integer>> expect = var.levelOrder(root);

        Assertions.assertEquals(result, expect);

    }

    @Test
    void testCase2(){
        TreeNode root = new TreeNode(1,
                null,
                new TreeNode(2));

        List<List<Integer>> result = Arrays.asList(Arrays.asList(1), Arrays.asList(2));

        BinaryTreeLevelOrderTraversal_102_M var = new BinaryTreeLevelOrderTraversal_102_M();
        List<List<Integer>> expect = var.levelOrder(root);

        Assertions.assertEquals(result, expect);

    }
}
