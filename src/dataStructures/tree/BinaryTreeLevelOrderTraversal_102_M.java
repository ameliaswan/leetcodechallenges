package dataStructures.tree;


import dataStructures.utilClasses.TreeNode;

import java.util.*;

//https://leetcode.com/problems/binary-tree-level-order-traversal/

public class BinaryTreeLevelOrderTraversal_102_M {
//    beat 93%
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> resultList = new ArrayList<List<Integer>>();
        traverse(root, 0, resultList);
        return resultList;
    }

    public void traverse(TreeNode root, int lvl, List<List<Integer>> list){
        if(root == null){
            return;
        }

        if(lvl == list.size()){
            List<Integer> lvlList = new ArrayList<Integer>();
            lvlList.add(root.val);
            list.add(lvlList);
        }else{
            list.get(lvl).add(root.val);
        }


        lvl++;
        traverse(root.left, lvl, list);
        traverse(root.right, lvl, list);

    }


//    only beat 35%
    public List<List<Integer>> levelOrder2(TreeNode root) {
        List<List<Integer>> resultList = new ArrayList<List<Integer>>();
        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();

        if(root == null){
            return resultList;
        }

        traverse2(root, 0, map);

        for(int i = 0; i <= map.keySet().size(); i++){
            if(map.containsKey(i)){
                resultList.add(map.get(i));
            }else{
                break;
            }
        }


        return resultList;
    }

    public void traverse2(TreeNode root, int lvl, Map<Integer, List<Integer>> map){
        if(root == null){
            return;
        }
        List<Integer> lvlList = map.containsKey(lvl) ? map.get(lvl) : new ArrayList<Integer>();
        lvlList.add(root.val);
        map.put(lvl, lvlList);

        lvl++;
        traverse2(root.left, lvl, map);
        traverse2(root.right, lvl, map);


    }
}
