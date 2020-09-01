package offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class t34 {
}



//直接递归遍历即可

//class TreeNode {
//      int val;
//      TreeNode left;
//      TreeNode right;
//      TreeNode(int x) { val = x; }
//  }
//class Solution {
//    LinkedList<List<Integer>> res = new LinkedList<>();
//    LinkedList<Integer> path = new LinkedList<>();
//    public List<List<Integer>> pathSum(TreeNode root, int sum) {
//        recur(root, sum);
//        return res;
//    }
//    void recur(TreeNode root, int tar) {
//        if(root == null) return;
//        path.add(root.val);
//        tar -= root.val;
//        if(tar == 0 && root.left == null && root.right == null)
//            res.add(new LinkedList(path));
//        recur(root.left, tar);
//        recur(root.right, tar);
//        path.removeLast();
//    }
//}
//
