package offer;

import java.util.HashMap;

public class t35复杂链表的复制 {
}



//关于链表的深拷贝
// Definition for a Node.
//class Node {
//    int val;
//    Node next;
//    Node random;
//
//    public Node(int val) {
//        this.val = val;
//        this.next = null;
//        this.random = null;
//    }
//}
//class Solution {
//    public Node copyRandomList(Node head) {
//        HashMap<Node,Node> map=new HashMap<>();
//        Node cur=head;
//        while (cur != null) {
//            map.put(cur,new Node(cur.val));
//            cur=cur.next;
//        }
//
//        cur = head;
//        while(cur!=null){
//            //得到get:<key>.value2,3
//            map.get(cur).next = map.get(cur.next); //新结点next指向同旧结点的next指向
//            map.get(cur).random = map.get(cur.random); //新结点random指向同旧结点的random指向
//            cur = cur.next;
//        }
//
//
//        //返回复制的链表
//        return map.get(head);
//
//    }
//}