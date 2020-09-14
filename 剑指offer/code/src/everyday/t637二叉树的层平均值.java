package everyday;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class t637二叉树的层平均值 {
}




//层序遍历来做
//class Solution {
//    public List<Double> averageOfLevels(TreeNode root) {
//        List<Double> res = new ArrayList<>();
//
//        Queue<TreeNode> queue = new ArrayDeque<>();
//        if (root != null) {
//            queue.add(root);
//        }
//        while (!queue.isEmpty()) {
//            int n = queue.size();
//            double level=0;
//            for (int i = 0; i < n; i++) {
//                TreeNode node = queue.poll();
//                level+=node.val;
//                if (node.left != null) {
//                    queue.add(node.left);
//                }
//                if (node.right != null) {
//                    queue.add(node.right);
//                }
//            }
//            res.add(level/n);
//        }
//
//        return res;
//
//
//
//    }
//}