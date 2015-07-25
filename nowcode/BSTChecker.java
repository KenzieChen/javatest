//��Ŀ����

//��ʵ��һ�����������һ�ö������Ƿ�Ϊ�����������
//�������ĸ����ָ��TreeNode* root���뷵��һ��bool����������Ƿ�Ϊ�����������
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
