package offer;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class t36 {
}


class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};

//直接思路,先用中序遍历数组,将结点放到队列当中
//再遍历队列来构建循环列表
//class Solution {
//    public Node treeToDoublyList(Node root) {
//        if (root == null) {
//            return root;
//        }
//        Queue<Node> queue=new LinkedBlockingDeque<>();
////        中序遍历,得到递增队列
//        queue=dfs(root,queue);
//
////        先将第一个结点pop出来,方便操作
//        Node head=queue.remove();
//        Node pre=head;
//        Node cur=head;
//        while (!queue.isEmpty()){
//            cur=queue.remove();
////            上一个结点的右节点指到当前结点
//            pre.right=cur;
////            当前结点的左结点指到上一个结点
//            cur.left=pre;
//            pre=cur;
//        }
////        最后将第一个结点与最后一个结点相连
//        head.left=pre;
//        pre.right=head;
//        return head;
//    }
//
//    public Queue dfs(Node root,Queue queue){
//        if (root == null) {
//            return null;
//        }
//
//        dfs(root.left,queue);
//        queue.add(root);
//        dfs(root.right,queue);
//
//        return queue;
//
//    }
//}

//聪明一点的方法,直接在做中序遍历的时候就直接修改他们的左右结点
//class Solution {
//    Node head, pre;
//    public Node treeToDoublyList(Node root) {
//        if(root==null) return null;
//        dfs(root);
//
//        pre.right = head;
//        head.left =pre;//进行头节点和尾节点的相互指向，这两句的顺序也是可以颠倒的
//
//        return head;
//
//    }
//
//    public void dfs(Node cur){
//        if(cur==null) return;
//        dfs(cur.left);
//
//        //pre用于记录双向链表中位于cur左侧的节点，即上一次迭代中的cur,当pre==null时，cur左侧没有节点,即此时cur为双向链表中的头节点
//        if(pre==null) head = cur;
//            //反之，pre!=null时，cur左侧存在节点pre，需要进行pre.right=cur的操作。
//        else pre.right = cur;
//
//        cur.left = pre;//pre是否为null对这句没有影响,且这句放在上面两句if else之前也是可以的。
//
//        pre = cur;//pre指向当前的cur
//        dfs(cur.right);//全部迭代完成后，pre指向双向链表中的尾节点
//    }
//}