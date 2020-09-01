package offer;

import java.util.*;


public class t323 {
}

//前面3道题都是关于树的遍历的,注意他们的变化即可
//class TreeNode {
//      int val;
//      TreeNode left;
//      TreeNode right;
//      TreeNode(int x) { val = x; }
//  }
//
//class Solution {
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        //边界条件判断
//        if (root == null)
//            return new ArrayList<>();
//        //队列
//        Queue<TreeNode> queue = new LinkedList<>();
//        List<List<Integer>> res = new ArrayList<>();
//        //根节点入队
//        queue.add(root);
//        boolean lefts=true;
//
//        //如果队列不为空就继续循环
//        while (!queue.isEmpty()) {
//            //BFS打印，levelNum表示的是每层的结点数
//            int levelNum = queue.size();
//            //subList存储的是每层的结点值
//            List<Integer> subList = new ArrayList<>();
//            for (int i = 0; i < levelNum; i++) {
//                //出队
//                TreeNode node = queue.poll();
//                subList.add(node.val);
//                //左右子节点如果不为空就加入到队列中
//                if (node.left != null)
//                    queue.add(node.left);
//                if (node.right != null)
//                    queue.add(node.right);
//            }
//            //把每层的结点值存储在res中，
//            if (lefts){
//                res.add(subList);
//                lefts=false;
//            }else{
//                Collections.reverse(subList);
//                res.add(subList);
//                lefts=true;
//            }
//
//        }
//        return res;
//    }
//}
