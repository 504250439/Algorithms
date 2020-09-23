package everyday;

import 算法模板.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class t103二叉树的锯齿形层次遍历 {
}

//可以利用链表来做 区别就在于再前面插入还是后面插入的区别
//class Solution {
//    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
//        List<List<Integer>> result = new ArrayList<>();
//        if (root == null)
//            return result;
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.add(root);
//        // 记录是否反转
//        boolean isReverse = false;
//        while (!queue.isEmpty()) {
//            LinkedList<Integer> oneLevel = new LinkedList<>();
//            // 每次都取出一层的所有数据
//            int count = queue.size();
//            for (int i = 0; i < count; i++) {
//                TreeNode node = queue.poll();
//                if (!isReverse)
//                    oneLevel.add(node.val);
//                else
//                    oneLevel.addFirst(node.val);
//                if (node.left != null)
//                    queue.add(node.left);
//                if (node.right != null)
//                    queue.add(node.right);
//            }
//            isReverse = !isReverse;
//            result.add(oneLevel);
//        }
//        return result;
//    }
//}
