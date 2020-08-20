import java.util.HashMap;

public class t05 {
}


class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }


//class Solution {
//    HashMap<Integer, Integer> dic = new HashMap<>();
//    int[] po;
//    public TreeNode buildTree(int[] preorder, int[] inorder) {
//        po = preorder;
//        for(int i = 0; i < inorder.length; i++)
//            dic.put(inorder[i], i);
//        return recur(0, 0, inorder.length - 1);
//    }
//    TreeNode recur(int pre_root, int in_left, int in_right) {
//        if(in_left > in_right) return null;
//        TreeNode root = new TreeNode(po[pre_root]);
//        int i = dic.get(po[pre_root]);
//        root.left = recur(pre_root + 1, in_left, i - 1);
////         **“i-in_left+preroot+1”，其实就是右子树根节点=(中序根节点坐标-中序左边界）+先序根节点坐标+1，
////         其中括号内=左子树长度,就是在先序列表中计算(左子树+根结点的位置再+1就是右子树的根结点了
//        root.right = recur(pre_root + i - in_left + 1, i + 1, in_right);
//        return root;
//    }
//}
//



//
//class Solution {
//    //利用原理,先序遍历的第一个节点就是根。在中序遍历中通过根 区分哪些是左子树的，哪些是右子树的
//    //左右子树，递归
//    HashMap<Integer, Integer> map = new HashMap<>();//标记中序遍历
//    int[] preorder;//保留的先序遍历
//
//    public TreeNode buildTree(int[] preorder, int[] inorder) {
//        this.preorder = preorder;
//        for (int i = 0; i < preorder.length; i++) {
//            map.put(inorder[i], i);
//        }
//        return recursive(0,0,inorder.length-1);
//    }
//
//    /**
//     * @param pre_root_idx  先序遍历的索引
//     * @param in_left_idx  中序遍历的索引
//     * @param in_right_idx 中序遍历的索引
//     */
//    public TreeNode recursive(int pre_root_idx, int in_left_idx, int in_right_idx) {
//        //相等就是自己
//        if (in_left_idx > in_right_idx) {
//            return null;
//        }
//        //root_idx是在先序里面的
//        TreeNode root = new TreeNode(preorder[pre_root_idx]);
//        // 有了先序的,再根据先序的，在中序中获 当前根的索引
//        int idx = map.get(preorder[pre_root_idx]);
//
//        //左子树的根节点就是 左子树的(前序遍历）第一个，就是+1,左边边界就是left，右边边界是中间区分的idx-1
//        root.left = recursive(pre_root_idx + 1, in_left_idx, idx - 1);
//
//        //由根节点在中序遍历的idx 区分成2段,idx 就是根
//
//        //右子树的根，就是右子树（前序遍历）的第一个,就是当前根节点 加上左子树的数量
//        // pre_root_idx 当前的根  左子树的长度 = 左子树的左边-右边 (idx-1 - in_left_idx +1) 。最后+1就是右子树的根了
//        root.right = recursive(pre_root_idx + (idx-1 - in_left_idx +1)  + 1, idx + 1, in_right_idx);
//        return root;
//    }
//}




