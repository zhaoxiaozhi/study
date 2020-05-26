package com.study.arethmetic.leet.sample1;


import com.study.arethmetic.leet.util.TreeNode;

import java.util.LinkedList;

/**
 * 翻转二叉树
 */
public class Solution226 {

    public TreeNode invertTree1(TreeNode root) {
        if (root == null){
            return null;
        }
        //节点左右子树交换
        TreeNode tmp = root.right;
        root.right = root.left;
        root.left = tmp;
        //递归交换当前节点的左子树
        invertTree1(root.left);
        //递归交换当前节点的右子树
        invertTree1(root.right);

        return root;
    }

    public TreeNode invertTree2(TreeNode root){

        if (root == null){
            return null;
        }
        //将二叉树中的节点逐层放入队列中，再迭代处理队列中的元素
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode tmp = queue.poll();
            TreeNode left = tmp.left;
            tmp.left = tmp.right;
            tmp.right = left;
            //如果当前节点的左子树不为空，则放入队列等待后续处理
            if (tmp.left != null){
                queue.add(tmp.left);
            }
            //如果当前节点的右子树不为空，则放入队列等待后续处理
            if (tmp.right != null){
                queue.add(tmp.right);
            }
        }
        return root;
    }


}
