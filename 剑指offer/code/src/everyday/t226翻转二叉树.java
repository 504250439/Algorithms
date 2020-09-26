package everyday;

import 算法模板.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class t226翻转二叉树 {
}

//直接交换左右指针即可
//利用队列来判断是否遍历完
//class Solution22 {
//    public TreeNode invertTree(TreeNode root) {
//
//        Queue<TreeNode> queue=new LinkedList<>();
//
//        if (root != null) {
//            queue.add(root);
//        }
//
//
//        while (!queue.isEmpty()) {
//            TreeNode cur=queue.poll();
//            if (cur.left != null &&cur.right!=null) {
//                TreeNode tmpl=cur.left;
//                cur.left=cur.right;
//                cur.right=tmpl;
//                queue.add(cur.left);
//                queue.add(cur.right);
//            } else if (cur.left != null) {
//                cur.right=cur.left;
//                cur.left=null;
//                queue.add(cur.right);
//            } else if (cur.right != null) {
//                cur.left=cur.right;
//                cur.right=null;
//                queue.add(cur.left);
//            }
//        }
//
//        return root;
//
//    }
//}
//
////递归的实现方法,更加简短
//class Solution33 {
//    public TreeNode invertTree(TreeNode root) {
//        if (root == null) {
//            return null;
//        }
//        TreeNode left = invertTree(root.left);
//        TreeNode right = invertTree(root.right);
//        root.left = right;
//        root.right = left;
//        return root;
//    }
//}

