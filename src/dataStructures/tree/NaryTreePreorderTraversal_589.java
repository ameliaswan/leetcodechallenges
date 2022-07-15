package dataStructures.tree;

import dataStructures.utilClasses.Node;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/n-ary-tree-preorder-traversal/
public class NaryTreePreorderTraversal_589 {



    public List<Integer> preorder(Node root) {
        List<Integer> nodesPre = new ArrayList<Integer>();
        if(root == null){
            return nodesPre;
        }

        traverseTree(root, nodesPre);

        return nodesPre;

    }

    public void traverseTree(Node node, List<Integer> eleList){
        eleList.add(node.val);
        if(node.children != null){
            for(Node c : node.children){
                if(c != null){
                    traverseTree(c, eleList);
                }
            }
        }

    }
}
