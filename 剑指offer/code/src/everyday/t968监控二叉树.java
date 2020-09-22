package everyday;

import 算法模板.TreeNode;

public class t968监控二叉树 {
}


//同样的,相当于前序遍历二叉树,三种状态,0未初始化 1 监视状态,2有摄像头
//class Solution {
//    int cameras=0;
//    public int minCameraCover(TreeNode root) {
//        TreeNode dummyHead = new TreeNode(0);
//        dummyHead.left = root;
//        dfs(dummyHead);
//        return cameras;
//    }
//
//    private int dfs(TreeNode node){
//        if (node == null) return 0;
//
//        int l = dfs(node.left);
//        int r = dfs(node.right);
//
//        if (l + r == 0)
//            return 1;
//        else if (l == 1 || r == 1) {
//            cameras ++; return 2;
//        } else
//            return 0;
//    }
//
//}