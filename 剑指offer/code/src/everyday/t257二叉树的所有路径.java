package everyday;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class t257二叉树的所有路径 {
}


//比较简单的一道题
//直接利用深度遍历即可
//class TreeNode {
//      int val;
//      TreeNode left;
//      TreeNode right;
//      TreeNode(int x) { val = x; }
//  }
//
//class Solution {
//    public List<String> binaryTreePaths(TreeNode root) {
//        List<String> paths = new ArrayList<String>();
//        constructPaths(root, "", paths);
//        return paths;
//    }
//
//    public void constructPaths(TreeNode root, String path, List<String> paths) {
//        if (root != null) {
//            StringBuffer pathSB = new StringBuffer(path);
//            pathSB.append(Integer.toString(root.val));
//            if (root.left == null && root.right == null) {  // 当前节点是叶子节点
//                paths.add(pathSB.toString());  // 把路径加入到答案中
//            } else {
//                pathSB.append("->");  // 当前节点不是叶子节点，继续递归遍历
//                constructPaths(root.left, pathSB.toString(), paths);
//                constructPaths(root.right, pathSB.toString(), paths);
//            }
//        }
//    }
//}
