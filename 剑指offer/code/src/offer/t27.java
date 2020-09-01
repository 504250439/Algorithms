package offer;

import sun.reflect.generics.tree.Tree;

import javax.management.Query;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class t27 {
}



//class TreeNode {
//      int val;
//      TreeNode left;
//      TreeNode right;
//      TreeNode(int x) { val = x; }
//  }
//  递归实现
//class Solution {
//    public TreeNode mirrorTree(TreeNode root) {
//        if (root == null) {
//            return null;
//        }
//
//        TreeNode leftnode=mirrorTree(root.left);
//        TreeNode rightnode=mirrorTree(root.right);
//        root.left=rightnode;
//        root.right=leftnode;
//        return root;
//
//
//    }
//}

//使用队列来实现
//class Solution {
//    public TreeNode mirrorTree(TreeNode root) {
//        if (root==null){
//            return root;
//        }
//
//
//        Queue<TreeNode> queue = new LinkedList<TreeNode>();
//        queue.add(root);
//        TreeNode tmp;
//        while (!queue.isEmpty()){
//            TreeNode cur=queue.remove();
//            if (cur.left != null) {
//                queue.add(cur.left);
//            }
//            if (cur.right!=null){
//                queue.add(cur.right);
//            }
//            tmp=cur.left;
//            cur.left=cur.right;
//            cur.right=tmp;
//        }
//
//        return root;
//
//    }
//}