public class t26 {
}

//针对树的遍历问题,先序遍历



//class TreeNode {
//      int val;
//      TreeNode left;
//      TreeNode right;
//      TreeNode(int x) { val = x; }
//  }
//
//
//class Solution {
//    public boolean isSubStructure(TreeNode A, TreeNode B) {
////递归判断是否与结点符合. 递归三种情况(目前结点,左子节点,右子节点)
//        return (A != null && B != null) && (recur(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B));
//    }
//    boolean recur(TreeNode A, TreeNode B) {
//        if(B == null) return true;
//        if(A == null || A.val != B.val) return false;
//        return recur(A.left, B.left) && recur(A.right, B.right);
//    }
//}