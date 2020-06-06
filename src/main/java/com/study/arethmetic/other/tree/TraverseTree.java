package com.study.arethmetic.other.tree;

import java.util.LinkedList;

public class TraverseTree {

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int v){
            val = v;
        }
    }

    public static int LaywerTraversal(TreeNode root){

        if (root == null){
            return 0;
        }
        LinkedList<TreeNode> list = new LinkedList<>();
        list.add(root);
        TreeNode currentNode;
        int i = 1;
        while (!list.isEmpty()){
            currentNode = list.poll();
            System.out.println(currentNode.val);
            if (currentNode.left != null){
                list.add(currentNode.left);
            }
            if (currentNode.right != null){
                list.add(currentNode);
            }
            i++;
        }
        return i;

    }


}
