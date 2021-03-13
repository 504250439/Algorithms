package offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class t32从上到下打印二叉树 {
}



//class TreeNode {
//      int val;
//      TreeNode left;
//      TreeNode right;
//      TreeNode(int x) { val = x; }
//  }
//class Solution {
//    public int[] levelOrder(TreeNode root) {
//        if (root == null) {
//            return new int[0];
//        }
//        Queue<TreeNode> queue=new LinkedList<>();
//        queue.add(root);
//        ArrayList<Integer> list=new ArrayList<>();
//        while (!queue.isEmpty()){
//            root=queue.poll();
//            if (root.left != null) {
//                queue.add(root.left);
//            }
//            if (root.right != null) {
//                queue.add(root.right);
//            }
//            int a=root.val;
//            list.add(a);
//        }
//        int[] res=new int[list.size()];
//        int i=0;
//        for(Integer num:list){
//            res[i]=num;
//            i++;
//        }
//        return res;
//
//    }
//}