package everyday;


import java.util.*;

public class t102二叉树的层序遍历 {
}



//class TreeNode {
//      int val;
//      TreeNode left;
//      TreeNode right;+

//      TreeNode(int x) { val = x; }
//  }


//  二叉树的层序遍历 利用队列来实现
//class Solution {
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        List<List<Integer>> res = new ArrayList<>();
//
//        Queue<TreeNode> queue = new ArrayDeque<>();
//        if (root != null) {
//            queue.add(root);
//        }
//        while (!queue.isEmpty()) {
//            int n = queue.size();
//            List<Integer> level = new ArrayList<>();
//            for (int i = 0; i < n; i++) {
//                TreeNode node = queue.poll();
//                level.add(node.val);
//                if (node.left != null) {
//                    queue.add(node.left);
//                }
//                if (node.right != null) {
//                    queue.add(node.right);
//                }
//            }
//            res.add(level);
//        }
//
//        return res;
//
//    }
//}