package dataStructures.binarySearchTree;

import dataStructures.utilClasses.TreeNode;

public class LowestCommonAncestorofaBinarySearchTree_235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        int min = Math.min(p.val, q.val), max = Math.max(p.val, q.val);
        if(root == null){
            return null;
        }
        if(min <= root.val && root.val <= max){
            return root;
        }
        if(min > root.val){
            return lowestCommonAncestor(root.right, p, q);
        }
        if(max < root.val){
            return lowestCommonAncestor(root.left, p, q);
        }
        return null;
    }
}
