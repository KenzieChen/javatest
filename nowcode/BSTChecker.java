//题目描述

//请实现一个函数，检查一棵二叉树是否为二叉查找树。
//给定树的根结点指针TreeNode* root，请返回一个bool，代表该树是否为二叉查找树。
import java.util.*;

/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}*/
public class BSTChecker {
    public boolean checkBST(TreeNode root) {
        // write code here
        if(root == null) return true;
        boolean checkLeft = true;
        boolean checkRight = true;
        if(root.left != null && root.left.val>root.val){
            checkLeft = false;
        }
        
        if(root.right!=null && root.right.val<root.val){
            checkRight = false;
        }
        
        return checkLeft && checkRight && checkBST(root.left) && checkBST(root.right);
    }
}
