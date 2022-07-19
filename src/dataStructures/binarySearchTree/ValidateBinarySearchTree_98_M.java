package dataStructures.binarySearchTree;


import dataStructures.utilClasses.TreeNode;

//https://leetcode.com/problems/validate-binary-search-tree/


public class ValidateBinarySearchTree_98_M {
    public boolean isValidBST(TreeNode root) {

        return traverseTree(root, -Double.MAX_VALUE, Double.MAX_VALUE);

    }

    public boolean traverseTree(TreeNode root, double lower, double higher){
        if(root == null){
            return true;
        }
        if(root.val <= lower || root.val >= higher){
            return false;
        }
        return traverseTree(root.left, lower, root.val)&&traverseTree(root.right, root.val, higher);
    }
}
