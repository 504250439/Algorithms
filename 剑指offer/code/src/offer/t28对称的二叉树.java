package offer;

import javax.swing.*;

public class t28对称的二叉树 {
}



//直接利用递归去判断
//class TreeNode {
//      int val;
//      TreeNode left;
//      TreeNode right;
//      TreeNode(int x) { val = x; }
//  }
//class Solution {
//    public boolean isSymmetric(TreeNode root) {
//        return root==null?true:recur(root.left,root.right);
//    }
//
//    boolean recur(TreeNode A, TreeNode B) {
//        if (A == null && B == null){
//            return true;
//        }else if (A==null || B==null || A.val != B.val){
//            return false;
//        }
//
//        return recur(A.left, B.right) && recur(A.right,B.left);
//
//    }
//
//
//}


